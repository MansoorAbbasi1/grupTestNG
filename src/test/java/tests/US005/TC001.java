package tests.US005;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC001 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        // 1.Belirtilen Url ye gidilir.
        // 2."Sing in" butonuna tıklanır.
        // 3."Username or email adress" bölümüne vendor email girilir
        // 4."Password" bölümüne verdor password girilir
        // 5."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        // 6. My Account’a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        // 7.Store manager’a tıklanır
        alloverPage.storeManagerButton.click();
        // 8.sonrasında Product’a tıklanır
        alloverPage.products.click();
        // 9.Ürün listisenin göründüğü test edilir (status, stock, price, date)
        //Assert.assertTrue(alloverPage.statusText.isDisplayed());
        //Assert.assertTrue(alloverPage.dateText.isDisplayed());
        //Assert.assertTrue(alloverPage.priceText.isDisplayed());
        //Assert.assertTrue(alloverPage.stockText.isDisplayed());
        for (WebElement each:alloverPage.productHeaders
             ) {
            Assert.assertTrue(each.isDisplayed());
        }
    }
}
