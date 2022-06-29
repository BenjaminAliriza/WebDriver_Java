package javascript;

import base.BaseTests;
import org.junit.jupiter.api.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }

}
