package com.java.train;

import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;

/* Java 8 introduces a new date-time API under the package java.time.
It simply change the way we have been handling dates in java applications.

Important classes introduced in java.time package

Local − Simplified date-time API with no complexity of timezOne handling.

Zoned − Specialized date-time API to deal with various timezOnes.
*/

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Old approach Not used anymore		
		Date d1 = new Date();
		System.out.println(d1.getDate());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// After Java 8
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		System.out.println(d.format(format));
		
		Clock c = Clock.systemDefaultZone();
		System.out.println(c.getZone());
		
		Clock clock = Clock.system(ZoneId.of("Asia/Calcutta"));
		System.out.println(clock.instant());
	}

}
