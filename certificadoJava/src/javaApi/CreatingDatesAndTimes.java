package javaApi;

import java.time.*;//you need an import statement to work with the date and time classes

public class CreatingDatesAndTimes {
	
	/*
	 * 
	 * In Java 8, Oracle completely revamped how we work with dates and times
	 */

	public static void main(String[] args) {
		
		//IMPORTANT -->	For months in the new date
		//and time methods, Java counts starting from 1 like we human beings do.
		
		//Oracle recommends avoiding time zones unless you really need them
		
		System.out.println(LocalDate.now()); //Contains just a date
		System.out.println(LocalTime.now()); //Contains just a time
		System.out.println(LocalDateTime.now());//Contains both a date and time but no time zone
		
		//Each of the three classes has a static method called now() that gives the current date and time.
		
		
		
		/*
		 * 
		 * Now that you know how to create the current date and time, let’s look at other specific 
		 * dates and times. To begin, let’s create just a date with no time.
		 *  Both of these examples create the same date:
		 */
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		/*
		 * The method signatures are as follows:
		 * public static LocalDate of(int year, int month, int dayOfMonth)
		 * public static LocalDate of(int year, Month month, int dayOfMonth) //Month is a special type of class called an enum
		 */
		
		/*
		 * 
		 * When creating a time, you can choose how detailed you want to be.
		 * You can specify just the hour and minute, or you can add the number of seconds
		 */
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		
		/*
		 * 
		 * method signatures
		 * 
		 * public static LocalTime of(int hour, int minute)
		 * public static LocalTime of(int hour, int minute, int second)
		 * public static LocalTime of(int hour, int minute, int second, int nanos)
		 */
		
		
		//we can combine dates and times:
		
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		/*
		 * 
		 * The method signatures are as follows:
		 * 
		 * public static LocalDateTime of(int year, int month,
		 * int dayOfMonth, int hour, int minute)
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second)
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 * public static LocalDateTime of(LocalDate date, LocalTime)
		 * 
		 */
		
		/*
		 * Did you notice that we did not use a constructor in any of the examples? The date and
		 * time classes have private constructors to force you to use the static methods. The exam
		 * creators may try to throw something like this at you:
		 * 
		 * LocalDate d = new LocalDate(); // DOES NOT COMPILE
		 */
		
		/*
		 * Another trick is to see what happens when you pass invalid numbers to of().
		 * 
		 * LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException
		 */
	}
	

}
