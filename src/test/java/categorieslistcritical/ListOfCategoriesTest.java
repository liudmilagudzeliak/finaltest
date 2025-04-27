package categorieslistcritical;

import base.config.BaseTest;
import org.testng.annotations.Test;

import static base.Pages.categories;

public class ListOfCategoriesTest extends BaseTest {
    @Test(groups = "regression", priority = 1, description = "Check category list")
    public void listOfCategoriesTest() {
      categories().getCategoryItemsList();

    }
}
