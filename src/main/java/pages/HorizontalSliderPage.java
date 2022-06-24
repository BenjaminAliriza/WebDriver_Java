package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.xpath("//input");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSlider(){
        driver.findElement(slider).click();
    }

    public void slideSlider(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT );
    }

    public int getRange(){
        int setRange = Integer.parseInt(driver.findElement(range).getText());
        return setRange;
    }

}
