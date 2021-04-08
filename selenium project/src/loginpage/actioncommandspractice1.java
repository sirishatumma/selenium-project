package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actioncommandspractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Thread.sleep(2000);
		hrm.findElement(By.name("txtPassword")).sendKeys("lab1");
		Thread.sleep(2000);
		hrm.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) > input.button")).click();
		
		Actions ab=new Actions(hrm);
		ab.moveToElement(hrm.findElement(By.id("admin"))).perform();
		ab.moveToElement(hrm.findElement(By.linkText("Users"))).perform();

		ab.moveToElement(hrm.findElement(By.linkText("ESS Users"))).perform();
		hrm.findElement(By.xpath("//span[contains(text(),'ESS Users')]")).click();
		
	
	}

}

		
		