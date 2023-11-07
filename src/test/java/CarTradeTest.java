import com.selenium.base.BaseClass;
import com.selenium.pages.Method2;
import com.selenium.pages.SearchingCar;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;

public class CarTradeTest extends BaseClass {
    SearchingCar searchingCar;
    Method2 method2;
    @BeforeMethod
    public void start(){
        setup();
        searchingCar=new SearchingCar(driver);
        method2=new Method2(driver);
    }
    @Test(priority = 1)
    public void carSearching() throws InterruptedException {
        String checking=searchingCar.selectingCar();
        Assert.assertEquals(checking,"CLIMBER 1.0 AMT [2019-2020]");
    }
    @Test(priority = 0)
    public void methodTwoSearch() throws InterruptedException, AWTException {
        String checking=method2.searchMethod2();
        Assert.assertEquals(checking,"XZA Plus (O) Dark Edition");
    }
    @AfterMethod
    public void end(){
        driver.quit();
    }
}
