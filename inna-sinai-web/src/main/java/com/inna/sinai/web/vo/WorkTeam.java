package com.inna.sinai.web.vo;

import java.util.Date;

public class WorkTeam {
	
	private Integer id;
	private Integer typeId;
	private Integer typeDescription;
	private Integer contractId;
	private String contractNumber;
	private Integer toUserId;
	private Integer byUserId;
	private String toUserName;
	private String byUserName;
	private Date assignationDate;
	private String comment;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getTypeDescription() {
		return typeDescription;
	}
	public void setTypeDescription(Integer typeDescription) {
		this.typeDescription = typeDescription;
	}
	public Integer getContractId() {
		return contractId;
	}
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public Integer getToUserId() {
		return toUserId;
	}
	public void setToUserId(Integer toUserId) {
		this.toUserId = toUserId;
	}
	public Integer getByUserId() {
		return byUserId;
	}
	public void setByUserId(Integer byUserId) {
		this.byUserId = byUserId;
	}
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getByUserName() {
		return byUserName;
	}
	public void setByUserName(String byUserName) {
		this.byUserName = byUserName;
	}
	public Date getAssignationDate() {
		return assignationDate;
	}
	public void setAssignationDate(Date assignationDate) {
		this.assignationDate = assignationDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
