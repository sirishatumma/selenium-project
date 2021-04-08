package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver hrm=new ChromeDriver();
		hrm.get("http://apps.qaplanet.in/hrm/login.php");
		hrm.manage().window().maximize();
		hrm.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		hrm.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		hrm.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		hrm.findElement(By.linkText("Logout")).click();
		
		
		
		
		
		
		
	}

}
