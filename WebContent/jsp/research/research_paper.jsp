<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n3').className = 'n3';
	//-->
</SCRIPT>
<style type="text/css">
<!--
.STYLE1 {color: #0066FF}
-->
</style>


<DIV class=pageadv><IMG border=0 src="<s:url value="/images/library.png" />" ></DIV>
<DIV class=main>
    <DIV class=left>
        <DIV class=menuLab>
            <DIV class=leftmenu>
                <UL>
                    <LI id=Labone class=selected><A href="<s:url action="paper" namespace="/research"/>" target=_self><SPAN>论文管理</SPAN></A></LI>
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
                                    <td width="194"><span class="STYLE1">论文名称</span></td>
                                    <td width="123"><span class="STYLE1">作者</span></td>
                                    <td width="123"><span class="STYLE1">论文类别</span></td>
                                    <td width="122"></td>
                                </tr>
                                <s:iterator value="papers">
                                    <tr>
                                        <td><s:property value="paperName"/></td>
                                        <td><s:property value="paperAuthor"/></td>
                                        <td><s:property value="paperAttribute"/></td>
                                        <td><a href="<s:url action="detail_paper" namespace="/research"><s:param name="id" value="%{paperId}" /></s:url>">详细信息</a></td>
                                    </tr>
                                </s:iterator>
                            </table>
                        </ul>
                        <hr />
                        论文新增：<br/>
                        <s:fielderror />
                        <s:form action="add_paper" namespace="/research" theme="simple">
                            <table>
                                <tr>
                                    <td> 论文名称：
                                        <s:textfield name="paperName" lable="项目名称" />
                                    </td>
                                    <td> 作者：
                                        <s:textfield name="paperAuthor" />
                                    </td>
                                </tr>
                                <tr>
                                    <td> 论文类别：
                                        <s:select name="paperAttribute" headerKey="-1" headerValue="选择类别" 
									list="#{'1':'个人论文', '2':'部门论文', '3':'科研处论文'}" required="true"/>
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
