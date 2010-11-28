package jaunty.qqmessage.ubuntu;

import jaunty.qqmessage.QQEvent;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.net.ServerSocketFactory;

import org.apache.log4j.Logger;

/**
 * @author hellojinjie
 * @version Jun 27, 2010 8:02:30 PM
 */
public class QQMessagePromptor implements Observer {

    private static final Logger log = Logger.getLogger(QQMessagePromptor.class);
    private TrayIcon trayIcon;
    /** have i read this new messge? */
    private boolean isGotIt = true;
    private Image trayImage;
    private Image newMessaeImage;

    public QQMessagePromptor() {
        SystemTray tray = SystemTray.getSystemTray();
        try {
            newMessaeImage = ImageIO.read(this.getClass().getResourceAsStream(
                    "/jaunty/qqmessage/qqflower.jpeg"));
            trayImage = ImageIO.read(this.getClass().getResourceAsStream(
                    "/jaunty/qqmessage/Tencent_QQ.png"));
            trayIcon = new TrayIcon(trayImage, "QQ消息提示器");
        } catch (IOException e) {
            log.debug("", e);
        }
        trayIcon.setImageAutoSize(true);

        trayIcon.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (!trayIcon.getImage().equals(trayImage)) {
                    trayIcon.setImage(trayImage);
                    isGotIt = true;
                }
            }

        });

        trayIcon.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() >= 2) {
                    System.exit(0);
                } else {
                    if (!trayIcon.getImage().equals(trayImage)) {
                        trayIcon.setImage(trayImage);
                        isGotIt = true;
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            log.debug("", e);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (isGotIt) {
            QQEvent event = (QQEvent) arg;
            switch (event) {
            case NEW_MESSAGE:
                isGotIt = false;
                trayIcon.setImage(newMessaeImage);
                trayIcon.displayMessage("You Have New Message",
                        "Some one is calling you",
                        TrayIcon.MessageType.INFO);
                break;
            default:
                System.out.println("unknow event");
            }
        }
    }

    public void start() {
        ServerSocket socket;
        try {
            socket = ServerSocketFactory.getDefault().createServerSocket(54321);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for (;;) {
            try {
                Socket client = socket.accept();
                SocketHandler handle = new SocketHandler(client);
                handle.addObserver(this);
                new Thread(handle).start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private final class SocketHandler extends Observable implements Runnable {

        private Socket socket;

        public SocketHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream in = new DataInputStream(socket.getInputStream());
                byte[] b = new byte[1];
                for (;;) {
                    int count = in.read(b);
                    if (count == 1) {
                        log.debug("client is sending a byte");
                        if (b[0] == 1) {
                            log.debug("a new message is coming");
                            this.setChanged();
                            this.notifyObservers(QQEvent.NEW_MESSAGE);
                        }
                    } else {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        QQMessagePromptor promptor = new QQMessagePromptor();
        promptor.start();
    }
}
