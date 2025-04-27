package base.pages;

import base.config.PageTools;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import static base.helpers.CustomConditions.*;
import static com.codeborne.selenide.Condition.clickable;

public class CartPage extends PageTools {
    private final String productName = "//tr/td[2]";
    private final String placeOrderButton = "//button[contains(text(), 'Place Order')] ";
    private final String nameField = "name";
    private final String countryField = "country";
    private final String cityField = "city";
    private final String creditCardField = "card";
    private final String monthField = "month";
    private final String yearField = "year";
    private final String purchaseButton = "//button[contains(text(), 'Purchase')]";
    private final String thankYouDataText = "//h2[contains(text(), 'Thank you for your purchase!')] ";

    public ElementsCollection getCartItemList() {
        should("xpath", clickable,productName );
        return getElements("xpath", productName);
    }
    public void clickPlaceOrderButton() {
        should("xpath", buttonsCondition,placeOrderButton);
        click("xpath", placeOrderButton);
    }
    public void addUserDataClickPurchaise(String name, String country, String city, String creditCard, String month, String year) {
        type("id",name,nameField );
        type("id",country,countryField );
        type("id",city,cityField );
        type("id",creditCard,creditCardField );
        type("id",month,monthField );
        type("id",year,yearField );
        should("xpath",buttonsCondition,purchaseButton );
        click("xpath",purchaseButton);

    }
    public void thankYouDataVerify(String thankYouText) {
        getText("xpath", thankYouDataText, thankYouText);
    }

}
