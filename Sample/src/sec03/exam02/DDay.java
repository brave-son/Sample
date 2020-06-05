package sec03.exam02;

import java.util.Calendar;

public class DDay {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 10000);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		
		System.out.println(year + "/" + 
		(month < 10 ? "0" +month: month)
		+"/"+ (date < 10 ? "0"+ date : date));
	}

}
