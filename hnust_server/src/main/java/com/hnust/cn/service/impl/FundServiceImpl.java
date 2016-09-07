package com.hnust.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnust.cn.dao.FundDao;
import com.hnust.cn.pojo.Fund;
import com.hnust.cn.service.FundService;

@Service("fundService")
public class FundServiceImpl implements FundService{

	@Autowired
	private FundDao fundDao;
	
	public Fund selectByFundCode(long fundCode) {
		// TODO Auto-generated method stub
		return fundDao.selectByFundCode(fundCode);
	}

}
