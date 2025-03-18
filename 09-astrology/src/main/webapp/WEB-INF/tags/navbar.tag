<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="maharbote" value="/maharbote"></c:url>
<!-- Navigation Bar -->
<div class="ui inverted blue pointing menu">
	<a class="item" href="/index.jsp">သတင်း စာမျက်နှာ</a> <a class="item"
		href="/">သုံးတန်နိစ် ဗေဒင်</a> <a class="item" href="${maharbote }">မဟာဘုတ်
		ဗေဒင်</a> <a class="item" href="${maharbote }">တားရော့ ဗေဒင်</a> <a
		class="item" href="${maharbote }">ဝတ္တုတို များ</a>

	<div class="right menu">
		<!-- User Profile -->
		<div class="ui item">
			<i class="user icon"></i> <span>Min Khant</span>
		</div>
		<div class="ui item">
			<label class="ui blue label"> <i class="align justify icon"
				onclick="$('.ui.sidebar').sidebar('toggle')"></i>
			</label>
		</div>
	</div>

	<!-- Responsive Menu (Mobile) -->

	<div class="ui right vertical sidebar menu">
		<a class="item" href="#">အကောင့် ဝင်ရန်</a> 
		<a class="item" href="#">အကောင့် ဖွင့်ရန်</a> 
	</div>
</div>

