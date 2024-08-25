package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Data{
    @BeforeMethod
    public void openBrowser() throws InterruptedException {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

}
