package sec03.exam02;

public class Exam05_9_1 {
	public static void main(String[] args) {
		String nowDate = "20150926";
		nowDate = nowDate.substring(0, 4) + "-"+
				  nowDate.substring(4, 6) + "-"+
				  nowDate.substring(6);
		
// 코드 작성
		System.out.println(nowDate); // => [출력결과] 2015-09-26
		String inputDate = "2015-09-26";
		String inputDate2 = inputDate.substring(0, 4);
		String inputDate3 = inputDate.substring(5, 7);
		String inputDate4 = inputDate.substring(8, 10);

// 코드 작성
		System.out.println(inputDate2 + "년 " + inputDate3 + "월 " + inputDate4 + "일"); // => [출력결과] 2015년 09월 26일

	}
}