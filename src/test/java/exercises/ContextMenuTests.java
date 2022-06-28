package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void alertTextTest(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.contextClickHotspot();
        String alertMessage = contextMenuPage.getAlertMessage();
        contextMenuPage.confirmAlert();
        assertEquals("You selected a context menu", alertMessage, "Alert message incorrect.");
    }

}
