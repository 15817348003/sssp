package com.cat.sanmina.util;

public class CommonUtil {
	
	/**
	 * 从传递过来的cpu信息中取出有用的信息
	 * @param temp
	 * @return
	 */
	public static String GetCPUUsefulMessageForString(String temp){
		String result = null;
		if(temp.indexOf(":") > 0){
			result = temp.split(":")[1].trim();
		} else if (temp.indexOf("：" )> 0){
			result = temp.split("：")[1].trim();
		}
		return result;
	}
	
	/**
	 * 从传递过来的内存信息中取出有用的信息
	 * @param temp
	 * @return
	 */
	public static String GetMEMUsefulMessageForString(String temp){
		String result = null;
		if(temp.indexOf(":") > 0){
			result = temp.split(":")[1].trim();
		} else if (temp.indexOf("：" )> 0){
			result = temp.split("：")[1].trim();
		}
		return result.substring(0, result.length()-2).trim();
	}
	
}
