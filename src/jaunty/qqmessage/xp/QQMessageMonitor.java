package jaunty.qqmessage.xp;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

import javax.net.SocketFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

/**
 * @author hellojinjie
 * @version Jun 27, 2010 8:01:59 PM
 */
public class QQMessageMonitor {

    private static final Logger log = Logger.getLogger(QQMessageMonitor.class);
    protected Point point;
    private Socket socket;
    private OutputStream out;
    private String serverIP;
    private int serverPort;

    public QQMessageMonitor(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }
    
    private void start() {
        pickQQPosition();
    }

    private void startMonitor() {
        if (!(point == null)) {
            Robot robot;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
                return;
            }
            Color previousColor = robot.getPixelColor(point.x, point.y);
            Color currentColor = robot.getPixelColor(point.x, point.y);
            for (;;) {
                currentColor = robot.getPixelColor(point.x, point.y);
                if (!currentColor.equals(previousColor)) {
                    log.debug("a new message is coming");
                    onNewMessage();
                }
                previousColor = currentColor;
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void onNewMessage() {
        if (socket == null || socket.isClosed()) {
            try {
                socket = SocketFactory.getDefault().createSocket(
                        serverIP, serverPort);
                out = new DataOutputStream(socket.getOutputStream());
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            out.write(new byte[] { (byte) 0x1 });
        } catch (Exception e) {
            log.debug("network error, a message lost");
        }
    }

    private void pickQQPosition() {

        final JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        Robot robot;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            log.debug("", e);
            /* if we could not create a Robot, we do nothing */
            return;
        }

        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit()
                .getScreenSize());
        rectangle.x = 0;
        rectangle.y = 0;
        BufferedImage screenImage = robot.createScreenCapture(rectangle);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(screenImage));
        label.setToolTipText("请鼠标单击QQ头像的位置");

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                point = e.getLocationOnScreen();
                frame.setVisible(false);
                JOptionPane.showMessageDialog(frame, "开始监视QQ消息" +
                        "\nQQ位置：" + point.x + ", " + point.y);
                startMonitor();
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

        frame.add(label);

        JOptionPane.showMessageDialog(null, "请鼠标点击QQ头像的位置");

        /* fullscreen */
        frame.setUndecorated(true);
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        gd.setFullScreenWindow(frame);
        frame.setVisible(true);
        frame.toFront();
    }

    public static void main(String[] args) {
        
        String serverIP = args[0];
        int serverPort = Integer.parseInt(args[1]);
        
        QQMessageMonitor monitor = new QQMessageMonitor(serverIP, serverPort);
        monitor.start();
    }
}
