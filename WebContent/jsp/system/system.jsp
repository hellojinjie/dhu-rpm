<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/jsp/header.jsp"></s:include>
<SCRIPT type=text/javascript>
	document.getElementById('mz-n5').className = 'n5';
	//-->
</SCRIPT>

<DIV class=pageadv><IMG border=0 src="<s:url value="/images/library.png" />" ></DIV>
<DIV class=main>
    <DIV class=left>
        <DIV class=menuLab>
            <DIV class=leftmenu>
                <UL>
                    <LI id=Labone  ><A href="<s:url action="user" namespace="/system"/>" target=_self><SPAN>用户管理</SPAN></A></LI>
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
            <SPAN class="icontitle iconnews">最新动态</SPAN>
            <DIV class=clear></DIV>
            <!--内容开始-->
            <DIV class=NewsList>

  
            
            </DIV>
            <DIV class=pageend></DIV>
        </DIV>
    </DIV>
</DIV>
<DIV class=clear></DIV>
<s:include value="/jsp/footer.jsp"></s:include>
