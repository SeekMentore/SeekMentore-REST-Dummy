package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

import org.apache.poi.util.IOUtils;

import com.model.gridcomponent.Filter;
import com.model.gridcomponent.Sorter;
import com.utils.FileUtils;
import com.utils.JSONUtils;

public class MyJSONParser {
	
	static String filters = "["
			+ "{\"lessThan\":null,\"equalTo\":null,\"greaterThan\":null,\"stringValue\":\"shan\",\"textCaseSensitiveSearch\":false,\"beforeDate\":null,\"onDate\":null,\"afterDate\":null,\"beforeDateMillis\":null,\"onDateMillis\":null,\"afterDateMillis\":null,\"listValue\":[],\"id\":\"currentTutorAllScheduledDemoGrid-Column-customerName-Filter\",\"type\":\"string\",\"mapping\":\"customerName\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-customerName\"},"
			+ "{\"lessThan\":null,\"equalTo\":null,\"greaterThan\":null,\"stringValue\":\"xcg\",\"textCaseSensitiveSearch\":true,\"beforeDate\":null,\"onDate\":null,\"afterDate\":null,\"beforeDateMillis\":null,\"onDateMillis\":null,\"afterDateMillis\":null,\"listValue\":[],\"id\":\"currentTutorAllScheduledDemoGrid-Column-tutorName-Filter\",\"type\":\"string\",\"mapping\":\"tutorName\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-tutorName\"},"
			+ "{\"lessThan\":null,\"equalTo\":null,\"greaterThan\":null,\"stringValue\":null,\"textCaseSensitiveSearch\":false,\"beforeDate\":\"2018-11-19T06:00:00.000Z\",\"onDate\":\"2018-11-15T06:00:00.000Z\",\"afterDate\":\"2018-11-05T06:00:00.000Z\",\"beforeDateMillis\":1542607200000,\"onDateMillis\":1542261600000,\"afterDateMillis\":1541397600000,\"listValue\":[],\"id\":\"currentTutorAllScheduledDemoGrid-Column-demoDateAndTime-Filter\",\"type\":\"date\",\"mapping\":\"demoDateAndTimeMillis\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-demoDateAndTime\"},"
			+ "{\"lessThan\":null,\"equalTo\":null,\"greaterThan\":null,\"stringValue\":null,\"textCaseSensitiveSearch\":false,\"beforeDate\":null,\"onDate\":null,\"afterDate\":null,\"beforeDateMillis\":null,\"onDateMillis\":null,\"afterDateMillis\":null,\"listValue\":[\"Y\"],\"id\":\"currentTutorAllScheduledDemoGrid-Column-demoOccurred-Filter\",\"type\":\"list\",\"mapping\":\"demoOccurred\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-demoOccurred\"},"
			+ "{\"lessThan\":6,\"equalTo\":4,\"greaterThan\":2,\"stringValue\":null,\"textCaseSensitiveSearch\":false,\"beforeDate\":null,\"onDate\":null,\"afterDate\":null,\"beforeDateMillis\":null,\"onDateMillis\":null,\"afterDateMillis\":null,\"listValue\":[],\"id\":\"currentTutorAllScheduledDemoGrid-Column-negotiatedOverrideRateWithClient-Filter\",\"type\":\"number\",\"mapping\":\"negotiatedOverrideRateWithClient\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-negotiatedOverrideRateWithClient\"}"
			+ "]";
	
	static String sorters = "["
			+ "{\"order\":1,\"id\":\"currentTutorAllScheduledDemoGrid-Column-demoStatus-sorter\",\"type\":\"list\",\"mapping\":\"demoStatus\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-demoStatus\",\"columnName\":\"Demo Status\"},"
			+ "{\"order\":2,\"id\":\"currentTutorAllScheduledDemoGrid-Column-clientSatisfiedFromTutor-sorter\",\"type\":\"list\",\"mapping\":\"clientSatisfiedFromTutor\",\"columnId\":\"currentTutorAllScheduledDemoGrid-Column-clientSatisfiedFromTutor\",\"columnName\":\"Client Satisfied From Tutor\"}"
			+ "]";
	
	public static byte[] readContentFromFileAtClassPath(final String filePath) throws FileNotFoundException, IOException {
		final Class<FileUtils> type = FileUtils.class;
		return IOUtils.toByteArray(new FileInputStream(new File(URLDecoder.decode(String.valueOf(type.getClassLoader().getResource(filePath).getPath()), StandardCharsets.UTF_8.name()))));
	}
	
