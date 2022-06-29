package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NestedFramesTests extends BaseTests {

    @Test
    public void NestedFramesTest(){
        var nestedFramesPage = homePage.clickNestedFramesPage();
        String leftFrameText = nestedFramesPage.getLeftFrameText();
        assertEquals("LEFT", leftFrameText, leftFrameText + "doesn't match: LEFT");
        String bottomFrameText = nestedFramesPage.getBottomFrameText();
        assertEquals("BOTTOM", bottomFrameText, bottomFrameText + "doesn't match: BOTTOM");
    }

}
