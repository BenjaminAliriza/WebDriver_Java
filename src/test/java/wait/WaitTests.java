package wait;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();
        assertEquals("Hello World!", loadingPage.getLoadedText(), "Text didn't match");
    }

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample2();
        loadingPage.clickStart();
        assertEquals("Hello World!", loadingPage.getLoadedText(), "Text didn't match");
    }

}
