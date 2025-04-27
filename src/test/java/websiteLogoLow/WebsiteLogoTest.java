package websiteLogoLow;

import base.config.BaseTest;
import org.testng.annotations.Test;

import static base.Pages.homePage;
import static base.helpers.Constants.BASE_URL;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertEquals;

public class WebsiteLogoTest extends BaseTest {
    @Test(groups = "regression", priority = 2, description = "Check user redirected to Home page when click logo on Cart page")
    public void websiteLogo() {
        homePage().clickCartButton();
        homePage().clickLogo();
        String currentUrl = url();
        assertEquals(BASE_URL, currentUrl, "URL не співпадає з очікуваним!");
        System.out.println(currentUrl);
    }
}
