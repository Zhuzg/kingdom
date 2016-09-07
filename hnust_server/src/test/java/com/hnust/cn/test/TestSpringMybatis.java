package com.hnust.cn.test;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hnust.cn.pojo.Fund;
import com.hnust.cn.service.FundService;

@RunWith(SpringJUnit4ClassRunner.class)    //表示继承此类
@ContextConfiguration(locations = {"classpath:application.xml"})    //加载spring配置文件
public class TestSpringMybatis {

	private Logger logger = Logger.getLogger(TestSpringMybatis.class); 
	@Resource
	private FundService fundService;
	
	@Test
	public void test() throws Exception {
		long fundCode = 80000000001L;
		Fund fund = fundService.selectByFundCode(fundCode);
		logger.info(fund.toString());
	}
}
