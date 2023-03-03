package Web_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Set_web{
    WebDriver driver;
    @FindBy(xpath = "(//a[contains(@href,'test')])[6]")
    WebElement clickWeb;
    public Set_web(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void doSetWeb() throws InterruptedException{
        Thread.sleep(4000);
        clickWeb.click();
    }
}
