package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncommandpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		
		Actions ac=new Actions(hrm);
		
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		Thread.sleep(3000);
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		Thread.sleep(3000);
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	
		ac.moveToElement(hrm.findElement(By.xpath("//body/div[@id='top-menu']/ul[@id='nav']/li[@id='admin']/a[1]/span[1]"))).perform();
		ac.moveToElement(hrm.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		ac.moveToElement(hrm.findElement(By.xpath("//span[contains(text(),'Job Titles')]"))).perform();
		hrm.findElement(By.xpath("//span[contains(text(),'Job Titles')]")).click();
		
		
		
		
	}

}
