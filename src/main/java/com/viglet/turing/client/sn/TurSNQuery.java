package com.viglet.turing.client.sn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TurSNQuery {
	public enum ORDER {
		asc, desc
	}

	private String query;
	private int rows;
	private TurSNSortField sortField;
	private TurSNClientBetweenDates betweenDates;
	private List<String> fieldQueries;
	private List<String> targetingRules;
	private int pageNumber;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public TurSNSortField getSortField() {
		return sortField;
	}

	public void setSortField(TurSNSortField sortField) {
		this.sortField = sortField;
	}

	public void setSortField(String field, TurSNQuery.ORDER sort) {
		if (this.sortField == null) {
			this.sortField = new TurSNSortField();
		}
		this.sortField.setField(field);
		this.sortField.setSort(sort);
	}

	public void setSortField(TurSNQuery.ORDER sort) {
		if (this.sortField == null) {
			this.sortField = new TurSNSortField();
		}
		this.sortField.setField(null);
		this.sortField.setSort(sort);
	}

	public TurSNClientBetweenDates getBetweenDates() {
		return betweenDates;
	}

	public void setBetweenDates(TurSNClientBetweenDates betweenDates) {
		this.betweenDates = betweenDates;
	}

	public void setBetweenDates(String field, Date startDate, Date endDate) {

		this.betweenDates = new TurSNClientBetweenDates(field, startDate, endDate);
	}

	public void addFilterQuery(String... fq) {
		if (this.fieldQueries == null) {
			this.fieldQueries = new ArrayList<String>();
		}
		for (int i = 0; i < fq.length; i++) {
			fieldQueries.add(fq[i]);
		}
	}

	public List<String> getFieldQueries() {
		return fieldQueries;
	}

	public void setFieldQueries(List<String> fieldQueries) {
		this.fieldQueries = fieldQueries;
	}

	public void addTargetingRule(String... tr) {
		if (this.targetingRules == null) {
			this.targetingRules = new ArrayList<String>();
		}
		for (int i = 0; i < tr.length; i++) {
			targetingRules.add(tr[i]);
		}
	}

	public List<String> getTargetingRules() {
		return targetingRules;
	}

	public void setTargetingRules(List<String> targetingRules) {
		this.targetingRules = targetingRules;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

}
