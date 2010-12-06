<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n1').className = 'n1';
	//-->
</SCRIPT>

<DIV class=pageadv><IMG border=0 src="<s:url value="/images/library.png" />" ></DIV>
<DIV class=main>
    <DIV class=left>
        <DIV class=menuLab>
            <DIV class=leftmenu>
                <UL>
                    <LI id=Labone class=selected><A href="<s:url action="horizontal" namespace="/project" />" target=_self><SPAN>横向项目</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ ><A href="<s:url action="vertical" namespace="/project" />" target=_self><SPAN>纵向项目</SPAN></A></LI>
                </UL>
            </DIV>
        </DIV>
    </DIV>
    <DIV class=right>
        <DIV class=pagebody>
            <DIV class=pagefirst></DIV>
            <SPAN class="icontitle iconnews">横向项目</SPAN>
            <DIV class=clear></DIV>
            <!--内容开始-->
            <DIV class=NewsList>
                <!--新闻列表开始-->
                <DIV class=picnews>
                    <UL class=stories featured>
                        <!-- 这里放内容 -->
                        <s:iterator value="projects"> 项目名称：
                            <s:property value="projectName" />
                            <br />
                            <hr />
                            项目参与者：
                            <s:property value="anticiptor" />
                            <br/>
                            项目类别：
                            <s:property value="projectClass" />
                            <br/>
                            项目经费来源：
                            <s:property value="fundOrigin" />
                            <br/>
                            项目描述：
                            <s:property value="note" />
                        </s:iterator>
                    </UL>
                </DIV>
                <DIV class=picnews>
                    <UL class=stories featured>
                        <!-- 这里放内容 -->
                    </UL>
                </DIV>
            </DIV>
            <DIV class=pageend></DIV>
        </DIV>
    </DIV>
</DIV>
<DIV class=clear></DIV>
<s:include value="/jsp/footer.jsp"></s:include>
