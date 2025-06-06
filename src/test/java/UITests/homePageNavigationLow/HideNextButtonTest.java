package UITests.homePageNavigationLow;

import base.config.BaseTest;
import org.testng.annotations.Test;

import static base.Pages.homePage;

public class HideNextButtonTest extends BaseTest {
    @Test(groups = "regression", priority = 2, description = "ACheck user can switch between pages")
    public void testHideNextButton() {
        homePage().clickNextButton();
        homePage().clickNextButton();
        homePage().nextButtonHidden();
        homePage().clickPreviousButton();
    }

}
