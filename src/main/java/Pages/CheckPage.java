package Pages;

import Base.BaseLibrary;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckPage extends BaseLibrary {

    @Step("Sign in olabilmek için mail gönderilen sayfada olduğunun kontrolü yapılır.")
    public CheckPage checkPageControl(String text){
        driver.findElement(By.cssSelector("[class='dz b he hf hg ed ee']")).getText();
        Assert.assertEquals(text,checkPageText);
        screenshot();
        return this;
    }

}
