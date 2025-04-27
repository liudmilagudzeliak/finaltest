package base;

import base.pages.*;

public class Pages {
    private static HomePage homePage;
    private static Slider slider;
    private static Categories categories;
    private static ProductPage productPage;
    private static CartPage cartPage;
    private static CategoryItems categoryItems;


    public static HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public static Slider slider() {
        if (slider == null) {
            slider = new Slider();
        }
        return slider;
    }

    public static Categories categories() {
        if (categories == null) {
            categories = new Categories();
        }
        return categories;
    }

    public static ProductPage productPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;

    }
    public static CartPage cartPage() {
        if (cartPage == null) {
            cartPage = new CartPage();
        }
        return cartPage;

    }
    public static CategoryItems categoryItems() {
        if (categoryItems == null) {
            categoryItems = new CategoryItems();
        }
        return categoryItems;

    }
}
