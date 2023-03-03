import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {
    WebDriver driver;
    @BeforeTest
    public void setupFile(){
        driver= new ChromeDriver();
        driver.manage().window();
    }
}