	public static byte[] readContentFromFileAtFileServer() throws FileNotFoundException, IOException {
		return IOUtils.toByteArray(new FileInputStream(new File(URLDecoder.decode("\\\\omninet-bus\\unity-nonprd-omninet\\dev\\it\\u\\public\\fedsso\\fedsso-companies.json", StandardCharsets.UTF_8.name()))));
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		final String baseQuery = "SELECT * FROM QUALIFICATION_LOOKUP";
		final List<Filter> filterList = readFilters();
		final List<Sorter> sorterList = readSorters();
		final String filterQueryString = createFilterQuery(filterList);
		final String additionalFilterQueryString = "";
		final String sorterQueryString = createSorterQuery(sorterList);
		final String additionalSorterQueryString = "";
		//final String completeQuery = createCompleteQuery(baseQuery, 1, 10, filterQueryString, additionalFilterQueryString, sorterQueryString, additionalSorterQueryString);
		final String completeQuery = createCompleteQuery(
				1, 
				9, 
				false, 
				"SELECT * FROM QUALIFICATION_LOOKUP", 
				"WHERE (HIDDEN IS NULL OR HIDDEN = 'N')", 
				"WHERE LABEL LIKE '%.E%'", 
				"WHERE CATEGORY = 'GRADUATION'",
				"ORDER BY LABEL DESC",
				"ORDER BY VALUE ASC",
				"ORDER BY ORDER_IN_CATEGORY DESC");
		System.out.println(completeQuery);
	}
	
	public static Boolean checkObjectAvailability(final Object object) {
	    if (null != object) {
	      return true;
	    }
	    return false;
	}
	
	public static Boolean checkStringAvailability(final String stringObject) {
	    if (checkObjectAvailability(stringObject)) {
	      if (!"".equals(stringObject.trim())) {
	        return true;
	      }
	    }
	    return false;
	}
	
	public static String createCompleteQuery (
			final Integer start, 
			final Integer end, 
			final Boolean isPagingAvailable,
			final String baseQuery,
			String existingFilterQueryString,
			String filterQueryString, 
			String additionalFilterQueryString, 
			String existingSorterQueryString,
			String sorterQueryString, 
			String additionalSorterQueryString
	) {
		String completeQuery = "";
		
		String completeFilterQuery = "";
		if (checkStringAvailability(existingFilterQueryString)) {
			completeFilterQuery += " " + existingFilterQueryString;
			if (checkStringAvailability(filterQueryString)) {
				filterQueryString = filterQueryString.replace("WHERE", "AND");
			}
			if (checkStringAvailability(additionalFilterQueryString)) {
				additionalFilterQueryString = additionalFilterQueryString.replace("WHERE", "AND");
			}
		}
		if (checkStringAvailability(filterQueryString)) {
			if (checkStringAvailability(additionalFilterQueryString)) {
				additionalFilterQueryString = additionalFilterQueryString.replace("WHERE", "AND");
			}
			completeFilterQuery += " " + filterQueryString;
		}
		if (checkStringAvailability(additionalFilterQueryString)) {
			completeFilterQuery += " " + additionalFilterQueryString;
		}
		
		String completeSorterQuery = "";
		if (checkStringAvailability(existingSorterQueryString)) {
			completeSorterQuery += " " + existingSorterQueryString;
			if (checkStringAvailability(sorterQueryString)) {
				sorterQueryString = sorterQueryString.replace("ORDER BY", ",");
			}
			if (checkStringAvailability(additionalSorterQueryString)) {
				additionalSorterQueryString = additionalSorterQueryString.replace("ORDER BY", ",");
			}
		}
		if (checkStringAvailability(sorterQueryString)) {
			if (checkStringAvailability(additionalSorterQueryString)) {
				additionalSorterQueryString = additionalSorterQueryString.replace("ORDER BY", ",");
			}
			completeSorterQuery += " " + sorterQueryString;
		}
		if (checkStringAvailability(additionalSorterQueryString)) {
			completeSorterQuery += " " + additionalSorterQueryString;
		}		
		
		if (isPagingAvailable) {
			final String coreQuery =  " " +  baseQuery + " " +  completeFilterQuery;
			final String mainQueryPseudoTable = " (" + coreQuery + ") AS MAINQUERYPSEUDOTABLE";
			final String totalRecordsPseudoTable = " (SELECT COUNT(1) AS RECORD_COUNT FROM (" + coreQuery + ") AS COUNTPSEUDOTABLE) AS TOTALRECORDSPSEUDOTABLE";
			final String resultPseudoTable = " (SELECT TOTALRECORDSPSEUDOTABLE.RECORD_COUNT AS TOTAL_RECORDS, MAINQUERYPSEUDOTABLE.* FROM " + mainQueryPseudoTable + ", " + totalRecordsPseudoTable + ") AS RESULTPSEUDOTABLE";
			final String rownumPseudoTable = " (SELECT @row_number:=0) AS ROWNUMPSEUDOTABLE";
			final String completeQueryPseudoTable = "(SELECT (@row_number:=@row_number + 1) AS RNUM, RESULTPSEUDOTABLE.* FROM " + resultPseudoTable + ", " + rownumPseudoTable + ") AS COMPLETEQUERYPSEUDOTABLE";
			completeQuery += " SELECT COMPLETEQUERYPSEUDOTABLE.* FROM " + completeQueryPseudoTable + " WHERE RNUM BETWEEN " + start + " AND " + end + " " + completeSorterQuery;
		} else {
			completeQuery += " " +  baseQuery + " " +  completeFilterQuery + " " + completeSorterQuery;
		}		
		return completeQuery;
	}
	
