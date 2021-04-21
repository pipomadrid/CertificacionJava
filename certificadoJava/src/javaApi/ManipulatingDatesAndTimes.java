package javaApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDatesAndTimes {
	
	/*The date and time classes are immutable, just like String was.
	This means that we need to remember to assign the results of these methods to a reference
	variable so they are not lost.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);// 2014-01-20
		date = date.plusDays(2);// add two days
		System.out.println(date);// 2014-01-22
		date = date.plusWeeks(1); // add one week
		
		System.out.println(date);// 2014-01-29
		date = date.plusMonths(1);//add one month
		System.out.println(date);// 2014-02-28
		date = date.plusYears(5);// add one year
		System.out.println(date);// 2019-02-28
		
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		System.out.println(dateTime);// 2020-01-20T05:15
		dateTime = dateTime.minusDays(1);//substract a day
		System.out.println(dateTime);// 2020-01-19T05:15
		dateTime = dateTime.minusHours(10);//substract 10 hours
		System.out.println(dateTime);// 2020-01-18T19:15
		dateTime = dateTime.minusSeconds(30); //substract 30 seconds
		System.out.println(dateTime);// 2020-01-18T19:14:30
		
		
		//It is common for date and time methods to be chained
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(5, 15);
		LocalDateTime dateTime2 = LocalDateTime.of(date3, time2)
		.minusDays(1).minusHours(10).minusSeconds(30);
		
		
		//IMPORTANT There are two ways the exam creators can try to trick you.
		
		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
		date4.plusDays(10);// will do nothing because we have to assign to a variable likje this:
		//date4 = date4.plusDays(10)
		System.out.println(date4);
		
		//BE CAREFUL
		
		LocalDate date5= LocalDate.of(2020, Month.JANUARY, 20);
		//date5 = date5.plusMinutes(1);// DOES NOT COMPILE because LocalDate does not contain time
		
		
		/*
		 * 
		 * 				Can call on 		Can call on 		Can call on
						LocalDate ? 		LocalTime ? 		LocalDateTime ?
		
plusYears/minusYears       Yes 					No 					Yes
plusMonths / minusMonths   Yes 				    No 					Yes
plusWeeks / minusWeeks     Yes 					No 					Yes
plusDays / minusDays       Yes 					No 					Yes
plusHours / minusHours      No 					Yes 				Yes
plusMinutes / minusMinutes  No				    Yes 				Yes
plusSeconds / minusSeconds  No 				    Yes 				Yes
plusNanos / minusNanos      No 					Yes 				Yes
		 * 
		 * 
		 */
	}

}
