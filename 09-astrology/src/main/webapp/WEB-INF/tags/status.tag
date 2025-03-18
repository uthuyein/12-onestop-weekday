<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>

<%@ attribute name="title" type="java.lang.String" required="true"%>
<%@ attribute name="status" type="java.lang.String" required="true"%>
<div class="ui segment">
	<div class="content">
		<div class="ui header">${title } ဖွားအကြောင်း</div>
		<div class="ui header">${user == null ? '':user.getName() }</div>
		<div class="description">${status }</div>
	</div>
	<div class="ui inverted divider"></div>
		<span class=""> ၂၀၂၂ တွင် post တင်သည် </span> <span>
			<i class="user icon"></i> 35 ကြိုက်နှစ်သက်သည်
		</span>
</div>



