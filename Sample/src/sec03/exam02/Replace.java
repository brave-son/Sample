package sec03.exam02;

public class Replace {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		String str2 = null;
		String str3 = null;
		

		str2 = str1.replace("자바", "Java"); // str1의 값은 그대로 유지
		System.out.println(str2);
		str3 = str1.replace("프로그래밍", "programing");
        System.out.println(str3);
        str2 = str3.substring(0,2);
        System.out.println(str2);
        
	}
}