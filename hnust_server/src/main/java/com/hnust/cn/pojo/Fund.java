package com.hnust.cn.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class Fund implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/***
	 * 资金账号
	 */
	private long fundCode;
	/***
	 * 资金姓名
	 */
	private String fundName;
	/***
	 * 证件类别
	 */
	private String idType;
	/***
	 * 证件代码
	 */
	private String idCode;
	/****
	 * 货币代码
	 */
	private String currency;
	/***
	 * 资金余额
	 */
	private BigDecimal fundBln;
	/***
	 * 资金可用
	 */
	private BigDecimal fundAvl;
	/****
	 * 资金转账冻结
	 */
	private BigDecimal fundTrnFrz;
	/***
	 * 开户日期
	 */
	private Date openDate;
	
	public long getFundCode() {
		return fundCode;
	}
	public void setFundCode(long fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdCode() {
		return idCode;
	}
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getFundBln() {
		return fundBln;
	}
	public void setFundBln(BigDecimal fundBln) {
		this.fundBln = fundBln;
	}
	public BigDecimal getFundAvl() {
		return fundAvl;
	}
	public void setFundAvl(BigDecimal fundAvl) {
		this.fundAvl = fundAvl;
	}
	public BigDecimal getFundTrnFrz() {
		return fundTrnFrz;
	}
	public void setFundTrnFrz(BigDecimal fundTrnFrz) {
		this.fundTrnFrz = fundTrnFrz;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
	public String toString() {
		return fundCode + fundName;
	}

}
