package placeOrderCritical;

import base.config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Pages.*;
import static base.helpers.Constants.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class SubmitOrderTest extends BaseTest {
    @Test(groups = "regression", priority = 1, description = "Check user can place the order")
    public void submitOrder() {
        homePage().getProductList().get(0).click();
        productPage().addProductToCart();
        Alert alert = switchTo().alert();
        Assert.assertEquals(alert.getText(), "Product added");
        alert.accept();
        homePage().clickCartButton();
        Selenide.sleep(2000);
        cartPage().clickPlaceOrderButton();
        cartPage().addUserDataClickPurchaise(FIRSTNAME, COUNTRY, CITY, CREDITCARD, MOUNTH, YEAR);
        cartPage().thankYouDataVerify("Thank you for your purchase!");

    }
}