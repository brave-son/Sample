package sec03.exam02;

import java.util.Scanner;

public class exemself {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		int d = a.nextInt();

		if (d >= 90 && d <= 100) {
			System.out.println("A �����Դϴ�. ");

		} else if (d >= 80 && d < 90) {
			System.out.println("B �����Դϴ�. ");

		} else if (d >= 70 && d < 80) {
			System.out.println("c �����Դϴ�.  ");

		} else if (d >= 60 && d < 70) {
			System.out.println("D �����Դϴ�.  ");

		} else {
			System.out.println("F �����Դϴ�.  ");

		}

	}

}
