package base.pages;


import base.config.PageTools;

public class CategoryItems extends PageTools {

    private final String itemTittle = "//div[@id='tbodyid']/h2";
    private final String itemPrice = "//div[@id='tbodyid']/h3";

    public ItemDetails getItemDetails() {
        ItemDetails item = new ItemDetails();

        item.setProductName(getText("xpath", itemTittle));
        item.setProductPrice(getText("xpath", itemPrice));

        return item;
    }
}
