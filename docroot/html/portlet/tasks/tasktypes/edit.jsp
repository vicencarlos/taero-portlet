<%@ include file="/init.jsp" %>
<%@ page import="home.cvicente.livetasks.model.Task" %>
<%@ page import="home.cvicente.livetasks.model.TaskType" %>
<%@ page import="home.cvicente.livetasks.service.TaskTypeServiceUtil" %>
<%@ page import="home.cvicente.livetasks.service.TaskTypeLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>

<portlet:actionURL var="savetaskTypeURL" name="saveTaskType" />
<portlet:renderURL var="cancel" />
<liferay-ui:error key="title-required" message="title-required" />
<liferay-ui:error key="title-empty" message="title-empty" />
<liferay-ui:error key="title-repeated" message="title-repeated" />
<%
String redirect = ParamUtil.getString(request, "redirect");
String backURL = ParamUtil.getString(request, "backURL");

String referringPortletResource = ParamUtil.getString(request, "referringPortletResource");
long typeId=ParamUtil.getLong(request, "typeId",0);
TaskType taskType=null;
if(request.getAttribute("taskType")!=null)
{
taskType=(TaskType)request.getAttribute("taskType");
}
else
{
if(typeId>0)
{
taskType=TaskTypeLocalServiceUtil.getTaskType(typeId);
}
}
String description="";
if(taskType!=null)
{
description=taskType.getDescription();

%>
<aui:model-context bean="<%= taskType %>" model="<%= TaskType.class %>" />
<%
}
else
{
%>
<aui:model-context model="<%= TaskType.class %>" />
<%
}
%>
<aui:form name="fm" action="<%=savetaskTypeURL%>" method="post" >

<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
<aui:input name="backURL" type="hidden" value="<%= backURL %>" />
<aui:input name="referringPortletResource" type="hidden" value="<%= referringPortletResource %>" />
<aui:input name="typeId" type="hidden" value="<%=typeId %>"/>
<aui:input name="title" label="title">
</aui:input>
<aui:field-wrapper label="description">
<liferay-ui:input-editor name="description" width="100%" />
<aui:input name="description" type="hidden" />
<script type="text/javascript">
function <portlet:namespace />initEditor() { return "<%= UnicodeFormatter.toString(description) %>"; }
</script>
</aui:field-wrapper>

<liferay-ui:custom-attributes-available className="<%= TaskType.class.getName() %>">
<liferay-ui:custom-attribute-list
className="<%=home.cvicente.livetasks.model.TaskType.class.getName()%>" classPK="<%=typeId %>" editable="true" label="true"></liferay-ui:custom-attribute-list>
</liferay-ui:custom-attributes-available>
<aui:button-row>
<aui:button type="submit"></aui:button>
<aui:button onClick="<%=cancel %>" type="cancel" />
</aui:button-row>
</aui:form>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>