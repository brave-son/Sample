package sec03.exam02;

import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Node;

public class Parsing {
	public static void main(String[] args) throws IOException {
		Document doc = (Document) Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=651673&weekday=sat").get();
		String title = ((org.jsoup.nodes.Document) doc).title();
		System.out.println(title);

		org.jsoup.select.Elements es = ((org.jsoup.nodes.Element) doc).select("td.title > a");
		for (int i = 0; i < ((ArrayList<org.jsoup.nodes.Element>) es).size(); i++) {
			Element e = (Element) es.get(i);
			String s = ((org.jsoup.nodes.Element) e).text();
			System.out.println(s);

			String href = ((Node) e).attr("href");
			System.out.println(href);
		}
	}
}
