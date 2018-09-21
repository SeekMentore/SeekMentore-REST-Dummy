package com.model.gridcomponent;

import java.io.Serializable;
import java.util.List;

public class GridComponent implements Serializable {

	private static final long serialVersionUID = -7525245577014493220L;
	
	private int start;
	private int limit;
	private String otherParams;	
	private List<Sorter> sorters;
	private List<Filter> filters;
	
	public GridComponent() {}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getOtherParams() {
		return otherParams;
	}
	public void setOtherParams(String otherParams) {
		this.otherParams = otherParams;
	}
	public List<Sorter> getSorters() {
		return sorters;
	}
	public void setSorters(List<Sorter> sorters) {
		this.sorters = sorters;
	}
	public List<Filter> getFilters() {
		return filters;
	}
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}
}
