package tests.US012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC002 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen URL` ye gidilir.
        //2."Singin" butonuna tıklanır.
        //3."Username or email adress" bölümüne vendor email girilir.
        //4."Password" bölümüne vendor password girilir.
        //5."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        //6. My Account’a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //7.Store manager’a tıklanır.  // -------kaldirildi
        //8.Couponsa tıklanır. ------->>>>> downloads'a tıklanır
        alloverPage.downloadsButton.click();
                                  //9.İndirimli ürün listesinin görünürlüğü test edilir.

        //9-Kullanici "Henüz indirilecek bir ürün yok."yazısının göründüğünü test eder
        Assert.assertTrue(alloverPage.noDownloadText.isDisplayed());

    }
}
