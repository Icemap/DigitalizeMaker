package com.wqz.dm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils
{
	public static Date Str2Date(String datetime) throws ParseException
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.parse(datetime);
	}
	
	public static String date2Str(Date datetime)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(datetime);
	}
}
