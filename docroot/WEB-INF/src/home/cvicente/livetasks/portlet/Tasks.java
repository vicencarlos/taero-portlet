package home.cvicente.livetasks.portlet;

import home.cvicente.livetasks.model.TaskType;
import home.cvicente.livetasks.service.TaskTypeLocalServiceUtil;

import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
/**
 * Portlet implementation class Tasks
 */
public class Tasks extends MVCPortlet {
 
	public void saveTaskType(ActionRequest actionRequest,ActionResponse actionResponse) throws PortalException, SystemException 
	{
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				TaskType.class.getName(), actionRequest);

				ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
				WebKeys.THEME_DISPLAY);
				String redirect = ParamUtil.getString(actionRequest, "redirect");

				User user=themeDisplay.getUser();
				long typeId=ParamUtil.getLong(actionRequest, "typeId",0);
				String title=actionRequest.getParameter("title" );
				String description =actionRequest.getParameter("description");
				if(typeId==0)
				{
					TaskTypeLocalServiceUtil.addTaskType(title, description, typeId, serviceContext);
				}
				else
				{
					TaskType taskType=TaskTypeLocalServiceUtil.getTaskType(typeId);
					taskType.setDescription(description);
					taskType.setTitle(title);
					TaskTypeLocalServiceUtil.modTaskType(taskType, serviceContext);
				}
				SessionMessages.add(actionRequest, "tasktype-saved-successfully");

	}
}
