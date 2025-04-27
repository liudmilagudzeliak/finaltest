package base.pages;

import base.config.PageTools;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

public class Categories extends PageTools {
    private final String categoryitemc = "itemc";

    public ElementsCollection getCategoryItemsList() {
        shouldCollection("id",  CollectionCondition.texts("Phones", "Laptops", "Monitors"), categoryitemc);
        return getElements("id", categoryitemc);


    }
}
