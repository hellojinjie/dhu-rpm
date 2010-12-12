<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n5').className = 'n5';
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
                    <LI id=Labone class="selected"><A href="<s:url action="user" namespace="/system"/>" target=_self><SPAN>用户管理</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>用户组管理</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>科研处部门管理</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>财务处部门编号管理</SPAN></A></LI>
                </UL>
            </DIV>
        </DIV>
    </DIV>
    <DIV class=right>
        <DIV class=pagebody>
            <DIV class=pagefirst></DIV>
            <SPAN class="icontitle iconnews">用户信息</SPAN>
            <DIV class=clear></DIV>
            <!--内容开始-->
            <DIV class=NewsList>

     <UL class=stories featured>
                        <!-- 这里放内容 -->
                        用户列表： <br/>
                        <ul>
                            <table border="0">
                                <tr>
                                    <td width="194"><span class="STYLE1">用户编号</span></td>
                                    <td width="123"><span class="STYLE1">用户名称</span></td>
                                    <td width="122">详细信息</td>
                                </tr>
                                <s:iterator value="users">
                                    <tr>
                                        <td><s:property value="userid"/></td>
                                        <td><s:property value="username"/></td>
                                        <td><a href="<s:url action="u_detail" namespace="/system"><s:param name="id" value="%{userid}" /></s:url>">详细信息</a></td>
                                    </tr>
                                </s:iterator>
                            </table>
                        </ul>
                        <hr />
                        增加用户：<br/>
                        <s:fielderror />
                        <s:form action="u_add" namespace="/system" theme="simple">
                            <table>
                                <tr>
                                    <td> 用户名称：
                                        <s:textfield name="username" lable="项目名称" />
                                    </td>
                                    <td> 用户密码：
                                        <s:textfield name="password" />
                                    </td>
                                </tr>
                                <tr>
                                    <td> 用户权限：
                                        <s:select name="permission" headerKey="-1" headerValue="选择权限" 
                                    list="#{'普通用户':'普通用户', '部门负责人':'部门负责人', '科研处工作人员':'科研处工作人员', '系统管理员':'系统管理员'}" required="true"/>
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
            <DIV class=pageend></DIV>
        </DIV>
    </DIV>
</DIV>
<DIV class=clear></DIV>
<s:include value="/jsp/footer.jsp"></s:include>
