package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver ;

    private By confirmText = By.xpath("//h1");

    public EmailSentPage(WebDriver driver){
        this.driver=driver;
    }

    public String getConfirmation(){
        String confirmedMessage = driver.findElement(confirmText).getText();
        return confirmedMessage;
    }

}
