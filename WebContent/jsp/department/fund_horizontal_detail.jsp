<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n2').className = 'n2';
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
            <SPAN class="icontitle iconnews">横向经费卡列表</SPAN>
            <DIV class=clear></DIV>
            <!--内容开始-->
            <DIV class=NewsList>
                <!--新闻列表开始-->
                <DIV class=picnews>
                    <UL class=stories featured>
                        <!-- 这里放内容 -->
                        <s:iterator value="cards"> 经费卡编号：
                            <s:property value="cardId" />
                            <br />
                            <hr />
                            所属项目编号：
                            <s:property value="projectId" />
                            <br/>
                           备注：
                            <s:property value="note" />
							<br/>
							<p/>
							<a href="<s:url action="h_edit" namespace="/fund" ><s:param name="id" value="%{cardId}"/></s:url>">修改</a>	
                            <a href="<s:url action="h_delete" namespace="/fund" ><s:param name="id" value="%{cardId}"/></s:url>">删除</a>						
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
