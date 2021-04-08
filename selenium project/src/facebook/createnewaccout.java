package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createnewaccout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.facebook.com/");
		bo.manage().window().maximize();
		bo.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(4000);
		
		bo.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sirisha");
		bo.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("tumma");
		
		
		
	}

}
