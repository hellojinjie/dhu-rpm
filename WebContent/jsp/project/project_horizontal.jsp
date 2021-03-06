<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n1').className = 'n1';
	//-->
</SCRIPT>
<style type="text/css">
<!--
.STYLE2 {color: #0066FF}
-->
</style>


<DIV class=pageadv><IMG border=0 src="<s:url value="/images/library.png" />" ></DIV>
<DIV class=main>
    <DIV class=left>
        <DIV class=menuLab>
            <DIV class=leftmenu>
                <UL>
                    <LI id=Labone class=selected><A href="<s:url action="horizontal" namespace="/project" />" target=_self><SPAN>横向项目</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="<s:url action="vertical" namespace="/project" />" target=_self><SPAN>纵向项目</SPAN></A></LI>
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
                    <UL class=stories featured>
                        <!-- 这里放内容 -->
                        项目列表： <br />
                        <ul>
                            <table border="0">
                                <tr>
                                    <td width="194"><span class="STYLE2">项目名称</span></td>
                                    <td width="123"><span class="STYLE2">项目类别</span></td>
                                    <td width="122"></td>
                                </tr>
                                <s:iterator value="projects">
                                    <tr>
                                        <td><s:property value="projectName"/></td>
                                        <td><s:property value="projectClass"/></td>
                                        <td><a href="<s:url action="h_detail" namespace="/project"><s:param name="id" value="%{projectId}"></s:param></s:url>" id="<s:property value="projectId"/>">详细信息</a></td>
                                    </tr>
                                </s:iterator>
                            </table>
                        </ul>
                        <hr />
                        增加项目： <br />
                        <s:fielderror />
                        <s:form action="h_addProject" namespace="/project" theme="simple">
                            <table>
                                <tr>
                                    <td> 项目名称：
                                        <s:textfield name="projectName" lable="项目名称" />
                                    </td>
                                    <td> 经费来源：
                                        <s:textfield name="fundOrigin" />
                                    </td>
                                </tr>
                                <tr>
                                    <td> 项目类别：
                                        <s:select name="projectClass" headerKey="-1" headerValue="选择类别" 
									list="#{'学术研究':'学术研究', '应用工程':'应用工程'}" required="true"/>
                                    </td>
                                    <td> 经费额度：
                                        <s:textfield name="contractFund" />
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2"> 参与人：<br/>
                                        <s:textfield name="anticipator" size="78"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2"> 项目详细信息：<br/>
                                        <s:textarea name="note" rows="5" cols="60"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td><s:submit value="增加" />
                                    </td>
                                </tr>
                            </table>
                        </s:form>
                    </UL>
                </DIV>
                
                <DIV class=picnews>
                    <UL class=stories featured>
                        <!-- put things here -->
                    </UL>
            </DIV>
            <DIV class=pageend></DIV>
        </DIV>
    </DIV>
</DIV>
<DIV class=clear></DIV>
<s:include value="/jsp/footer.jsp"></s:include>
