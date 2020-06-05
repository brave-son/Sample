package sec03.exam02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.ws.Response;

class Network {
	public static void main(String[] args) {
		Network n = new Network();
		String result = n.get();
		System.out.println(result);
		
		int s_idx = 0;
		int e_idx = 0;
		while (true) {
			s_idx = result.indexOf("<span>", ++s_idx);
			e_idx = result.indexOf("</span>", ++e_idx);
			if (e_idx == -1) {
				break;
				
			}		
			System.out.println(result.substring(s_idx + 6, e_idx));
		}
		
	}
	public String get() {
		int number = 0;
		StringBuffer response = new StringBuffer();
		try {
			URL url = new URL("http://ggoreb.com/python/html/number.html");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return response.toString();
		
	}
}
