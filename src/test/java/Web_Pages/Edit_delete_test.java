package Web_Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Edit_delete_test {
    WebDriver driver;
    Sleeping objsleeping;
    @FindBy(xpath = "(//button[@class='btn btn-danger'][contains(.,'Delete')])[1]")
    WebElement checkButtonDlt;
    @FindBy(className="btn btn-primary")
    WebElement confirmDelete;
    @FindBy(xpath = "((//button[contains(@class,'btn btn-warning')])[1]")
    WebElement checkButtonEdit;
    @FindBy(xpath = "//textarea[normalize-space()='1AcD']")
    WebElement writeEditButton;
    @FindBy(xpath = "(//button[@type='button'][contains(@id,'delete')][contains(.,'Save changes')]")
    WebElement saveEditBtn;
    public Edit_delete_test(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void doEditDeleteTest() throws InterruptedException{

//        String checkDlt= checkButtonDlt.getText();
//        System.out.println(checkDlt);
//        if (checkDlt=="Delete"){
//            checkButtonDlt.click();
//        }

        try{
            checkButtonDlt.click();
            objsleeping.doSleep();
            Thread.sleep(4000);
            confirmDelete.click();

        }
        catch (Exception e){
            //System.out.println(e);
        }
        try{
            checkButtonEdit.click();
            objsleeping.doSleep();
            //for edit
            writeEditButton.click();
            writeEditButton.sendKeys("7PaP");
            saveEditBtn.click();
            String SEdit= writeEditButton.getText();
            Assert.assertEquals(SEdit,"You have updated the string in 1 row");

        }
        catch (Exception e){
            //System.out.println(e);
        }
    }
}
