package tests.US012;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC001 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        // 1.Belirtilen URL` ye gidilir.
        // 2."Singin" butonuna tıklanır.
        // 3."Username or email adress" bölümüne vendor email girilir.
        // 4."Password" bölümüne vendor password girilir.
        // 5."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        // 6. My Account’a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        // 7.Store manager’a tıklanır.      // -------kaldirildi
        alloverPage.storeManagerButton.click();
        // 8.Orders’a tıklanır.
        alloverPage.orders.click();
        // 9.Orders sayfasına erişilebilirlik test edilir.
        Assert.assertTrue(alloverPage.orderText.isEnabled());
        // 10.Sipariş edilen ürünlerin sıralanabilirliği test edilir.
        for (WebElement each: alloverPage.orderHeaderList) {
            Assert.assertTrue(each.isDisplayed());
        }
        //Assert.assertEquals(alloverPage.orderHeaderList.size(),5);

    }
}
