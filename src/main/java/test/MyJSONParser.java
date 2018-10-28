package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import javax.json.JsonArray;
import javax.json.JsonObject;

import org.apache.poi.util.IOUtils;

import com.utils.FileUtils;
import com.utils.JSONUtils;

public class MyJSONParser {
	
	public static byte[] readContentFromFileAtClassPath(final String filePath) throws FileNotFoundException, IOException {
		final Class<FileUtils> type = FileUtils.class;
		return IOUtils.toByteArray(new FileInputStream(new File(URLDecoder.decode(String.valueOf(type.getClassLoader().getResource(filePath).getPath()), StandardCharsets.UTF_8.name()))));
	}
	
	public static byte[] readContentFromFileAtFileServer() throws FileNotFoundException, IOException {
		return IOUtils.toByteArray(new FileInputStream(new File(URLDecoder.decode("\\\\omninet-bus\\unity-nonprd-omninet\\dev\\it\\u\\public\\fedsso\\fedsso-companies.json", StandardCharsets.UTF_8.name()))));
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		//String result = java.net.URLDecoder.decode("/opt/tomcat8400/webapps/ROOT%23%23V4.05.00B026/WEB-INF/classes/fedsso/fedsso-companies.json", StandardCharsets.UTF_8.name());
		//System.out.println(result);
		/*String jsonContent = FileUtils.convertByteArrayToString(FileUtils.readContentFromFile("config/fedsso-companies.json"));
		System.out.println(jsonContent);
		final JsonArray jsonArray = JSONUtils.getJSONArrayFromString(jsonContent);
		for (Object object : jsonArray) {
			final JsonObject jsonObject = (JsonObject) object;
			final String guid = JSONUtils.getValueFromJSONObject(jsonObject, "GUID", String.class);
			final String homePage = JSONUtils.getValueFromJSONObject(jsonObject, "HomePage", String.class);
			final JsonArray roles = JSONUtils.getValueFromJSONObject(jsonObject, "Roles", JsonArray.class);
			System.out.println(guid + " " + homePage);
			for (Object roleId : roles) {
				System.out.println(roleId.toString().replaceAll("\"", ""));
		    }
		}*/
		/*final JsonArray jsonArray = JSONUtils.getJSONArrayFromString(new String(readContentFromFileAtFileServer()));
		for (Object object : jsonArray) {
			final JsonObject jsonObject = (JsonObject) object;
			final String guid = JSONUtils.getValueFromJSONObject(jsonObject, "GUID", String.class);
			System.out.print(guid +" ");
			final String homePage = JSONUtils.getValueFromJSONObject(jsonObject, "HomePage", String.class);
			System.out.print(homePage +" ");
			final JsonArray systemRoles = JSONUtils.getValueFromJSONObject(jsonObject, "SystemRoles", JsonArray.class);
			for (Object roleId : systemRoles) {
				System.out.print(roleId.toString().replaceAll("\"", "").trim() +" ");
			}
			final JsonArray companyRoles = JSONUtils.getValueFromJSONObject(jsonObject, "CompanyRoles", JsonArray.class);
			for (Object roleId : companyRoles) {
				System.out.print(roleId.toString().replaceAll("\"", "").trim() +" ");
			}
		}*/
		System.out.println("Test Brace Block");
		{
			System.out.println("Test Brace Block");
		}
		System.out.println("Test Brace Block");
	}

}
