package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckPage extends Data {

    public CheckPage checkPageControl(String text){
        driver.findElement(By.cssSelector("[class='dz b he hf hg ed ee']")).getText();
        Assert.assertEquals(text,checkPageText);
        return this;
    }

}
