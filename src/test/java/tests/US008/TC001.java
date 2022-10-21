package tests.US008;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC001 {
    AlloverPage alloverPage=new AlloverPage();
    Actions actions= new Actions(Driver.getDriver());
    @Test
    public void test01() throws IOException {
        // 1.Belirtilen Url ye gidilir.
        // 2."Singin" butonuna tıklanır
        // 3."Username or email adress" bölümüne vendor email girilir
        // 4."Password" bölümüne vendor password girilir.
        // 5."Sing in" butonuna tıklanır.
        // 6. My Account’a tıklanır.
        // 7.Store manager’a tıklanır ve sonrasında Product’a tıklanır
        // 8.Add new butonuna tıklanır
        ReusableMethods.signInStoreManager();
        // 9.Stok kodu ve stok adedinin girilebildiği test edilir.
        for (WebElement each:alloverPage.sMs
             ) {
            Assert.assertTrue(each.isEnabled());
        }
        //Assert.assertTrue(alloverPage.sku.isEnabled());
        //Assert.assertTrue(alloverPage.manageStock.isEnabled());
        //Assert.assertTrue(alloverPage.stockQty.isEnabled());
        //actions.moveToElement(alloverPage.soldIndividually);
        ReusableMethods.waitFor(3);
        alloverPage.jse.executeScript("arguments[0].scrollIntoView();",alloverPage.draft);
        // alloverPage.jse.executeScript("arguments[0].click();", alloverPage.sku);
        //ReusableMethods.scrooltoWebelement(alloverPage.draft);
        alloverPage.sku.sendKeys("1245");
        alloverPage.actions.sendKeys(Keys.TAB, Keys.SPACE, Keys.TAB)
                .sendKeys("100").perform();

        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("urun ekleme erkani");



    }
}
