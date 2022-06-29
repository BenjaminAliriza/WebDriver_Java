package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameText(){
        switchToLeftFrame();
        String text = driver.findElement(body).getText();
        switchToParentFrame();//switch to top
        switchToParentFrame();//switch to parent
        return text;
    }
    public String getBottomFrameText(){
        switchToBottomFrame();
        String text = driver.findElement(body).getText();
        switchToParentFrame();
        return text;
    }
    private void switchToLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }
    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }
    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
}
