package exercises;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TheInternetShiftingContent {

    private WebDriver driver;
    private WebElement shiftingContent =  driver.findElement(By.xpath("//a[@href='/shifting_content']"));
    private WebElement menuElement =  driver.findElement(By.linkText("Menu Element"));
    private List<WebElement> menuElements =  driver.findElements(By.xpath("//a"));


    public static void main(String[] args) {
        TheInternetShiftingContent TISC = new TheInternetShiftingContent();
        TISC.countMenuElements();
    }

    public void countMenuElements(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        shiftingContent.click();
        menuElement.click();
        System.out.println(menuElements.size());


    }

}
