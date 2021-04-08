import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eenaduexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium download\\browser driver\\chromedriver.exe");
		
		WebDriver br=new ChromeDriver();
		
	
		br.get("https://facebook.com");
		br.findElement(By.xpath("//input[@id='email']")).sendKeys("siree.tumma");
		
		br.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		
	}

}
