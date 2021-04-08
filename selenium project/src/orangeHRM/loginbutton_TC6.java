package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbutton_TC6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		Thread.sleep(3000);
		hrm.switchTo().alert().accept();
		hrm.close();
	
	}

}
