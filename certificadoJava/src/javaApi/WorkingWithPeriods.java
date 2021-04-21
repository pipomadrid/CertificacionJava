package javaApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class WorkingWithPeriods {

	
	/*
	 *  Our zoo performs animal enrichment
	 *  activities to give the animals something fun to do. The head zookeeper has decided
	 *  to switch the toys every month. This system will continue for three months to see how it
	 *  works out
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(start, end);
	}
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {// check if still before end
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plusMonths(1);// add a month
		}
	}
	*/
	
	/*
	 * The problem is that this method can’t be reused
	 * Our zookeeper wants to try different schedules to see
	 * which works best.
	 */

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
	}
	private static void performAnimalEnrichment(LocalDate start, LocalDate end,
			Period period) { // uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period
		}
	}
	
	/*
	 * 
	 * This allows us to reuse the same method for 
	 * different periods of time as our zookeeper changes her mind.
	 * 
	 * There are five ways to create a Period class:
	 * 
	 */
	
	Period annually = Period.ofYears(1); // every 1 year
	Period quarterly = Period.ofMonths(3); // every 3 months
	Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
	Period everyOtherDay = Period.ofDays(2); // every 2 days
	Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
	
	/*
	 * 
	 * There’s one catch. You cannot chain methods when creating a Period
	 */
	Period wrong = Period.ofYears(1).ofWeeks(1); // every week  (ofYears() will not work)
	
	/**
	 * a Period is a day or more of time. There is also
	 * Duration for smaller units of time
	 * 
	 * you can specify the
	 * number of days, hours, minutes, seconds, or nanoseconds
	 */
	
	/*
	 * The last thing to know about Period is what objects it can be used with. Let’s look at
	 * some code:
	 */
	/*
	 * LocalDate date = LocalDate.of(2015, 1, 20);
	LocalTime time = LocalTime.of(6, 15);
	LocalDateTime dateTime = LocalDateTime.of(date, time); 
	Period period = Period.ofMonths(1);
	System.out.println(date.plus(period)); // 2015-02-20
	System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
	System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
	
	
	Line 9 attempts to add a month to an object that only has a time
	*/
}
