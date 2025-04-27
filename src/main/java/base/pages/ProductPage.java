package base.pages;

import base.config.PageTools;

import static base.helpers.CustomConditions.buttonsCondition;

public class ProductPage extends PageTools {
    private final String addToCartButton = ".btn.btn-success.btn-lg";


    public void addProductToCart() {
        should("css", buttonsCondition,addToCartButton );
        click("css", addToCartButton);
    }
}
