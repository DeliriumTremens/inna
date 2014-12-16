package com.inna.sinai.web.bean.vo.dto;

public class Authority{
	
	private Integer id;
	private Integer modelId;
	private String name;
	private String description;
	private String target;
	private Integer sortKey;
	private Boolean isOnlyRead;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Integer getSortKey() {
		return sortKey;
	}
	public void setSortKey(Integer sortKey) {
		this.sortKey = sortKey;
	}
	
	public Boolean getIsOnlyRead() {
		return isOnlyRead;
	}

	public void setIsOnlyRead(Boolean isOnlyRead) {
		this.isOnlyRead = isOnlyRead;
	}

}
