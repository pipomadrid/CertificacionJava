package javaApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.*;

public class FormattingDatesAndTimes {

	public static void main(String[] args) {
		
		
		/*
		 * The date and time classes support many methods to get data out of them:
		 */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());	// MONDAY
		System.out.println(date.getMonth()); 	// JANUARY
		System.out.println(date.getYear()); 	// 2020
		System.out.println(date.getDayOfYear()); // 20
		
		/*
		 * 
		 * DateTimeFormatter can be used to format any type of
			date and/or time object. What changes is the format. DateTimeFormatter is in the package
			java.time.format.
			ISO is a standard for dates.
		 */
		
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date2, time);
		System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		/*
		 * 
		 * there are some predefined formats that are more useful:
		 */

		DateTimeFormatter shortDateTime =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20
		System.out.println(shortDateTime.format(date)); // 1/20/20
		//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException throws an exception because a time cannot be formatted as a date
		
		/*The following statements print exactly the same thing as the
		previous code:
		*/
		DateTimeFormatter shortDateTime2 =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDateTime));
		System.out.println(date.format(shortDateTime));
		//System.out.println(time.format(shortDateTime));//UnsupportedTemporalTypeException
		
		
		/*
		 * 
		 * There are two predefined formats that can show up on the exam: SHORT and MEDIUM
		 */

		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
		
		
		/*
		 * If you don’t want to use one of the predefined formats, you can create your own. For
		 * example, this code spells out the month:
		 * 
		 */
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
		
		/*
		 * MMMM M represents the month. The more Ms you have, the more verbose the Java output.
		 * For example, M outputs 1, MM outputs 01, MMM outputs Jan, and MMMM outputs January.
		 * 
		 * dd d represents the date in the month. As with month, the more ds you have, the more
		 * verbose the Java output. dd means to include the leading zero for a single-digit month.
		 * , Use , if you want to output a comma (this also appears after the year).
		 * 
		 * yyyy y represents the year. yy outputs a two-digit year and yyyy outputs a four-digit year.
		 * 
		 * hh h represents the hour. Use hh to include the leading zero if you’re outputting a singledigit
		 * hour.
		 * : Use : if you want to output a colon.
		 * 
		 * mm m represents the minute.
		 * 
		 */
		
		
	}

}
