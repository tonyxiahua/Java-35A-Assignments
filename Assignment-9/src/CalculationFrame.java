
//Hua Xia
//CIS 35A 
//Assignment 9
//Due Date: June 20
//Submit Date: June 20

import javax.swing.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculationFrame extends DisneyCottage {
	private static final long serialVersionUID = 1L;

	// Calculate the day difference between two dates for bed size rent stay
	public static int getDays(JTextField t1, JTextField t2) {
		try {
			Date one = null, two = null;
			String s1 = " ", s2 = " ";
			s1 = t1.getText();
			s2 = t2.getText();
			if (s1 != null && !s1.isEmpty()) {
				@SuppressWarnings("unused")
				Calendar c = Calendar.getInstance();
				one = DisneyCottage.format.parse(s1);
			}
			if (s2 != null && !s2.isEmpty()) {
				two = DisneyCottage.format.parse(s2);
			}
			long difference = one.getTime() - two.getTime();
			return Math.abs(((int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// Calculate the day difference between two dates for boat rent stay
	public static int getDays1(JTextField t1a, JTextField t2a) {
		try {
			Date one = null, two = null;
			String s1 = " ", s2 = " ";
			s1 = t1a.getText();
			s2 = t2a.getText();
			if (s1 != null && !s1.isEmpty()) {
				@SuppressWarnings("unused")
				Calendar c = Calendar.getInstance();
				one = DisneyCottage.format.parse(s1);
			}
			if (s2 != null && !s2.isEmpty()) {
				two = DisneyCottage.format.parse(s2);
			}
			long difference = one.getTime() - two.getTime();
			return Math.abs(((int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

}