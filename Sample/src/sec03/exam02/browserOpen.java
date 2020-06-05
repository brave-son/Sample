package sec03.exam02;

import java.io.IOException;

public class browserOpen {

	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		
		runtime.exec("Explorer.exe http://www.naver.com");
		
		// TODO Auto-generated method stub

	}

}
