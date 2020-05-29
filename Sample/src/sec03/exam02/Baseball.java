package sec03.exam02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		boolean isplay = true;

		Number n = new Number();
		int number = n.get();

		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;
		int baseball1 = (number / 10 / 10) % 10;

		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("첫번째 숫자를 입력하시오.");
		int inputNumber1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int inputNumber2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int inputNumber3 = s.nextInt();

		int strike = 0; // 스트라이크를 개수를 저장할 변수
		int ball = 0; // 볼의 개수를 저장할 변수
		int out = 0;
		/*
		 * 코드 작성 스트라이크와 볼 검사 조건문 작성
		 */
		if (inputNumber1 == baseball1) {
			// 스크라이크
			strike = strike + 1;
		} else if (inputNumber1 == baseball2 || inputNumber1 == baseball3) {
			// 볼
			ball++;
		} else {
			out += 1;
		}

		if (inputNumber2 == baseball2) {
			// 스크라이크
			strike = strike + 1;
		} else if (inputNumber2 == baseball1 || inputNumber2 == baseball3) {
			// 볼
			ball++;
		} else {
			out += 1;
		}

		if (inputNumber3 == baseball3) {
			// 스크라이크
			strike = strike + 1;
		} else if (inputNumber3 == baseball1 || inputNumber3 == baseball2) {
			// 볼
			ball++;
		} else {
			out += 1;
		}
		// 아웃인 경우에는 아웃만 표시
		if (strike == 0 && ball == 0) {
			System.out.println("out => " + out);
		} else {
			System.out.println("스트라이크 => " + strike);
			System.out.println("볼 => " + ball);
			if (strike == 3) {
				System.out.println("축하합니다!!");

			} else {
				System.out.println("다시 도전해 보세요!!");

			}
		}
		isplay = false;
	}

}

class Number {
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/baseball/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;

	}

}