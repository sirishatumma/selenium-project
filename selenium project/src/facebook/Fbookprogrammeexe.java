package facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbookprogrammeexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		
		WebDriver hello=new ChromeDriver();
		
	
		hello.get("https://google.com");
		

		System.out.println(hello.getTitle());
		System.out.println(hello.getCurrentUrl());
		System.out.println(hello.navigate());
		System.out.println(hello.getWindowHandles());
		
		
	
		String t=hello.getTitle();
		System.out.println(t);

		String i=hello.getPageSource();
		System.out.println(i);
		
		String p=hello.getCurrentUrl();
		System.out.println(p);
		
			
	
	
	

	}
}
