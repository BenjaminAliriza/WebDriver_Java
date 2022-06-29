package javascript;

import base.BaseTests;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }

    @Test
    public void TestJSDropDownChanges(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.jsMultipleSelection();
        dropDownPage.selectFromDropDown("Option 1");
        dropDownPage.selectFromDropDown("Option 2");

        Assertions.assertEquals("[Option 1, Option 2]", dropDownPage.getSelectedOptions().toString(),
                "An issue has been detected");
    }

}
