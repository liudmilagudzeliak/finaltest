package base.pages;

import base.config.PageTools;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.*;


public class Slider extends PageTools {
    private final String firstSlidexpath = "//img[@alt= 'First slide']";

public void firstslideimage(String expectedfirstSlide) {
    should("xpath", Condition.attribute("src", expectedfirstSlide), firstSlidexpath);
}


}
