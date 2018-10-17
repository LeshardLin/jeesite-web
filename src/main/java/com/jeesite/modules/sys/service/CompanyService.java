/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.TreeService;
import com.jeesite.modules.sys.entity.Company;
import com.jeesite.modules.sys.dao.CompanyDao;

/**
 * 公司表Service
 * @author Lin
 * @version 2018-10-17
 */
@Service
@Transactional(readOnly=true)
public class CompanyService extends TreeService<CompanyDao, Company> {
	
	/**
	 * 获取单条数据
	 * @param company
	 * @return
	 */
	@Override
	public Company get(Company company) {
		return super.get(company);
	}
	
	/**
	 * 查询列表数据
	 * @param company
	 * @return
	 */
	@Override
	public List<Company> findList(Company company) {
		return super.findList(company);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param company
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(Company company) {
		super.save(company);
	}
	
	/**
	 * 更新状态
	 * @param company
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(Company company) {
		super.updateStatus(company);
	}
	
	/**
	 * 删除数据
	 * @param company
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(Company company) {
		super.delete(company);
	}
	
}