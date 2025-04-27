package logincritical;

import base.config.BaseTest;
import org.testng.annotations.Test;

import static base.Pages.homePage;
import static base.helpers.Constants.LOGIN_PASSWORD;
import static base.helpers.Constants.LOGIN_USERNAME;

public class LoginingTest extends BaseTest {
    @Test(groups = "regression", priority = 1, description = "Check user can login")
    public void test() {
        homePage().clickLoginLink();
        homePage().insertUserName(LOGIN_USERNAME);
        homePage().insertPassword(LOGIN_PASSWORD);
        homePage().clickLogiButton();
        homePage().verifyWelcomeMessage(LOGIN_USERNAME);
        homePage().logOutTexteist();
        homePage().clickLogout();

    }

}
