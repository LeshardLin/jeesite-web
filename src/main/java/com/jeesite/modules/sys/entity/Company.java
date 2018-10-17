/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.sys.entity;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import com.jeesite.common.entity.BaseEntity;
import com.jeesite.common.entity.Extend;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.entity.TreeEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 公司表Entity
 * @author Lin
 * @version 2018-10-17
 */
@Table(name="${_prefix}sys_company", alias="a", columns={
		@Column(name="company_code", attrName="companyCode", label="公司编码", isPK=true),
		@Column(includeEntity=TreeEntity.class),
		@Column(name="view_code", attrName="viewCode", label="公司代码"),
		@Column(name="company_name", attrName="companyName", label="公司名称", queryType=QueryType.LIKE),
		@Column(name="full_name", attrName="fullName", label="公司全称", queryType=QueryType.LIKE),
		@Column(name="area_code", attrName="areaCode", label="区域编码"),
		@Column(includeEntity=DataEntity.class),
		@Column(includeEntity=BaseEntity.class),
		@Column(includeEntity=Extend.class, attrName="extend"),
	}, orderBy="a.tree_sorts, a.company_code"
)
public class Company extends TreeEntity<Company> {
	
	private static final long serialVersionUID = 1L;
	private String companyCode;		// 公司编码
	private String viewCode;		// 公司代码
	private String companyName;		// 公司名称
	private String fullName;		// 公司全称
	private String areaCode;		// 区域编码
	private Extend extend;		// 扩展字段
	
	public Company() {
		this(null);
	}

	public Company(String id){
		super(id);
	}
	
	@Override
	public Company getParent() {
		return parent;
	}

	@Override
	public void setParent(Company parent) {
		this.parent = parent;
	}
	
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	@NotBlank(message="公司代码不能为空")
	@Length(min=0, max=100, message="公司代码长度不能超过 100 个字符")
	public String getViewCode() {
		return viewCode;
	}

	public void setViewCode(String viewCode) {
		this.viewCode = viewCode;
	}
	
	@NotBlank(message="公司名称不能为空")
	@Length(min=0, max=200, message="公司名称长度不能超过 200 个字符")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@NotBlank(message="公司全称不能为空")
	@Length(min=0, max=200, message="公司全称长度不能超过 200 个字符")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Length(min=0, max=100, message="区域编码长度不能超过 100 个字符")
	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public Extend getExtend() {
		return extend;
	}

	public void setExtend(Extend extend) {
		this.extend = extend;
	}
	
}