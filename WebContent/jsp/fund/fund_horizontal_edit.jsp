<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n3').className = 'n3';
	//-->
</SCRIPT>

<DIV class=pageadv><IMG border=0 src="<s:url value="/images/library.png" />" ></DIV>
<DIV class=main>
    <DIV class=left>
        <DIV class=menuLab>
            <DIV class=leftmenu>
                <UL>
                	<LI id=Labone class="selected" ><A href="<s:url action="horizontal" namespace="/fund"/>" target=_self><SPAN>横向经费卡</SPAN></A></LI>
                    <LI id=MzLm_AboutMZ><A href="#" target=_self><SPAN>纵向经费卡</SPAN></A></LI>
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
                        论文管理调整： <br />
                        <hr />
                        <s:fielderror />
                        <s:form action="h_modify" namespace="/fund" theme="simple">
                             <s:hidden name="id"></s:hidden>
                            <table>
                                <tr>
                                    <td> 所属项目：
                                        <s:textfield name="projectId" lable="项目名称" />
                                    </td>
                                    <td> 转入金额：
                                        <s:textfield name="inclusionFund" lable="项目名称" />
                                    </td>
                                </tr>
                                <tr>
                                     <td> 经费卡类别：
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
                                    <td><s:submit value="修改" />
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
