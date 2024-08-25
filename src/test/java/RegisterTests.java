import Base.BaseTest;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {

    RegisterPage registerPage = new RegisterPage();


    @Test(description = "Sign up sayfasında olduğunun kontrolü")
    public void registeredPageControl() throws InterruptedException {

        registerPage
                .getStarted();
        Thread.sleep(3000);
        registerPage.
                signUpWithMail()
                .signUpPageControl(signUpText);


    }

    @Test
    public void registerSuccess() throws InterruptedException {

        registerPage
                .getStarted();
        Thread.sleep(3000);
        registerPage
                .signUpWithMail()
                .fillEmail(email)
                .clickContinue();
    }

    @Test(description = "Kayıtlı bir mail adresi ile tekrar kayıt kontrolü")
    public void alreadyRegisteredEmail() {

        registerPage
                .getStarted()
                .signUpWithMail()
                .fillEmail(email2)
                .clickContinue();
    }

    @Test(description = "Geçersiz mail adresi ile kayıt olma kontrolü")
    public void registeredWithInvalidEmail() throws InterruptedException {

        registerPage
                .getStarted()
                .signUpWithMail()
                .fillEmail(invalidMail)
                .clickContinue();
        Thread.sleep(3000);
        registerPage.invalidEmailControl(message);

    }




}
