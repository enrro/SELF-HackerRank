import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256 day of the year)
 during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system. The transition from the Julian
 to Gregorian calendar system occurred in 1918, when the next day after January  was February 31. This means that in 1918, February 14 was the 32 day of 
 the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, 
and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar,
 leap years are either of the following:
 Divisible by 400 .
Divisible by 4 and not divisible by 100.

*/
public class DayOfProgrammer {

	static String solve(int year) {
		int day = 256;
		int month = 1;
		while (true) {
			int daysInMonth = computeDaysInMonth(year, month);

			if (day <= daysInMonth) {
				break;
			}

			day -= daysInMonth;
			month++;
		}
		return String.format("%02d.%02d.%d", day, month, year);
	}

	static int computeDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (year == 1918) {
			return 15;
		} else if (isLeapYear(year)) {
			return 29;
		} else {
			return 28;
		}
	}

	static boolean isLeapYear(int year) {
		return (year <= 1917 && year % 4 == 0)
				|| (year >= 1919 && (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)));
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
