package tests.US012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class US003 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen URL` ye gidilir.
        //2."Singin" butonuna tıklanır.
        //3."Username or email adress" bölümüne vendor email girilir.
        //4."Password" bölümüne vendor password girilir.
        //5."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        //6. My Account'a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //7.Address'lere tıklanır.
        alloverPage.addressesButton.click();
        //8.Fatura adresi görünürlüğü test edilir.
        Assert.assertTrue(alloverPage.billingAddressText.isDisplayed());
        //9.Gönderim adresi görünürlüğü test edilir.
        Assert.assertTrue(alloverPage.shippingAddressText.isDisplayed());
    }
}
