package UITests.itemDetailLow;

import base.config.BaseTest;
import base.pages.ItemDetails;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static base.Pages.categoryItems;
import static base.Pages.homePage;

public class ItemdetailsTest extends BaseTest {
    @Test(groups = "regression", priority = 2, description = "Check item details on the Category and Product page are the same")
    public void itemdetailsTest() {
        List<ItemDetails> itemsList = homePage().getItemsList();
        homePage().getProductList().get(0).click();
        ItemDetails ItemDetails =  categoryItems().getItemDetails();
        Assert.assertTrue(itemsList.contains(ItemDetails), "Item details not found" + itemsList + "does not contains detailed item " +ItemDetails);


    }
}
