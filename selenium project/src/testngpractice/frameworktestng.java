package testngpractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class frameworktestng {
  @Test(priority=1,enabled=true,groups="login")
  public void testcase2() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
	Assert.assertEquals(hrm.getTitle(), "OrangeHRM");
		
		hrm.close();
			  
  }
  @Test(priority=2,enabled=true,groups="admin")
  void testcase3() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("sardar");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
	Assert.assertEquals(hrm.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
		
		hrm.close();  
  }
  @Test
  void testcase4() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet2");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
		Assert.assertEquals(hrm.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
		hrm.close();
	   }
  @Test(priority=4,enabled=true,groups="ceater new account")
  void testcase5() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet2");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("sirisha");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
		Assert.assertEquals(hrm.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
		
		hrm.close();  
  }
  @Test 
  void testcase6() {

	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
				
		Assert.assertEquals(hrm.switchTo().alert().getText(), "User Name not given!");
		hrm.switchTo().alert().accept();
		hrm.close();
  }
}
