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
                	<LI id=Labone class="selected" ><A href="<s:url action="paper" namespace="/research"/>" target=_self><SPAN>论文管理</SPAN></A></LI>
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
                        <s:iterator value="papers"> 论文名称：
                            <s:property value="paperName" />
                            <br />
                            <hr />
                            作者：
                            <s:property value="paperAuthor" />
                            <br/>
                          类别 ：
                            <s:property value="paperAttribute" />
                            <br/>
                           备注：
                            <s:property value="note" />
							<br/>
							<p/>
							<a href="<s:url action="edit_paper" namespace="/research" ><s:param name="id" value="%{paperId}"/></s:url>">修改</a>	
                            <a href="<s:url action="delete_paper" namespace="/research" ><s:param name="id" value="%{paperId}"/></s:url>">删除</a>						
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
