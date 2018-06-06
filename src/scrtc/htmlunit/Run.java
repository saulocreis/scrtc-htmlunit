package scrtc.htmlunit;

import java.io.IOException;
import java.net.MalformedURLException;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Run {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebClient webClient = new WebClient(BrowserVersion.CHROME);

		HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");

        String pageAsXml = page.asXml();
        
        System.out.println(pageAsXml);
        
        webClient.close();
		
	}

}