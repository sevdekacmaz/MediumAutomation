import Base.BaseTest;
import Pages.CheckPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class CheckTests extends BaseTest {

    CheckPage checkPage = new CheckPage();
    LoginPage loginPage = new LoginPage();

    @Test(description = "Bu sayfa da giriş yapılabilmesi için mail gönderiliyor. Tıklanan link ile giriş sağlanıyor.")
    public void checkPageControl() throws InterruptedException {

        loginPage.signIn()
                .signInWithMail()
                .fillEmail(email);
        Thread.sleep(3000);
        loginPage.clickContinue();
        checkPage.checkPageControl(checkPageText);

    }






}
