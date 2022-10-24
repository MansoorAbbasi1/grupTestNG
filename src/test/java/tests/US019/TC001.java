package tests.US019;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC001 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        //2."Sing in" butonuna tıklanır
        //3."Username or email adress" bölümüne vendor email girilir
        //4."Password" bölümüne verdor password girilir
        //5."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        //6.My Account’a tıklanır.
        ReusableMethods.jsClick(alloverPage.myAccount);
        //7.Store manager’a tıklanır ve sonrasında Following’e tıklanır
        alloverPage.storeManagerButton.click();
        ReusableMethods.jsClick(alloverPage.followersButton);
        //8.İsim ve e posta görünürlüğü test edilir.
        for (WebElement each: alloverPage.followersNameEmail
             ) {
            Assert.assertTrue(each.isDisplayed());
        }
    }
}
