package scrtc.htmlunit;

import java.io.IOException;
import java.net.MalformedURLException;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Run {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebClient client = new WebClient(BrowserVersion.CHROME);

		HtmlPage page = client.getPage("https://www.uol.com.br");

        String pageAsXml = page.asXml();
        
        System.out.println(pageAsXml);
        
        client.close();
		
	}

}
