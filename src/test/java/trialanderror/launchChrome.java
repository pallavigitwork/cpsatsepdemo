
package trialanderror;

import org.openqa.selenium.*;
import org.junit.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class launchChrome {
	
	private WebDriver driver;

    @Before
    public void setupTest() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    

    @Test
    public void launchChrome() {
        driver.get("http://www.ataevents.org");
    }

    @After
    public void teardown() {
       driver.close();
    }

}
