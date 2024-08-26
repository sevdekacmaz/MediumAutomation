package Pages;

import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Data {

    @Step("Get Started butonu tıklanır.")
    public RegisterPage getStarted() {
        driver.findElement(By.cssSelector("[class='bi']")).click();
        return this;
    }

    @Step("Mail ile giriş yapma seçeneği seçilir.")
    public RegisterPage signUpWithMail (){
        driver.findElements(By.cssSelector("[class='cq b ei ej ct hk gs dm hl hm db dc dh hn ho hp hq hr di u dj dk dl']")).get(2).click();
        return this;
    }

    @Step("Sign up sayfasında olduğunu kontrol edilir.")
    public RegisterPage signUpPageControl(String text){
        driver.findElement(By.cssSelector("[class='cq b ei ej ct']")).getText();
        Assert.assertEquals(text,signUpText);
        return this;
    }

    @Step("Mail alanı doldurulur.")
    public RegisterPage fillEmail(String email){
        driver.findElement(By.cssSelector("[class='is by bw ca it iu iv iw ix iy']")).sendKeys(email);
        return this;

    }

    @Step("Continue butonu tıklanır.")
    public RegisterPage clickContinue(){
        driver.findElement(By.cssSelector("[class='cq b cr cs cv cw cx cy cz da db dc dd de df dg dh ja di u dj dk dl dm']")).click();
        return this;
    }

    @Step("Geçersiz mail adresi ile giriş yapılır.")
    public RegisterPage invalidEmailControl(String text){
        driver.findElement(By.cssSelector("[class='cq b fb cs jh m iu']")).getText();
        Assert.assertEquals(text,message);
        return this;
    }


}
