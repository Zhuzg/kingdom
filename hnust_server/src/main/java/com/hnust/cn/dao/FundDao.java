package com.hnust.cn.dao;

import com.hnust.cn.pojo.Fund;

public interface FundDao {

	public Fund selectByFundCode(long fundCode);
}
