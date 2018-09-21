package com.model.gridcomponent;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Filter implements Serializable {

	private static final long serialVersionUID = 4340143574772981352L;
	
	private String id;
	private String type;
	private String mapping;
	private String columnId;
	private int lessThan;
	private int equalTo;
	private int greaterThan;
	private String stringValue;
	private Date beforeDate;
	private Date onDate;
	private Date afterDate;
	private long beforeDateMillis;
	private long onDateMillis;
	private long afterDateMillis;
	private List<String> listValue;

	public Filter() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public int getLessThan() {
		return lessThan;
	}

	public void setLessThan(int lessThan) {
		this.lessThan = lessThan;
	}

	public int getEqualTo() {
		return equalTo;
	}

	public void setEqualTo(int equalTo) {
		this.equalTo = equalTo;
	}

	public int getGreaterThan() {
		return greaterThan;
	}

	public void setGreaterThan(int greaterThan) {
		this.greaterThan = greaterThan;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Date getBeforeDate() {
		return beforeDate;
	}

	public void setBeforeDate(Date beforeDate) {
		this.beforeDate = beforeDate;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public Date getAfterDate() {
		return afterDate;
	}

	public void setAfterDate(Date afterDate) {
		this.afterDate = afterDate;
	}

	public long getBeforeDateMillis() {
		return beforeDateMillis;
	}

	public void setBeforeDateMillis(long beforeDateMillis) {
		this.beforeDateMillis = beforeDateMillis;
	}

	public long getOnDateMillis() {
		return onDateMillis;
	}

	public void setOnDateMillis(long onDateMillis) {
		this.onDateMillis = onDateMillis;
	}

	public long getAfterDateMillis() {
		return afterDateMillis;
	}

	public void setAfterDateMillis(long afterDateMillis) {
		this.afterDateMillis = afterDateMillis;
	}

	public List<String> getListValue() {
		return listValue;
	}

	public void setListValue(List<String> listValue) {
		this.listValue = listValue;
	}
}
