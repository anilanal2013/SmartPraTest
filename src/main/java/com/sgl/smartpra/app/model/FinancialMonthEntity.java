package com.sgl.smartpra.app.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema ="SmartPRAMaster", name = "mas_financial_month")
public class FinancialMonthEntity implements Serializable{
	
	private static final long serialVersionUID = -8288482098446526822L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "financial_month_id")
	private int financialMonthId;
	
	@Column(name = "client_id", nullable=false, length=2)
	private String clientId;
	
	@Column(name = "financial_month", nullable=false, length=6)
	private String financialMonth;
	
	@Column(name = "financial_year", nullable=false, length=5)
	private String financialYear;
	
	@Column(name = "close_indicator", nullable=false)
	private String closeIndicator;
	
	@Column(name="created_by", nullable=false, length=15)
	private String createdBy;
	
	@Column(name="created_date", nullable=false)
	private Timestamp createdDate;
	
	@Column(name="last_updated_by", length=15)
	private String lastUpdatedBy;
	
	@Column(name="last_updated_date")
	private Timestamp lastUpdatedDate;
	
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public int getFinancialMonthId() {
		return financialMonthId;
	}

	public void setFinancialMonthId(int financialMonthId) {
		this.financialMonthId = financialMonthId;
	}

	public String getCloseIndicator() {
		return closeIndicator;
	}

	public void setCloseIndicator(String closeIndicator) {
		this.closeIndicator = closeIndicator;
	}

	public String getFinancialMonth() {
		return financialMonth;
	}

	public void setFinancialMonth(String financialMonth) {
		this.financialMonth = financialMonth;
	}

	public String getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	

}
