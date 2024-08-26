package Pages;

import Base.BaseLibrary;
import Base.Data;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseLibrary {

    @Step("Sign In butonuna tıklanır.")
    public LoginPage signIn(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div[4]/div/p/span/a")).click();
        return this;
    }

    @Step("Mail ile giriş yapma seçeneği seçilir.")
    public LoginPage signInWithMail(){
        driver.findElements(By.cssSelector("[class=\"cq b ei ej ct hk gs dm hl hm db dc dh hn ho hp hq hr di u dj dk dl\"]")).get(4).click();
        return this;
    }

    @Step("Sign in sayfasında olduğunun kontrolü yapılır.")
    public LoginPage signInPageControl(String text){
        driver.findElement(By.cssSelector("[class='cq b ei ej ct']")).getText();
        Assert.assertEquals(text,signInText);
        return this;
    }

    @Step("Mail alanı doldurulur.")
    public LoginPage fillEmail(String email){
        driver.findElement(By.cssSelector("[class='iu by bw ca iv iw ix iy iz ja']")).sendKeys(email);
        return this;

    }

    @Step("Continue butonu tıklanır.")
    public LoginPage clickContinue(){
        driver.findElement(By.cssSelector("[class='jb hv bt']")).click();
        screenshot();
        return this;
    }

    @Step("Geçersiz mail adresi ile giriş yapılır.")
    public LoginPage invalidUserControl(String text){
        driver.findElement(By.cssSelector("[class='dz b he hf hg ed ee']")).getText();
        Assert.assertEquals(text,invalidUserMessage);
        screenshot();
        return this;
    }

    @Step("Boş mail ile giriş yapılır.")
    public LoginPage emptyMailInputControl(String text){
        driver.findElement(By.cssSelector("[class='cq b fb cs jj m iw']")).getText();
        Assert.assertEquals(text,message);
        screenshot();
        return this;
    }

    @Step("Kayıtlı olmayan bir mail ile giriş yapılır.")
    public LoginPage invalidMailControl(String text){
        driver.findElement(By.cssSelector("[class='cq b fb cs jj m iw']")).getText();
        Assert.assertEquals(text,message);
        screenshot();
        return this;
    }



}
