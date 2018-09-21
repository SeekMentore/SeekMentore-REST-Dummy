package com.model.gridcomponent;

import java.io.Serializable;

public class Sorter implements Serializable {

	private static final long serialVersionUID = 7647400278893275899L;
	
	private String id;
	private String mapping;
	private String columnName;
	private String order;
	
	public Sorter() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
