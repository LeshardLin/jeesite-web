/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.sys.dao;

import com.jeesite.common.dao.TreeDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.sys.entity.Company;

/**
 * 公司表DAO接口
 * @author Lin
 * @version 2018-10-17
 */
@MyBatisDao
public interface CompanyDao extends TreeDao<Company> {
	
}