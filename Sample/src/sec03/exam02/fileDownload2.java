package sec03.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class fileDownload2 {

	public static void main(String[] args) throws IOException {
		fileDownload2 f = new fileDownload2();
		f.saveImage("src=\"https://shared-comic.pstatic.net/thumb/webtoon/20853/1228/thumbnail_202x120_7767654c-01b6-4150-8f7c-a10d1f82e48f.jpg\"", "01.jpg");
		
		

	}

	private void saveImage(String strUrl, String savePath) throws IOException {

		URL url = null;
		InputStream in = null;
		OutputStream out = null;

		try {

			url = new URL(strUrl);

			in = url.openStream();

			out = new FileOutputStream(savePath); // 저장경로

			while (true) {
				// 이미지를 읽어온다.
				int data = in.read();
				if (data == -1) {
					break;
				}
				// 이미지를 쓴다.
				out.write(data);

			}

			in.close();
			out.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
	}
}
