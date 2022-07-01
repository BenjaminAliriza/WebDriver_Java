package base;

import com.google.common.io.Files;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.WindowManager;

import javax.xml.transform.Result;
import java.io.File;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        goHome();
        homePage = new HomePage(driver);
    }
    @BeforeEach
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterAll
    public void tearDown(){
        driver.quit();//driver.close would close window, while driver.quit ends session and closes everything.
    }
//    @AfterEach                try using this website later to get something working (https://www.baeldung.com/junit-testwatcher)
//    public void recordFailure(){
//        var camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        try {
//        Files.move(screenshot, new File("resources/screenshots/test.png"));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}
