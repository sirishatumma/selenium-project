package facebook;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class hdfc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver br=new ChromeDriver();
		br.get("https://www.anz.com.au/");
		br.manage().window().maximize();
		String homepage=br.getWindowHandle();
		System.out.println(homepage);
		br.findElement(By.xpath("//a[@id='skip_logon']")).click();
		/*String popuppage=br.getWindowHandle();
		System.out.println(popuppage);*/
	   
		Set<String> windows=br.getWindowHandles();
	    System.out.println(windows.size());
	 
	    Iterator iterator=windows.iterator();
	    
	    String currentwindowid;
	    while(iterator.hasNext()) {
	    	currentwindowid=iterator.next().toString();
	    	System.out.println(currentwindowid);
	    	if(!currentwindowid.equals(homepage)) {
	    		br.switchTo().window(currentwindowid);
	    		Thread.sleep(4000);
	   br.switchTo().frame("main");
	    		br.findElement(By.name("//input[@id='crn']")).sendKeys("12456");
	    		br.findElement(By.name("CorporateSignonCorpId")).click();
	    		br.switchTo().alert().accept();
	    		
	    	}
	    }
	    	
	    	
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
