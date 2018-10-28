package com.webservices.rest.components;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.RestMethodConstants;
import com.constants.ScopeConstants;
import com.model.gridcomponent.GridComponent;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path("/employee") 
public class EmployeeRestService extends AbstractRestWebservice implements RestMethodConstants {
	
	@Path("/alertsRemindersGrid")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String alertsRemindersGrid (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<AlertReminder> data = new LinkedList<AlertReminder>();
		data.add(new AlertReminder(1L));
		data.add(new AlertReminder(2L));
		data.add(new AlertReminder(3L));
		data.add(new AlertReminder(4L));
		data.add(new AlertReminder(5L));
		data.add(new AlertReminder(6L));
		data.add(new AlertReminder(7L));
		data.add(new AlertReminder(8L));
		data.add(new AlertReminder(9L));
		data.add(new AlertReminder(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/tasksGrid")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String tasksGrid (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<Task> data = new LinkedList<Task>();
		data.add(new Task(1L));
		data.add(new Task(2L));
		data.add(new Task(3L));
		data.add(new Task(4L));
		data.add(new Task(5L));
		data.add(new Task(6L));
		data.add(new Task(7L));
		data.add(new Task(8L));
		data.add(new Task(9L));
		data.add(new Task(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/workflowsGrid")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String workflowsGrid (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<Workflow> data = new LinkedList<Workflow>();
		data.add(new Workflow(1L));
		data.add(new Workflow(2L));
		data.add(new Workflow(3L));
		data.add(new Workflow(4L));
		data.add(new Workflow(5L));
		data.add(new Workflow(6L));
		data.add(new Workflow(7L));
		data.add(new Workflow(8L));
		data.add(new Workflow(9L));
		data.add(new Workflow(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class AlertReminder {
		Long id;
		Date initiatedDate;
		Date actionDate;
		Long initiatedDateMillis;
		Long actionDateMillis;
		String initiatedBy;
		String actionBy;
		Date dueDate;
		Long dueDateMillis;
		String subject;
		
		AlertReminder(Long id) {
			this.id = id;
			initiatedDate = new Date();
			actionDate = new Date();
			dueDate = new Date();
			initiatedDateMillis = initiatedDate.getTime();
			actionDateMillis = actionDate.getTime();
			dueDateMillis = dueDate.getTime();
			initiatedBy = "Shantanu Mukherjee " + id;
			subject = "Dummy Alert and Reminder for : " + id;
		}
	}
	
	class Task {
		Long id;
		Date initiatedDate;
		Date actionDate;
		Long initiatedDateMillis;
		Long actionDateMillis;
		String initiatedBy;
		String actionBy;
		Date dueDate;
		Long dueDateMillis;
		String subject;
		
		Task(Long id) {
			this.id = id;
			initiatedDate = new Date();
			actionDate = new Date();
			dueDate = new Date();
			initiatedDateMillis = initiatedDate.getTime();
			actionDateMillis = actionDate.getTime();
			dueDateMillis = dueDate.getTime();
			initiatedBy = "Shantanu Mukherjee " + id;
			subject = "Dummy Alert and Reminder for : " + id;
		}
	}
	
	class Workflow {
		Long id;
		Date initiatedDate;
		Date actionDate;
		Long initiatedDateMillis;
		Long actionDateMillis;
		String initiatedBy;
		String actionBy;
		Date dueDate;
		Long dueDateMillis;
		String subject;
		
		Workflow(Long id) {
			this.id = id;
			initiatedDate = new Date();
			actionDate = new Date();
			dueDate = new Date();
			initiatedDateMillis = initiatedDate.getTime();
			actionDateMillis = actionDate.getTime();
			dueDateMillis = dueDate.getTime();
			initiatedBy = "Shantanu Mukherjee " + id;
			subject = "Dummy Alert and Reminder for : " + id;
		}
	}
	
	@Override
	public void doSecurity(final HttpServletRequest request) {
	}
}
