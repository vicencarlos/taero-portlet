
<%@ include file="/init.jsp" %>
<%@ page import="home.cvicente.livetasks.model.Task" %>
<%@ page import="home.cvicente.livetasks.model.TaskType" %>
<%@ page import="home.cvicente.livetasks.service.TaskTypeServiceUtil" %>
<portlet:renderURL var="newtasktypeURL">
<portlet:param name="jspPage" value="/html/portlet/tasks/tasktypes/edit.jsp"></portlet:param>
</portlet:renderURL>

<div class="newitem2">

<%

if( permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), "home.cvicente.livetasks.model",themeDisplay.getScopeGroupId(),"ADD_TYPE")){
%>
<liferay-ui:icon image="add" label="<%= true %>"
message="new-tasktype"
url='<%= newtasktypeURL %>' />
<%
}
%>

</div>
<liferay-ui:search-container emptyResultsMessage="there-are-no-tasktypes" delta="10">
<liferay-ui:search-container-results>
<%
long groupId=themeDisplay.getScopeGroupId();
results=TaskTypeServiceUtil.getGroupTasksTypes(groupId,searchContainer.getStart(), searchContainer.getEnd());
total=TaskTypeServiceUtil.getCountGroupTasksTypes(groupId);
pageContext.setAttribute("results", results);
pageContext.setAttribute("total", total);

%>
</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="home.cvicente.livetasks.model.TaskType" keyProperty="tyId" modelVar="taskType">
<liferay-ui:search-container-column-text>
<%=taskType.getTitle() %>
</liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-jsp path="/html/portlet/tasks/tasktypes/actions.jsp" align="right" />
</liferay-ui:search-container-row>
<liferay-ui:search-iterator />

</liferay-ui:search-container>