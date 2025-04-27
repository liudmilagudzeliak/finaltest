package sliderlow;

import base.config.BaseTest;
import org.testng.annotations.Test;

import static base.Pages.slider;

public class ImageSliderTest extends BaseTest {
    @Test(groups = "regression", priority = 1, description = "Check images are changed on slider")
    public void imageSliderTest() {
        slider().firstslideimage("https://www.demoblaze.com/Samsung1.jpg");
    }

}
