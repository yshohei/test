package com.internousdev.template.util;

import java.text.SimpleDateFormat;

public class DateUtil {
	public String getDate(){
		Date date=new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss");
		return simpleDateFormat.format(date);
	}

}
