package com.lmy.common.utils;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class DateUtil {

	@SuppressWarnings("deprecation")
	public static String getDateByInitMonth(Date src){
		//获取年月
		int year = src.getYear();
		int month = src.getMonth();
		String data=year+"-"+month+"-01"+" 00:00:00";
		return data;
		}

	public static String getDateByFullMonth(Date src){
		//获取年月
		int year = src.getYear();
		int month = src.getMonth();
		String data=year+"-"+month+"-31"+" 23:59:59";
		return data;
		}

}
