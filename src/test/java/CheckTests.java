import Base.BaseTest;
import Pages.CheckPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class CheckTests extends BaseTest {

    CheckPage checkPage = new CheckPage();
    LoginPage loginPage = new LoginPage();

    @Test(description = "Sign in sayfasında olduğunun kontrolü")
    public void checkPageControl() throws InterruptedException {

        loginPage.signIn()
                .signInWithMail()
                .fillEmail(email);
        Thread.sleep(3000);
        loginPage.clickContinue();
        checkPage.checkPageControl(checkPageText);

    }






}
