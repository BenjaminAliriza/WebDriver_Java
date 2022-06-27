package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SliderTests extends BaseTests {

    @Test
    public void sliderPlusArrow(){

        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.clickSlider();
        sliderPage.slideSlider(value);
        Assertions.assertEquals(value, sliderPage.getRange(), "The range did not match expected.");

    }

}
