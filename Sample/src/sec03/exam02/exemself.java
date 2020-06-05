package sec03.exam02;

import java.util.Scanner;

public class exemself {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int d = a.nextInt();

		if (d >= 90 && d <= 100) {
			System.out.println("A 학점입니다. ");

		} else if (d >= 80 && d < 90) {
			System.out.println("B 학점입니다. ");

		} else if (d >= 70 && d < 80) {
			System.out.println("c 학점입니다.  ");

		} else if (d >= 60 && d < 70) {
			System.out.println("D 학점입니다.  ");

		} else {
			System.out.println("F 학점입니다.  ");

		}

	}

}
