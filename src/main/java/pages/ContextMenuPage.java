package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotspot = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void contextClickHotspot() {
        WebElement hotspotEle = driver.findElement(hotspot);
        Actions actions = new Actions(driver);
        actions.contextClick(hotspotEle).perform();
    }

    public String getAlertMessage(){
        String text = driver.switchTo().alert().getText();
        return text;
    }

    public void confirmAlert(){
        driver.switchTo().alert().accept();
    }

}
