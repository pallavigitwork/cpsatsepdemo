package solutions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class loginLogout {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait -- global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.5elementslearning.dev/demosite");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
		driver.findElement(By.name("password")).sendKeys("demo123");
		driver.findElement(By.id("tdb5")).click();
		if(driver.getPageSource().indexOf("My Account Information")>=0){
			driver.findElement(By.linkText("Log Off")).click();
			driver.findElement(By.linkText("Continue")).click();
			System.out.println("user login successful");
		}else{
			System.out.println("Invalid user details");
		}
		driver.close();

	}

}
