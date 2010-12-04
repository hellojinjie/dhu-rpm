<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/jsp/header.jsp"></s:include>
<div class="pageadv"><img src="<s:url value="/images/jingyuehu0.png" />" /></div>
<div class="main">
<div class="clear"></div>
<div class="indexinfo">
    <div class="b1">
        <div class="box">
            <div class="boximg">
                <div class="boxt">
                    <h3>待办事项</h3>
                </div>
                <div class="boxbody">
                    <ul>
                        <li>无</li>
                    </ul>
                    <div style="float: right;"><a href="#" class="more">更多</a></div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="b2">
        <div class="box">
            <div class="boximg">
                <div class="boxt">
                    <h3>最近到款项目</h3>
                </div>
                <div class="boxbody">
                    <ul>
                        <li><a href="#" >无</a> </li>
                    </ul>
                    <div style="float: right;" class="more"><a href="#">更多</a></div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="b3">
        <div class="box">
            <div class="boximg">
                <div class="boxt">
                    <h3>新增项目</h3>
                </div>
                <div class="boxbody">
                    <ul>
                        <li><a href="#">无</a></li>
                    </ul>
                    <div style="float: right;" class="more"><a href="#">更多</a></div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="clear"></div>
<s:include value="/jsp/footer.jsp"></s:include>
