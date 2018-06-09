package scrtc.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Run2 {

	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("http://en.wikipedia.org/").get();

		System.out.println(doc.toString());

	}

}
