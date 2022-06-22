package login;


import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText().contains( "You logged into a secure area!"),
                "Alert text is incorrect");
    }

}
