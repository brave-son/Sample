package sec03.exam02;

public class MyNumber {
	int getLotto() {
		int num = (int) (Math.random() * 45 + 1);
		return num;
		
	}

	public static void main(String[] args) {
		MyNumber mr = new MyNumber();
		int n =mr.getLotto();
		
		System.out.println(n);
	}
}
