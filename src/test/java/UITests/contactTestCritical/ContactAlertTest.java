package UITests.contactTestCritical;

import base.config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Pages.homePage;
import static com.codeborne.selenide.Selenide.switchTo;

public class ContactAlertTest extends BaseTest {
    @Test(groups = "regression", priority = 1, description = "Check user can left message")
    public void contactAlertTest() {
        homePage().clickContact();
        homePage().clickSendMessageButton();
        Alert alert = switchTo().alert();
        Assert.assertEquals(alert.getText(), "Thanks for the message!!");
        alert.accept();
        Selenide.sleep(2000);
        homePage().clickSendMessageButton();
        homePage().contactWindowHidden();
    }

}
