package frames;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class frameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWYSIWYGEditorPage();
        editorPage.clearTextArea();
        editorPage.setTextArea("hello ");
        editorPage.clickIncreaseIndent();
        editorPage.setTextArea("world");

        assertEquals("hello world", editorPage.getTextArea(),"text doesn't match");
    }

}
