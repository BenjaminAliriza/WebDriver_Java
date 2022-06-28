package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("D:\\Program Files\\IntelliJ Projects\\WebDriver_Java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Upload failed");
    }

}
