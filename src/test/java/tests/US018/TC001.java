package tests.US018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC001 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        // 2.Ana sayfaya gidildiği doğrulanır
        // 3."Sing in" butonuna tıklanır
        // 4."Username or email adress" bölümüne vendor email girilir
        // 5."Password" bölümüne verdor password girilir
        // 6."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        // 7.My Account’a tıklanır.
        ReusableMethods.jsClick(alloverPage.myAccount);
        // 8.Store manager’a tıklanır ve sonrasında Refund’a tıklanır
        alloverPage.storeManagerButton.click();
        ReusableMethods.jsClick(alloverPage.refundButton);
        // 9.RequestID görünürlüğü test edilir.
        Assert.assertTrue(alloverPage.refundRequestId.isDisplayed());
    }
}
