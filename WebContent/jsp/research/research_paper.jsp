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
                    <LI id=Labone ><A href="#" target=_self><SPAN>论文管理</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>成果管理</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>知识产权管理</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>学术活动管理</SPAN></A></LI>
                </UL>
            </DIV>
        </DIV>
    </DIV>
    <DIV class=right>
        <DIV class=pagebody>
            <DIV class=pagefirst></DIV>
            <SPAN class="icontitle iconnews">学术论文</SPAN>
            <DIV class=clear></DIV>
            <!--内容开始-->
            <DIV class=NewsList>
                <!--新闻列表开始-->
                <DIV class=picnews>
                    <UL class=stories featured>
                        <!-- 这里放内容 -->
                        论文列表： <br/>
                        <ul>
                            <table border="0">
                                <tr>
                                    <td width="194" bgcolor="#99CCFF">论文名称</td>
                                    <td width="123" bgcolor="#99CCFF">作者</td>
                                    <td width="123" bgcolor="#99CCFF">所属项目</td>
                                    <td width="123" bgcolor="#99CCFF">论文类别</td>
                                    <td width="122"></td>
                                </tr>
                                <s:iterator value="projects">
                                    <tr>
                                        <td><s:property value=""/></td>
                                        <td><s:property value=""/></td>
                                        <td><s:property value=""/></td>
                                        <td><s:property value=""/></td>
                                        <td><a href="">详细信息</a></td>
                                    </tr>
                                </s:iterator>
                            </table>
                        </ul>
                        <hr />
                        论文新增：<br/>
                        <s:fielderror />
                        <s:form action="v_addProject" namespace="/project" theme="simple">
                            <table>
                                <tr>
                                    <td> 论文名称：
                                        <s:textfield name="projectName" lable="项目名称" />
                                    </td>
                                    <td> 作者：
                                        <s:textfield name="fundOrigin" />
                                    </td>
                                </tr>
                                <tr>
                                    <td> 所属项目：
                                        <s:select name="projectClass" headerKey="-1" headerValue="选择类别" 
									list="#{'个人论文':'个人论文', '部门论文':'部门论文', '科研处论文':'科研处论文}" required="true"/>
                                    </td>
                                    <td> 论文类别：
                                        <s:textfield name="contractFund" />
                                    </td>
                                </tr>
                               
                                <tr>
                                    <td colspan="2">备注：<br/>
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
