package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShiftingContentTests {

    private WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        ShiftingContentTests TISC = new ShiftingContentTests();
        TISC.countMenuElements();
    }

    public void countMenuElements() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingContent =  driver.findElement(By.xpath("//a[@href='/shifting_content']"));
        shiftingContent.click();

        WebElement menuElement =  driver.findElement(By.xpath("//a[@href='/shifting_content/menu']"));
        menuElement.click();

        List<WebElement> menuElements =  driver.findElements(By.xpath("//li"));
        System.out.println(menuElements.size());
        driver.quit();

    }

}
