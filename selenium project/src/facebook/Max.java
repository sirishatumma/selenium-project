package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Max {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		
		WebDriver hello=new ChromeDriver();
		

	hello.get("http://apps.qaplanet.in/hrm/login.php");

  
	hello.manage().window().maximize();
	
	hello.navigate().back();
	
	hello.navigate().forward();
	
	hello.getTitle();
	
	hello.getCurrentUrl();

	
	
        
  
	
		
	}

}
