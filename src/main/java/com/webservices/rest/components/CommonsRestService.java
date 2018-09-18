package com.webservices.rest.components;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.poi.util.IOUtils;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.constants.FileConstants;
import com.constants.RestMethodConstants;
import com.constants.RestPathConstants;
import com.constants.ScopeConstants;
import com.constants.components.CommonsConstants;
import com.model.mail.MailAttachment;
import com.utils.MailUtils;
import com.webservices.rest.AbstractRestWebservice;

@Component
@Scope(ScopeConstants.SCOPE_NAME_PROTOTYPE) 
@Path(RestPathConstants.REST_SERVICE_PATH_COMMONS) 
public class CommonsRestService extends AbstractRestWebservice implements RestMethodConstants, CommonsConstants {
	
	@Path("/getErrorDetails")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String getErrorDetails (
			@FormParam("errorCode") final String errorCode,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		if("101".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/101.png");
			restresponse.put("errorText", "You are not allowed to access this page.");
		} else if("102".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/102.jpg");
			restresponse.put("errorText", "Page under maintnance.");
		} else if("103".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/103.png");
			restresponse.put("errorText", "Your user login has been blocked. Please contact administrator.");
		} else if("104".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/104.jpg");
			restresponse.put("errorText", "Site is under maintnance.");
		} else if("105".equals(errorCode)) {
			restresponse.put("errorImageSrc", "/images/error/105.jpg");
			restresponse.put("errorText", "Server error occurred while processing your request.");
		} else {
			restresponse.put("errorImageSrc", "/images/error/106.gif");
			restresponse.put("errorText", "Something went wrong!!!");
		}
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/getLoginBasicInfo")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String getLoginBasicInfo (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		restresponse.put("username", "Shantanu Mukherjee");
		List<MenuItem> menu = new LinkedList<MenuItem>(); 
		MenuItem admin = new MenuItem("Admin", true, null);
		admin.addSubMenu("Registered Tutor", "/registeredTutor");
		admin.addSubMenu("Subscribed Customer", "/subscribedCustomer");
		admin.addSubMenu("Control Panel", "/controlPanel");
		MenuItem sales = new MenuItem("Sales", true, null);
		sales.addSubMenu("All Enquiries", "/allEnquiries");
		sales.addSubMenu("Map Tutor to Enquiry", "/mapTutorToEnquiry");
		sales.addSubMenu("Demo Tracker", "/demoTracker");
		sales.addSubMenu("Packages", "/packages");
		MenuItem support = new MenuItem("Support", true, null);
		support.addSubMenu("Tutor Registrations", "/tutorRegistrations");
		support.addSubMenu("Enquiry Registrations", "/enquiryRegistrations");
		support.addSubMenu("Query Submitted", "/querySubmitted");
		support.addSubMenu("Subscriptions Requested", "/subscriptionRequested");
		support.addSubMenu("User Complaints", "/userComplaints");
		MenuItem marketing = new MenuItem("Marketing", false, "/marketing");
		MenuItem hr = new MenuItem("HR", false, "/hr");
		MenuItem accounts = new MenuItem("Accounts", false, "/accounts");
		menu.add(admin);
		menu.add(sales);
		menu.add(support);
		menu.add(marketing);
		menu.add(hr);
		menu.add(accounts);
		restresponse.put("menu", menu);
		AccessOptions accessOptions = new AccessOptions();
		accessOptions.setImpersonationaccess(true);
		accessOptions.setEmailformaccess(true);
		restresponse.put("accessoptions", accessOptions);
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/getEmailTemplates")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String getEmailTemplates (
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SelectModel> emailTemplates = new LinkedList<SelectModel>(); 
		emailTemplates.add(new SelectModel("Rejection Template", "01"));
		emailTemplates.add(new SelectModel("Selection Template", "02"));
		restresponse.put("emailTemplates", emailTemplates);
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/loadEmailTemplate")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String loadEmailTemplate (
			@FormParam("templateId") final String templateId,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		if("01".equals(templateId)) {
			restresponse.put("to", "rejectionlist@seekmentore.com");
			restresponse.put("cc", "rejectionadmin@seekmentore.com");
			restresponse.put("bcc", "founder@seekmentore.com");
			restresponse.put("subject", "This is a Rejection Email");
			restresponse.put("body", "Rejection email body<br/>This is second line.<br/><b>this line is in bold letters</b>");
		} else if("02".equals(templateId)) {
			restresponse.put("to", "selectionlist@seekmentore.com");
			restresponse.put("cc", "selectionadmin@seekmentore.com");
			restresponse.put("bcc", "founder@seekmentore.com");
			restresponse.put("subject", "This is a Selection Email");
			restresponse.put("body", "Selection email body<br/>This is second line.<br/><b>this line is in bold letters</b>");
		} else {
			restresponse.put("to", "");
			restresponse.put("cc", "");
			restresponse.put("bcc", "");
			restresponse.put("subject", "");
			restresponse.put("body", "");
		}
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path(REST_METHOD_NAME_SEND_EMAIL)
	@Consumes({MediaType.MULTIPART_FORM_DATA})
	@POST
	public String sendEmail (
			@FormDataParam("to") final String to,
			@FormDataParam("cc") final String cc,
			@FormDataParam("bcc") final String bcc,
			@FormDataParam("subject") final String subject,
			@FormDataParam("body") final String body,
			@FormDataParam("inputFile1") final InputStream uploadedInputStreamFile1,
			@FormDataParam("inputFile1") final FormDataContentDisposition uploadedFileDetailFile1,
			@FormDataParam("inputFile2") final InputStream uploadedInputStreamFile2,
			@FormDataParam("inputFile2") final FormDataContentDisposition uploadedFileDetailFile2,
			@FormDataParam("inputFile3") final InputStream uploadedInputStreamFile3,
			@FormDataParam("inputFile3") final FormDataContentDisposition uploadedFileDetailFile3,
			@FormDataParam("inputFile4") final InputStream uploadedInputStreamFile4,
			@FormDataParam("inputFile4") final FormDataContentDisposition uploadedFileDetailFile4,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		final List<MailAttachment> attachments = new ArrayList<MailAttachment>();
		if (null != uploadedInputStreamFile1) {
			byte[] fileBytes = IOUtils.toByteArray(uploadedInputStreamFile1);
			if (fileBytes.length > 0) {
				attachments.add(new MailAttachment(uploadedFileDetailFile1.getFileName(), fileBytes, FileConstants.APPLICATION_TYPE_OCTET_STEAM));
			}
		}
		if (null != uploadedInputStreamFile2) {
			byte[] fileBytes = IOUtils.toByteArray(uploadedInputStreamFile2);
			if (fileBytes.length > 0) {
				attachments.add(new MailAttachment(uploadedFileDetailFile2.getFileName(), fileBytes, FileConstants.APPLICATION_TYPE_OCTET_STEAM));
			}
		}
		if (null != uploadedInputStreamFile3) {
			byte[] fileBytes = IOUtils.toByteArray(uploadedInputStreamFile3);
			if (fileBytes.length > 0) {
				attachments.add(new MailAttachment(uploadedFileDetailFile3.getFileName(), fileBytes, FileConstants.APPLICATION_TYPE_OCTET_STEAM));
			}
		}
		if (null != uploadedInputStreamFile4) {
			byte[] fileBytes = IOUtils.toByteArray(uploadedInputStreamFile4);
			if (fileBytes.length > 0) {
				attachments.add(new MailAttachment(uploadedFileDetailFile4.getFileName(), fileBytes, FileConstants.APPLICATION_TYPE_OCTET_STEAM));
			}
		}
		MailUtils.sendMimeMessageEmail( 
				to, 
				cc,
				bcc,
				subject, 
				body,
				attachments.isEmpty() ? null : attachments);
		restresponse.put("success", true);
		restresponse.put("message", "Sent Email Successfully");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/alertAndReminderList")
	@Consumes("application/x-www-form-urlencoded")
	@POST
	public String alertAndReminderList (
			@FormParam("start") final int start,
			@FormParam("limit") final int limit,
			@FormParam("sort") final String sort,
			@FormParam("filter") final String filter,
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
		data.add(new AlertReminder(11L));
		data.add(new AlertReminder(12L));
		data.add(new AlertReminder(13L));
		data.add(new AlertReminder(14L));
		data.add(new AlertReminder(15L));
		data.add(new AlertReminder(16L));
		data.add(new AlertReminder(17L));
		data.add(new AlertReminder(18L));
		data.add(new AlertReminder(19L));
		data.add(new AlertReminder(20L));
		data.add(new AlertReminder(21L));
		data.add(new AlertReminder(22L));
		data.add(new AlertReminder(23L));
		data.add(new AlertReminder(24L));
		data.add(new AlertReminder(25L));
		data.add(new AlertReminder(26L));
		data.add(new AlertReminder(27L));
		data.add(new AlertReminder(28L));
		data.add(new AlertReminder(29L));
		data.add(new AlertReminder(30L));
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
			initiatedBy = "Shantanu Mukherjee";
			subject = "Dummy Alert and Reminder for : " + id;
		}
	}
	
	class MenuItem {
		String name;
		boolean submenu;
		String url;
		List<SubMenu> subMenuItems;
		
		MenuItem(String name, boolean submenu, String url) {
			this.name = name;
			this.submenu = submenu;
			this.url = url;
			if (this.submenu) {
				subMenuItems = new LinkedList<SubMenu>();
			}
		}
		
		void addSubMenu(SubMenu subMenu) {
			if (this.submenu) {
				subMenuItems.add(subMenu);
			}
		}
		
		void addSubMenu(String subMenuName, String subMenuUrl) {
			addSubMenu(new SubMenu(subMenuName, subMenuUrl));
		}
		
		class SubMenu {
			String name;
			String url;
			
			SubMenu(String name, String url) {
				this.name = name;
				this.url = url;
			}
		}
	}
	
	class AccessOptions {
		boolean impersonationaccess = false;
		boolean emailformaccess = false;
		
		public boolean isImpersonationaccess() {
			return impersonationaccess;
		}
		public void setImpersonationaccess(boolean impersonationaccess) {
			this.impersonationaccess = impersonationaccess;
		}
		public boolean isEmailformaccess() {
			return emailformaccess;
		}
		public void setEmailformaccess(boolean emailformaccess) {
			this.emailformaccess = emailformaccess;
		}
	}
	
	class SelectModel {
		String label;
		String value;
		
		SelectModel(String label, String value) {
			this.label = label;
			this.value = value;
		}
	}
	
	@Override
	public void doSecurity(final HttpServletRequest request) {
	}
}
