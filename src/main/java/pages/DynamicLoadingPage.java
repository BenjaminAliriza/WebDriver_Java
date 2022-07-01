package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1Link = By.xpath("//a[@href='/dynamic_loading/1']");
    private By example2Link = By.xpath("//a[@href='/dynamic_loading/2']");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(example2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page crtlClickExample2(){
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).click(driver.findElement(example2Link)).perform();
        return new DynamicLoadingExample2Page(driver);
    }
}
