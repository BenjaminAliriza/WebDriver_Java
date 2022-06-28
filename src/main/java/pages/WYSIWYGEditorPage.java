package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentBtn = By.xpath("//div/button[@title='Increase indent']");
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void clickIncreaseIndent(){
        driver.findElement(increaseIndentBtn).click();
    }

    public String getTextArea(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameID);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
