package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbutton_TC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
