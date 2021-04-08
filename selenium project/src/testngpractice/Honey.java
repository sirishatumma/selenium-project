package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Honey {
  
  @Test(priority=1,enabled=true,groups="login")
 void testecase2() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
		if(hrm.getTitle().equals("OrangeHRM")) {
			
			System.out.println("TC_2 pass");
			
		}

		else {
			
			System.out.println("TC_2 fail");
		}
		
		hrm.close();
		
	  
  }
  
  @Test(priority=2,enabled=true,groups="customer")
  
  public void testcase3(){
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("sardar");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
		if(hrm.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
		
			System.out.println("TC_3 Pass");
			
		}
		else {
			
			System.out.println("TC_3 Fail");
		}
		
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
		
		if(hrm.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
		
			System.out.println("TC_4 Pass");
			
		}
		else {
			
			System.out.println("TC_4 Fail");
		}
		
		hrm.close();
	}
	  
	   

  
  @Test
  void testcase5() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet2");
		hrm.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("sirisha");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(hrm.getTitle());
		
		if(hrm.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
		
			System.out.println("TC_5 Pass");
			
		}
		else {
			
			System.out.println("TC_5 Fail");
		}
		
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
				
		if(hrm.switchTo().alert().getText().equals("User Name not given!")) {
		
			System.out.println("TC_6 Pass");
			
		}
		else {
			
			System.out.println("TC_6 Fail");
		}
		
		hrm.switchTo().alert().accept();
		
		hrm.close();
	}
	  
	  
  }
  
  
  
  
  
  

