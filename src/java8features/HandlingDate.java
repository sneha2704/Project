package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDate {

	public static void main(String[] args) {
	
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current date & time : "+currentDateTime);
		
		LocalDate date = LocalDate.parse("1999-04-27"); //setting date by passing String
		System.out.println("Date : "+date);
		
		LocalDate date2 = LocalDate.of(2005, 5, 10); //setting date by passing integers
		System.out.println("Date : "+date2);
		
		//retrieving Yesterday and Tomorrow's date
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's Date : "+yesterday);
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow's Date : "+tomorrow);
		
		//is Leap year?
		System.out.println("Is Leap Year ? "+currentDate.isLeapYear());
		
		//changing date-time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Date(dd-nn-yyyy) format : "+formattedDate);
		
		//handling zones
		ZonedDateTime zonedDate = ZonedDateTime.now();
		System.out.println("Date with zone : "+zonedDate);
		
		System.out.println("Current zone : "+zonedDate.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo"); //setting tokyo zone
		
		ZonedDateTime tokyoZone = zonedDate.withZoneSameInstant(tokyo);
		System.out.println("Date(tokyo zone) : "+tokyoZone);
		
	
	}
}
