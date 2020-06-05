package sec03.exam02;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parsing2 {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=651673&weekday=sat").get();
		String title = doc.title();
		System.out.println(title);

		fileDownload f = new fileDownload();

		Elements es = doc.select("table.viewList tr img");
		for (int i = 0; i < es.size(); i++) {
			Element e = es.get(i);
			String href = e.attr("src");
			f.saveImage(href, i + ".jpg");
			System.out.println(href);
		}
	}
}
