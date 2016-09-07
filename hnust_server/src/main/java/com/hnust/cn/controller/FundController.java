package com.hnust.cn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hnust.cn.pojo.Fund;
import com.hnust.cn.service.FundService;

@Controller
@RequestMapping(value="/fund",method=RequestMethod.GET)
public class FundController {

	@Resource
	private FundService fundService;
	
	@RequestMapping(value="/getFundInfo",method=RequestMethod.GET)
	private String getFundInfo(HttpServletRequest request, Model model) {
		System.out.println("----");
		long fundCode = Long.parseLong(request.getParameter("fundCode"));
		Fund fund = fundService.selectByFundCode(fundCode);
		System.out.println(fund.toString());
		model.addAttribute("fund", fund);
		return "index";
	}
}
