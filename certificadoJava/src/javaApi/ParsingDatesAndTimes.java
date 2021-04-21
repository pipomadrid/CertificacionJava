package javaApi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * Just like the format() method, the parse() method
		 * takes a formatter as well. If you don’t specify one, it uses the default for that type.
		 */
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy"); 
		LocalDate date = LocalDate.parse("01 02 2015", f);  //we use the f fomat
		LocalTime time = LocalTime.parse("11:22"); // as we don’t specify one format, we use the default one
		System.out.println(date); // 2015-01-02
		System.out.println(time); // 11:22
	}

}
