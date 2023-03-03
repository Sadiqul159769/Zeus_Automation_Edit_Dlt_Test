import Web_Pages.Edit_delete_test;
import Web_Pages.Set_web;
import org.testng.annotations.Test;

import java.util.Set;

public class TestRunner extends Setup {
    Set_web objectWeb;
    Edit_delete_test objEditDeleteTest;
    @Test
    public void doTestRunner() throws Exception {
        objectWeb= new Set_web(driver);
        driver.get("https://demo.zeuz.ai/web/level/two/test");
        objectWeb.doSetWeb();
        objEditDeleteTest= new Edit_delete_test(driver);
        objEditDeleteTest.doEditDeleteTest();

    }
}
