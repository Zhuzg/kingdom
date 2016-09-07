package com.hnust.cn.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统字典项（银行代码，币种，证件类型）
 * @author zhuzg
 *
 */
public class DictUtil {
	
	//银行代码
	private static final  Map<String, String> BANK_MAP = new HashMap<String, String>();
	//货币代码
	private static final  Map<String, String> CURRENCY_MAP = new HashMap<String, String>();
	
	static{
		setBankCode();
		setCurrnecyCode();
	}
	
	private static void setCurrnecyCode() {
		CURRENCY_MAP.put("0", "0-人民币");
		CURRENCY_MAP.put("1", "1-港币");
		CURRENCY_MAP.put("2", "2-美元");
	}
	
	private static void setBankCode() {
		BANK_MAP.put("1001", "1001-建行存管");
		BANK_MAP.put("1002", "1002-招行存管");
		BANK_MAP.put("1003", "1003-工行存管");
		BANK_MAP.put("1004", "1004-交行存管");
		BANK_MAP.put("1005", "1005-中信存管");
		BANK_MAP.put("1006", "1006-兴业存管");
		BANK_MAP.put("1007", "1007-平安存管");
		BANK_MAP.put("1008", "1008-民生存管");
		BANK_MAP.put("1009", "1006-兴业存管");
		BANK_MAP.put("1010", "1007-上海存管");
		BANK_MAP.put("1011", "1008-中行存管");
	}
	
	
}
