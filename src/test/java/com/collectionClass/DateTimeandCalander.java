package com.collectionClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeandCalander {
	
	public static void main(String[] args) {
		
	
	Date d = new Date();
	System.out.println(d.toString());  //Sat Mar 10 22:59:32 EST 2018
	
	Date a = new Date();
	SimpleDateFormat b = new SimpleDateFormat("M/d/YYYY");   // 3/10/2018
	System.out.println(b.format(a));
	
	
	SimpleDateFormat e = new SimpleDateFormat("M/d/YYYY  hh:mm:ss"); //3/10/2018  11:03:44
	System.out.println(e.format(a));
	
	
	Calendar cal = Calendar.getInstance();    // this line for Calendar
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}}
