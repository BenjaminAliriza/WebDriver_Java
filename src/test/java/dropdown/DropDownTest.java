package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections.");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }

}
