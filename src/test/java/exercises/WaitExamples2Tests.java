package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitExamples2Tests extends BaseTests {

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample2();
        loadingPage.clickStart();
        assertEquals("Hello World!", loadingPage.getLoadedText(), "Text didn't match");
    }

}
