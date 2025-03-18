<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<button class="ui right floated  button inverted blue" id="openModal">
	<i class=" inverted blue pencil alternate icon"></i> မဟာဘုတ် ဗေဒင် မေးရန်
</button>

<div class="ui modal layout" id="popupForm">
	<i class="close icon"></i>
	<div class="header">Guest Form</div>
	<div class="content">
		<form action="/maharbote" class="ui form" method="post">

			<div class="field">
				<label>Name</label> <input type="text" name="name"
					placeholder="သင့်အမည် ">
			</div>

			<div class="field">
				<label>Email</label> <input type="email" name="email"
					placeholder="သင့် email လိပ်စာ !">
			</div>

			<div class="field">
				<label>သင့် မွေ့နေ့</label> <input name="dob" type="date"
					id="datepicker" placeholder="Select date">
			</div>

			<div class="inline fields">
				<label for="dayName">သင့်မွေး နံ ရွေးပါ :</label>
				<c:if test="${null ne dayOfWeek }">
					<c:forEach var="day" items="${dayOfWeek }">
						<div class="field">

							<div class="ui radio checkbox">
								<input type="radio" name="dayName" value="${day}" tabindex="0"
									class="hidden"> <label>${day }</label>
							</div>
						</div>
					</c:forEach>
				</c:if>
			</div>
			<div class="actions" style="margin:3rem 0;">
				<button class="ui right floated primary button">Submit</button>
				<button class="ui right floated button" id="closeModal">Cancel</button>

			</div>
		</form>
	</div>
</div>


