package additemToCartCritical;

import base.config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Pages.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class AddToCartItemTest extends BaseTest {
    @Test(groups = "regression", priority = 1, description = "Check user can add item to Cart")
    public void addToCartItem() {

        String itemNamefromCategoryPage = homePage().getProductList().get(0).text();
        homePage().getProductList().get(0).click();
        productPage().addProductToCart();
        Alert alert = switchTo().alert();
        Assert.assertEquals(alert.getText(), "Product added");
        alert.accept();
        homePage().clickCartButton();
        Selenide.sleep(2000);
        String cartTextItemName = cartPage().getCartItemList().get(0).text();
        Assert.assertEquals(cartTextItemName, itemNamefromCategoryPage);

    }
}
