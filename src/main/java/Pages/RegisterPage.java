package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Data {

    public RegisterPage getStarted() {
        driver.findElement(By.cssSelector("[class='bi']")).click();
        return this;
    }
    public RegisterPage signUpWithMail (){
        driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[1]/div/div[2]/div[3]/button")).click();
        return this;
    }

    public RegisterPage signUpPageControl(String text){
        driver.findElement(By.cssSelector("[class='cq b ei ej ct']")).getText();
        Assert.assertEquals(text,signUpText);
        return this;
    }
    public RegisterPage fillEmail(String email){
        driver.findElement(By.cssSelector("[class='is by bw ca it iu iv iw ix iy']")).sendKeys(email);
        return this;

    }
    public RegisterPage clickContinue(){
        driver.findElement(By.cssSelector("[class='cq b cr cs cv cw cx cy cz da db dc dd de df dg dh ja di u dj dk dl dm']")).click();
        return this;
    }

    public RegisterPage invalidEmailControl(String text){
        driver.findElement(By.cssSelector("[class='cq b fb cs jh m iu']")).getText();
        Assert.assertEquals(text,message);
        return this;
    }


}