	public static String createSorterQuery(final List<Sorter> sorterList) {
		final StringBuilder sorterQuery = new StringBuilder("");
		if (!sorterList.isEmpty()) {
			sorterQuery.append(" ORDER BY ");
			for (final Sorter sorter : sorterList) {
				if (!" ORDER BY ".equals(sorterQuery.toString())) {
					sorterQuery.append(", ");
				}
				sorterQuery.append(resolveColumnNameForMapping(sorter.getMapping())).append(" ").append(getOrderDescription(sorter.getOrder()));
			}
		}
		return sorterQuery.toString();
	}
	
	public static String getOrderDescription(final Integer order) {
		switch(order) {
			case 1 : return "ASC";
			case 2 : return "DESC";
		}
		return null;
	}
	
	public static String createFilterQuery(final List<Filter> filterList) {
		final StringBuilder filterQuery = new StringBuilder("");
		if (!filterList.isEmpty()) {
			filterQuery.append(" WHERE ");
			for (final Filter filter : filterList) {
				switch(filter.getType()) {
				case "string" : {
					if (!" WHERE ".equals(filterQuery.toString())) {
						filterQuery.append("AND ");
					}
					if (filter.getTextCaseSensitiveSearch()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" like '%").append(filter.getStringValue()).append("%' ");
					} else {
						filterQuery.append("upper(").append(resolveColumnNameForMapping(filter.getMapping())).append(") like '%").append(filter.getStringValue().toUpperCase()).append("%' ");
					}
					break;
				}
				case "number" : {
					if (!" WHERE ".equals(filterQuery.toString())) {
						filterQuery.append("AND ");
					}
					if (null != filter.getLessThan() || null != filter.getEqualTo() || null != filter.getGreaterThan()) {
						filterQuery.append("( ");
					}
					if (null != filter.getLessThan()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" < ").append(filter.getLessThan());
						if (null != filter.getEqualTo() || null != filter.getGreaterThan()) {
							filterQuery.append(" OR ");
						}
					}
					if (null != filter.getEqualTo()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" = ").append(filter.getEqualTo());
						if (null != filter.getGreaterThan()) {
							filterQuery.append(" OR ");
						}
					}
					if (null != filter.getGreaterThan()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" > ").append(filter.getGreaterThan()).append(" ");
					}
					if (null != filter.getLessThan() || null != filter.getEqualTo() || null != filter.getGreaterThan()) {
						filterQuery.append(") ");
					}
					break;
				}
				case "date" : {
					if (!" WHERE ".equals(filterQuery.toString())) {
						filterQuery.append("AND ");
					}
					if (null != filter.getBeforeDateMillis() || null != filter.getOnDateMillis() || null != filter.getAfterDateMillis()) {
						filterQuery.append("( ");
					}
					if (null != filter.getBeforeDateMillis()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" < ").append(filter.getBeforeDateMillis());
						if (null != filter.getOnDateMillis() || null != filter.getAfterDateMillis()) {
							filterQuery.append(" OR ");
						}
					}
					if (null != filter.getOnDateMillis()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" = ").append(filter.getOnDateMillis());
						if (null != filter.getAfterDateMillis()) {
							filterQuery.append(" OR ");
						}
					}
					if (null != filter.getAfterDateMillis()) {
						filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" > ").append(filter.getAfterDateMillis()).append(" ");
					}
					if (null != filter.getBeforeDateMillis() || null != filter.getOnDateMillis() || null != filter.getAfterDateMillis()) {
						filterQuery.append(") ");
					}
					break;
				}
				case "list" : {
					if (!" WHERE ".equals(filterQuery.toString())) {
						filterQuery.append("AND ");
					}
					filterQuery.append(resolveColumnNameForMapping(filter.getMapping())).append(" IN (");
					for (int i = 0; i < filter.getListValue().size(); i++) {
						final String value = filter.getListValue().get(i);
						filterQuery.append("'" + value + "'");
						if (i != filter.getListValue().size() - 1) {
							filterQuery.append(", ");
						}
					}
					filterQuery.append(") ");
					break;
				}
				}
			}	
		}
		return filterQuery.toString();
	}
	
	public static String resolveColumnNameForMapping(final String mapping) {
		return mapping.toUpperCase();
	}
	
	public static List<Sorter> readSorters() {
		final List<Sorter> sorterList = new LinkedList<Sorter>();
		final JsonArray jsonArray = JSONUtils.getJSONArrayFromString(sorters);
		for (Object object : jsonArray) {
			final JsonObject jsonObject = (JsonObject) object;
			final String id = JSONUtils.getValueFromJSONObject(jsonObject, "id", String.class);
			final String type = JSONUtils.getValueFromJSONObject(jsonObject, "type", String.class);
			final String mapping = JSONUtils.getValueFromJSONObject(jsonObject, "mapping", String.class);
			final String columnId = JSONUtils.getValueFromJSONObject(jsonObject, "columnId", String.class);
			final String columnName = JSONUtils.getValueFromJSONObject(jsonObject, "columnName", String.class);
			final Integer order = JSONUtils.getValueFromJSONObject(jsonObject, "order", Integer.class);
			final Sorter sorter = new Sorter(id, type, mapping, columnId, columnName, order);
			sorterList.add(sorter);
		}
		return sorterList;
	}
	
	public static List<Filter> readFilters() {
		final List<Filter> filterList = new LinkedList<Filter>();
		final JsonArray jsonArray = JSONUtils.getJSONArrayFromString(filters);
		for (Object object : jsonArray) {
			final JsonObject jsonObject = (JsonObject) object;
			final String id = JSONUtils.getValueFromJSONObject(jsonObject, "id", String.class);
			final String type = JSONUtils.getValueFromJSONObject(jsonObject, "type", String.class);
			final String mapping = JSONUtils.getValueFromJSONObject(jsonObject, "mapping", String.class);
			final String columnId = JSONUtils.getValueFromJSONObject(jsonObject, "columnId", String.class);
			final Filter filter = new Filter(id, type, mapping, columnId);
			switch (type) {
				case "string" : {
					final String stringValue = JSONUtils.getValueFromJSONObject(jsonObject, "stringValue", String.class);
					final Boolean textCaseSensitiveSearch = JSONUtils.getValueFromJSONObject(jsonObject, "textCaseSensitiveSearch", Boolean.class);
					filter.setStringValue(stringValue);
					filter.setTextCaseSensitiveSearch(textCaseSensitiveSearch);
					break;
				}
				case "date" : {
					final Long beforeDateMillis = JSONUtils.getValueFromJSONObject(jsonObject, "beforeDateMillis", Long.class);
					final Long onDateMillis = JSONUtils.getValueFromJSONObject(jsonObject, "onDateMillis", Long.class);
					final Long afterDateMillis = JSONUtils.getValueFromJSONObject(jsonObject, "afterDateMillis", Long.class);
					filter.setBeforeDateMillis(beforeDateMillis);
					filter.setBeforeDate(new Date(beforeDateMillis));
					filter.setOnDateMillis(onDateMillis);
					filter.setOnDate(new Date(onDateMillis));
					filter.setAfterDateMillis(afterDateMillis);
					filter.setAfterDate(new Date(afterDateMillis));
					break;
				}
				case "number" : {
					final Integer lessThan = JSONUtils.getValueFromJSONObject(jsonObject, "lessThan", Integer.class);
					final Integer equalTo = JSONUtils.getValueFromJSONObject(jsonObject, "equalTo", Integer.class);
					final Integer greaterThan = JSONUtils.getValueFromJSONObject(jsonObject, "greaterThan", Integer.class);
					filter.setLessThan(lessThan);
					filter.setEqualTo(equalTo);
					filter.setGreaterThan(greaterThan);
					break;
				}
				case "list" : {
					final JsonArray listValueJSONArray = JSONUtils.getValueFromJSONObject(jsonObject, "listValue", JsonArray.class);
					filter.setListValue(new LinkedList<String>());
					for (Object listValueObject : listValueJSONArray) {
						final String value = listValueObject.toString().replaceAll("\"", "");
						filter.addListValue(value);
					}
					break;
				}
			}
			filterList.add(filter);
		}
		return filterList;
	}

}
