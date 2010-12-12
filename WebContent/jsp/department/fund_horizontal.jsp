<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n2').className = 'n2';
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
                    <LI id=Labone class="selected"><A href="<s:url action="horizontal" namespace="/fund"/>" target=_self><SPAN>横向经费卡</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>纵向经费卡</SPAN></A></LI>
                    
                </UL>
            </DIV>
        </DIV>
    </DIV>
    <DIV class=right>
        <DIV class=pagebody>
            <DIV class=pagefirst></DIV>
            <SPAN class="icontitle iconnews">横向经费卡信息</SPAN>
            <DIV class=clear></DIV>
            <!--内容开始-->
            <DIV class=NewsList>

     <UL class=stories featured>
                        <!-- 这里放内容 -->
                        经费卡列表： <br/>
                        <ul>
                            <table border="0">
                                <tr>
                                    <td width="194"><span class="STYLE1">经费卡编号</span></td>
                                    <td width="123"><span class="STYLE1">所属项目编号</span></td>
                                    <td width="123"><span class="STYLE1">转入金额</span></td>
                                    <td width="122">详细信息</td>
                                </tr>
                                <s:iterator value="cards">
                                    <tr>
                                        <td><s:property value="cardId"/></td>
                                        <td><s:property value="projectId"/></td>
                                        <td><s:property value="inclusionFund"/></td>
                                        <td><a href="<s:url action="h_detail" namespace="/fund"><s:param name="id" value="%{cardId}" /></s:url>">详细信息</a></td>
                                    </tr>
                                </s:iterator>
                            </table>
                        </ul>
                        <hr />
                        增加经费卡：<br/>
                        <s:fielderror />
                        <s:form action="h_add" namespace="/fund" theme="simple">
                            <table>
                                <tr>
                                    <td> 所属项目编号：
                                        <s:textfield name="projectId" lable="项目名称" />
                                    </td>
                                    <td> 转入金额：
                                        <s:textfield name="inclusionFund" />
                                    </td>
                                </tr>
                                <tr>
                                    <td> 经费卡属性：
                                        <s:select name="cardAttribute" headerKey="-1" headerValue="选择类别" 
                                    list="#{'1':'横向经费卡', '2':'纵向经费卡'}" required="true"/>
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
