package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programmeexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
	
		String t=bo.getTitle();
		System.out.println(t);

		String i=bo.getPageSource();
		System.out.println(i);
		
		String p=bo.getCurrentUrl();
		System.out.println(p);
		
		
		
		
		
		
		
		bo.close();
	
		
		
		
		
	
		
		
		
        	
		
		
		
	
	
	
		

	}

}
