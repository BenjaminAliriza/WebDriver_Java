package exercises;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.EmailSentPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){

        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieveButton();
        String confirmMessage = emailSentPage.getConfirmation();
        Assertions.assertTrue(confirmMessage.contains("Internal Server Error"), "Something went wrong");

    }

}
