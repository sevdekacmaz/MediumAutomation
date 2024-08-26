import Base.BaseTest;
import Pages.LoginPage;

import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Sign in sayfasında olduğunun kontrolü")
    public void sıgnInPageControl() throws InterruptedException {

        loginPage.signIn();
        Thread.sleep(3000);
        loginPage.signInWithMail();
        loginPage.signInPageControl(signInText);

    }
    @Test(description = "Başarılı Login")
    public void successLogin() throws InterruptedException {


        loginPage.signIn()
                .signInWithMail()
                .fillEmail(email);
        Thread.sleep(3000);
        loginPage.clickContinue();
    }

    @Test(description = "Kayıtlı olmayan mail kontrolü")
    public void unSuccessLogin() throws InterruptedException {


        loginPage.signIn()
                .signInWithMail()
                .fillEmail(email3);
        Thread.sleep(3000);
        loginPage.clickContinue();
        Thread.sleep(3000);
        loginPage.invalidUserControl(invalidUserMessage);

    }

    @Test(description = "Boş mail kontrolü")
    public void emptyMailInput() throws InterruptedException {

        loginPage.signIn()
                .signInWithMail()
                .fillEmail(email4);
        Thread.sleep(3000);
        loginPage.clickContinue();
        Thread.sleep(3000);
        loginPage.emptyMailInputControl(message);
    }

    @Test(description = "geçersiz mail kontrolü")
    public void invalidMailControl() throws InterruptedException {


        loginPage.signIn()
                .signInWithMail()
                .fillEmail(invalidMail);
        Thread.sleep(3000);
        loginPage.clickContinue();
        Thread.sleep(3000);
        loginPage.invalidMailControl(message);
    }

}
