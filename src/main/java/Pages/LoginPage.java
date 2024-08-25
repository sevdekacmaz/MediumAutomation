package Pages;

import Base.Data;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Data {

    public LoginPage signIn(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[1]/div/div/div/div[3]/div[4]/div/p/span/a")).click();
        return this;
    }

    public LoginPage signInWithMail(){
        driver.findElements(By.cssSelector("[class=\"cq b ei ej ct hk gs dm hl hm db dc dh hn ho hp hq hr di u dj dk dl\"]")).get(4).click();
        return this;
    }
    public LoginPage signInPageControl(String text){
        driver.findElement(By.cssSelector("[class='cq b ei ej ct']")).getText();
        Assert.assertEquals(text,signInText);
        return this;
    }

    public LoginPage fillEmail(String email){
        driver.findElement(By.cssSelector("[class='iu by bw ca iv iw ix iy iz ja']")).sendKeys(email);
        return this;

    }
    public LoginPage clickContinue(){
        driver.findElement(By.cssSelector("[class='jb hv bt']")).click();
        return this;
    }

    public LoginPage invalidUserControl(String text){
        driver.findElement(By.cssSelector("[class='dz b he hf hg ed ee']")).getText();
        Assert.assertEquals(text,invalidUserMessage);
        return this;
    }

    public LoginPage emptyMailInputControl(String text){
        driver.findElement(By.cssSelector("[class='cq b fb cs jj m iw']")).getText();
        Assert.assertEquals(text,message);
        return this;
    }

    public LoginPage invalidMailControl(String text){
        driver.findElement(By.cssSelector("[class='cq b fb cs jj m iw']")).getText();
        Assert.assertEquals(text,message);
        return this;
    }



}
