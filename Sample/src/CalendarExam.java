import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		int week1 = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(week1);
		int week2 = c.get(Calendar.WEEK_OF_MONTH);
		System.out.println(week2);
		int week3 = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println(week3);
System.out.println("su mo tu we th fr sa");
		int max = c.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= week; i++) {
			System.out.print(" " + (i<10? "0"+ i : i));
			if (i % 7 == 0) {
				System.out.println();
			} else {

			}
		}

	}
}
