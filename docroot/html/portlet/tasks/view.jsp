<%@ include file="/init.jsp" %>
<liferay-portlet:renderURL var="taskTypesURL">
<liferay-portlet:param name="jspPage" value="/html/portlet/tasks/tasktypes/view.jsp"></liferay-portlet:param>
</liferay-portlet:renderURL>
<a href="<%=taskTypesURL %>">Task Types</a>
