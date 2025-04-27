package base.pages;

import base.config.BaseTest;
import base.config.PageTools;
import base.helpers.Constants;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.util.ArrayList;
import java.util.List;

import static base.helpers.CustomConditions.*;
import static base.helpers.CustomConditions.hidden;
import static com.codeborne.selenide.Condition.*;


public class HomePage extends PageTools {
    private final String loginLink = "login2";
    private final String passwordField = "loginpassword";
    private final String usernamefield = "loginusername";
    private final String logiButton = "//*[@id='logInModal']//button[text()='Log in']";
    private final String welcomeMessage = "nameofuser";
    private final String logoutButton = "//ul/li/a[@id='logout2']";
    private final String nextButton = "next2";
    private final String previousButton = "prev2";
    private final String contactButton = "//ul/li/a[@ data-target='#exampleModal']";
    private final String sendMessageButton = "//button[@class='btn btn-primary' and contains(text(), 'Send message')]";
    private final String contactModalWindow = ".modal-content";
    private final String productTittle = ".card-title";
    private final String cartButton = "cartur";
    private final String logoLink = "nava";
    private final String productName = "//div[@class= 'card-block']/h4/a";
    private final String productPrice = "//div[@class= 'card-block']/h5";


    public void clickLoginLink() {
        click("id", loginLink);
    }

    public void insertUserName(String username) {
        should("id", inputCondition,usernamefield);
        type("id", Constants.LOGIN_USERNAME, usernamefield);

    }
    public void insertPassword(String loginPassword) {
        should("id", inputCondition,passwordField);
        type("id", Constants.LOGIN_PASSWORD, passwordField);
    }
    public void clickLogiButton() {
        should("xpath", inputCondition,logiButton);
        click("xpath", logiButton);
    }
    public void verifyWelcomeMessage(String loginUsername) {
        shouldhave("id", text("Welcome "+ Constants.LOGIN_USERNAME),welcomeMessage);
    }
    public void clickLogout() {
        should("xpath", inputCondition,logoutButton);
        click("xpath",logoutButton );
    }
    public void logOutTexteist() {
        shouldhave("xpath", text("Log out"),logoutButton);
    }
    public void clickNextButton() {
        should("id", buttonsCondition,nextButton);
        click("id", nextButton);
    }
    public void nextButtonHidden() {
        should("id", hidden, nextButton);
    }

    public void clickPreviousButton() {
        should("id", inputCondition,previousButton);
        click("id", previousButton);
    }
    public void clickContact() {
        should("xpath", buttonsCondition,contactButton);
        click("xpath", contactButton);

    }
    public void clickSendMessageButton() {
        should("xpath", buttonsCondition,sendMessageButton);
        click("xpath", sendMessageButton);
    }
    public void contactWindowHidden() {
        should("css", hidden, contactModalWindow);
    }
    public ElementsCollection getProductList() {
        shouldCollection("css", CollectionCondition.size(9), productTittle);
        return getElements("css", productTittle);

    }
    public void clickCartButton() {
        should("id", buttonsCondition,cartButton);
        click("id", cartButton);
    }
    public void clickLogo() {
        should("id", buttonsCondition, logoLink);
        click("id", logoLink);
    }
    public List<ItemDetails> getItemsList() {
        List<ItemDetails> itemList = new ArrayList<>();

        List<String> headersList = getElementsText("xpath", productName);
        List<String> pricesList = getElementsText("xpath", productPrice);

        for (int i = 0; i < headersList.size(); i++) {
            ItemDetails item = new ItemDetails();

            item.setProductName(headersList.get(i));
            item.setProductPrice(pricesList.get(i));

            itemList.add(item);
        }
        return itemList;
    }




}
