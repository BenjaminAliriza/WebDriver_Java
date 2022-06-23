package hover;

import base.BaseTests;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }

}
