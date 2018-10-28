package test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import javax.json.JsonObject;
import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.codec.binary.Base64;

import com.constants.ConnectionConstants;
import com.utils.JSONUtils;



public class ConnectionUtils implements ConnectionConstants {
	
	public static String connectToURL (
			final String url,
			final String method,
			final Map<String, String> postParams,
			final Map<String, String> requestProperties,
			final boolean isURLSecured,
			final boolean isBasicAuthenticationEnabled,
			final String username,
			final String password
	) throws IOException {
		System.out.println("Connection URL : " + url);
		final HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
		if (METHOD_NAME_POST.equals(method)) {
			connection.setRequestMethod(method);
		}
		if (isURLSecured) {
			if (isBasicAuthenticationEnabled) {
				connection.setRequestProperty("Authorization", "Basic " + new String(Base64.encodeBase64((username + ":" + password).getBytes())));
			}
		}
		if (null != requestProperties) {
			for(Map.Entry<String, String> entry : requestProperties.entrySet()) {
				connection.setRequestProperty(entry.getKey(), entry.getValue());
			}
		}
		final StringBuilder postParamsStringBuilder = new StringBuilder(EMPTY_STRING);
		if (null != postParams) {
			for(Map.Entry<String, String> entry : postParams.entrySet()) {
				postParamsStringBuilder.append(entry.getKey()).append(ASSIGNMENT_OPERATOR).append(entry.getValue()).append(AMPERSAND_OPERATOR);
			}
		}
		String postParamsString = null;
		if (postParamsStringBuilder.toString().length() > 0) {
			postParamsString = postParamsStringBuilder.toString().substring(0, postParamsStringBuilder.toString().length() - 1);
		}
		if (METHOD_NAME_POST.equals(method) && null != postParamsString) {
			connection.setDoOutput(true);
			final DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
			dataOutputStream.writeBytes(postParamsString);
			dataOutputStream.flush();
			dataOutputStream.close();
			System.out.println("Post parameters : " + postParamsString);
		}
		final int responseCode = connection.getResponseCode();
		System.out.println("Response Code : " + responseCode);
		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		final StringBuilder response = new StringBuilder(EMPTY_STRING);
		while ((inputLine = bufferedReader.readLine()) != null) {
			response.append(inputLine);
		}
		bufferedReader.close();
		System.out.println(response.toString());
		return response.toString();
	}
	
	public static void main(String args[]) throws IOException {
		System.out.println("Unity Login Connection");
		final String jsonObjectULString = ConnectionUtils.connectToURL(
				"https://login.dev.omnitracs.com/rest/sessionServices/keepAlive?sid=1234", 
				"GET", 
				null, 
				null, 
				false, 
				false, 
				null, 
				null);
		final JsonObject jsonObjectUL = JSONUtils.getJSONObjectFromString(jsonObjectULString);
		System.out.println("sessionId: " + JSONUtils.getValueFromJSONObject(jsonObjectUL, "sessionId", String.class));
		System.out.println("state: " + JSONUtils.getValueFromJSONObject(jsonObjectUL, "state", String.class));
		System.out.println("timeout: " + JSONUtils.getValueFromJSONObject(jsonObjectUL, "timeout", Integer.class));
		//Session session = JSONUtils.convertToObjectFromJSONString(jsonObjectULString, Session.class);
		System.out.println("Ping Federate Connection");
		final JsonObject jsonObjectPF = JSONUtils.getJSONObjectFromString(ConnectionUtils.connectToURL(
				"https://fedsso.perf.omnitracs.com/ext/ref/pickup?REF=1234", 
				"GET", 
				null, 
				null, 
				true, 
				true, 
				"fedssouser", 
				"Omnitracs123"));
		System.out.println("Getting properties from JSON response from Ping Federate");
		System.out.println("authnCtx: " + JSONUtils.getValueFromJSONObject(jsonObjectPF, "authnCtx", String.class));
		System.out.println("partnerEntityID: " + JSONUtils.getValueFromJSONObject(jsonObjectPF, "partnerEntityID", String.class));
		System.out.println("subject: " + JSONUtils.getValueFromJSONObject(jsonObjectPF, "subject", String.class));
		System.out.println("instanceId: " + JSONUtils.getValueFromJSONObject(jsonObjectPF, "instanceId", String.class));
		System.out.println("sessionid: " + JSONUtils.getValueFromJSONObject(jsonObjectPF, "sessionid", String.class));
		System.out.println("authnInst: " + JSONUtils.getValueFromJSONObject(jsonObjectPF, "authnInst", String.class));
	}
	
	class Session {
		String sessionId;
		String state;
		int timeout; // timeout value in seconds
		
		public Session() {}
		
		public Session(String sessionId, String state) {
			this.sessionId = sessionId;
			this.state = state;
		}
		
		public Session(String sessionId, String state, int timeout) {
			this.sessionId = sessionId;
			this.state = state;
			this.timeout = timeout;
		}
		
		public int getTimeout() {
			return timeout;
		}

		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}

		public String getSessionId() {
			return sessionId;
		}
		
		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
		
		public String getState() {
			return state;
		}
		
		public void setState(String state) {
			this.state = state;
		}
	}
}
