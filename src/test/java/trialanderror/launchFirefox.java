package trialanderror;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class launchFirefox {
	private WebDriver driver;

    @BeforeMethod
    public void setupTest() {
    	WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void launchChrome() {
        driver.get("http://www.ataevents.org");
    }

    @AfterMethod
    public void teardown() {
       driver.close();
    }

}
