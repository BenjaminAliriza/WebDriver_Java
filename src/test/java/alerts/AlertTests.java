package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var jsAlertPage = homePage.clickJSAlertsPage();
        jsAlertPage.triggerAlert();
        jsAlertPage.alert_clickToAccept();
        assertEquals("You successfully clicked an alert",jsAlertPage.getResults(),
                "Result text is incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var jsAlertPage = homePage.clickJSAlertsPage();
        jsAlertPage.triggerConfirm();
        String text = jsAlertPage.alert_getText();
        jsAlertPage.alert_clickToDismiss();
        assertEquals("I am a JS Confirm", text, "Alert text incorrect");//11 minutes in 7.1 Alerts.
    }
}
