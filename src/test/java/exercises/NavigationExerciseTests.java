package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NavigationExerciseTests extends BaseTests {

    @Test
    public void newTabSwitchTest(){
        var loadingPage = homePage.clickDynamicLoadingPage().crtlClickExample2();
        getWindowManager().switchToNewTab();
        assertTrue(loadingPage.isStartButtonDisplayed());
    }

}
