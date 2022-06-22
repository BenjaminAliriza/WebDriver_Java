package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputsLink =  driver.findElement(By.xpath("//a[@href='/inputs']"));
        inputsLink.click();

//      driver.manage().window().fullscreen(); - maximize does the same.
//      driver.manage().window().setSize(new Dimension(375 ,812)); - this way allows a specific size to be set

        System.out.println(driver.getTitle());
        driver.quit(); //driver.close would close window, while driver.quit ends session and closes everything.
    }
}
