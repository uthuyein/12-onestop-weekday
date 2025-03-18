<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>

<app:layout>
	<div style="padding: 3rem 0px;">
		<app:user-form />
	</div>
	<div style="padding: 0 0 0 5rem;">
		<c:choose>
			<c:when test="${null ne mapContent }">
				<c:forEach var="entry" items="${mapContent }">
					<app:status title="${entry.key.getMyanmar('myan') }" status="${entry.value }" />
				</c:forEach>
			</c:when>
			<c:otherwise>
				<p>There is nothing to show</p>
			</c:otherwise>
		</c:choose>
	</div>
</app:layout>
