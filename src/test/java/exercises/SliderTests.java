package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SliderTests extends BaseTests {

    @Test
    public void sliderPlusArrow(){

        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.clickSlider();
        sliderPage.slideSlider();
        Assertions.assertEquals(4, sliderPage.getRange(), "The range did not match expected.");

    }

}
