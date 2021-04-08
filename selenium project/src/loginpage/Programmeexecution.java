package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programmeexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.google.com/");
		
		String b=bo.getTitle();
		System.out.println(b);
		bo.get("https://www.facebook.com/");
	
		bo.get("https://www.redbus.in/");
		bo.get("https://www.youtube.com/");
		bo.get("https://www.eenadu.net/");
		bo.get("https://seek.com.au/");
		bo.get("https://www.linkedin.com/");

		bo.close();
	}

}
