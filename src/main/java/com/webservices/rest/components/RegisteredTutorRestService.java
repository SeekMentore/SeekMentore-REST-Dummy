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
@Path("/registeredTutor") 
public class RegisteredTutorRestService extends AbstractRestWebservice implements RestMethodConstants {
	
	
	@Path("/uploadedDocuments")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String uploadedDocuments (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<TutorDocumentTest> data = new LinkedList<TutorDocumentTest>();
		data.add(new TutorDocumentTest(1L));
		data.add(new TutorDocumentTest(2L));
		data.add(new TutorDocumentTest(3L));
		data.add(new TutorDocumentTest(4L));
		data.add(new TutorDocumentTest(5L));
		data.add(new TutorDocumentTest(6L));
		data.add(new TutorDocumentTest(7L));
		data.add(new TutorDocumentTest(8L));
		data.add(new TutorDocumentTest(9L));
		data.add(new TutorDocumentTest(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class TutorDocumentTest {
		 Long documentId;
		 Long tutorId;
		 String fsKey;
		 String filename;
		 String isApproved;
		 String whoActed;
		 String remarks;
		 Date actionDate;
		 Long actionDatedMillis;
		 byte[] content;
		
		 TutorDocumentTest(Long documentId) {
			this.documentId = documentId;
			tutorId = 1L;
			fsKey = "random key";
			filename = "Fake file";
			isApproved = documentId%2 == 0 ? "Y" : "N";
			whoActed = "abcf";
			remarks = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
			actionDate = new Date();
			actionDatedMillis = actionDate.getTime();			
		}
	}
	
	@Path("/bankDetails")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String bankDetails (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<BankAccount> data = new LinkedList<BankAccount>();
		data.add(new BankAccount(1L));
		data.add(new BankAccount(2L));
		data.add(new BankAccount(3L));
		data.add(new BankAccount(4L));
		data.add(new BankAccount(5L));
		data.add(new BankAccount(6L));
		data.add(new BankAccount(7L));
		data.add(new BankAccount(8L));
		data.add(new BankAccount(9L));
		data.add(new BankAccount(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class BankAccount {
		 Long bacnkAccountId;
		 String bankName;
		 String accountNumber;
		 String ifscCode;
		 String accountHolderName;
		 String isDefault;		 
		
		 BankAccount(Long bacnkAccountId) {
			this.bacnkAccountId = bacnkAccountId;
			bankName = "KOTAK MAHINDRA";
			accountNumber = "1712179763";
			ifscCode = "Fake file";
			isDefault = bacnkAccountId%2 == 0 ? "Y" : "N";
			accountHolderName = "AMIT MISHRA";
		}
	}
	
	@Path("/currentPackages")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String currentPackages (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscriptionPackage> data = new LinkedList<SubscriptionPackage>();
		data.add(new SubscriptionPackage(1L));
		data.add(new SubscriptionPackage(2L));
		data.add(new SubscriptionPackage(3L));
		data.add(new SubscriptionPackage(4L));
		data.add(new SubscriptionPackage(5L));
		data.add(new SubscriptionPackage(6L));
		data.add(new SubscriptionPackage(7L));
		data.add(new SubscriptionPackage(8L));
		data.add(new SubscriptionPackage(9L));
		data.add(new SubscriptionPackage(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	@Path("/historyPackages")
	@Consumes({MediaType.APPLICATION_JSON})
	@POST
	public String historyPackages (
			final GridComponent gridComponent,
			@Context final HttpServletRequest request,
			@Context final HttpServletResponse response
	) throws Exception {
		Map<String, Object> restresponse = new HashMap<String, Object>();
		List<SubscriptionPackage> data = new LinkedList<SubscriptionPackage>();
		data.add(new SubscriptionPackage(1L));
		data.add(new SubscriptionPackage(2L));
		data.add(new SubscriptionPackage(3L));
		data.add(new SubscriptionPackage(4L));
		data.add(new SubscriptionPackage(5L));
		data.add(new SubscriptionPackage(6L));
		data.add(new SubscriptionPackage(7L));
		data.add(new SubscriptionPackage(8L));
		data.add(new SubscriptionPackage(9L));
		data.add(new SubscriptionPackage(10L));		
		restresponse.put("data", data);
		restresponse.put("totalRecords", data.size());
		restresponse.put("success", true);
		restresponse.put("message", "");
		return convertObjToJSONString(restresponse, REST_MESSAGE_JSON_RESPONSE_NAME);
	}
	
	class SubscriptionPackage {
		 Long subscriptionPackageId;
		 String customerName;
		 Integer totalHours;
		 Date startDate;
		 Long startDateMillis;
		 Integer completedHours;
		 Date endDate;
		 Long endDateMillis;
		
		 SubscriptionPackage(Long subscriptionPackageId) {
			this.subscriptionPackageId = subscriptionPackageId;
			customerName = "Parag Agarwal";
			totalHours = 25;
			startDate = new Date();
			startDateMillis = startDate.getTime();
			completedHours = 23;
			endDate = new Date();
			endDateMillis = endDate.getTime();
		}
	}

	@Override
	protected void doSecurity(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
