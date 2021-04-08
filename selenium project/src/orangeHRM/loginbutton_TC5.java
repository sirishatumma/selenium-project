package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbutton_TC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
