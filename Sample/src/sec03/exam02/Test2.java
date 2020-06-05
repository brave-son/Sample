package sec03.exam02;

public class Test2 {

	public static void main(String[] args) {
		String s = "";

		for (int i = 1; i < 50000; i++) {
			s += i;
		}
		System.out.println(System.currentTimeMillis());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 5000000; i++) {
			sb .append(i);
			
		}
		System.out.println(System.currentTimeMillis());
		
		
	}

}
