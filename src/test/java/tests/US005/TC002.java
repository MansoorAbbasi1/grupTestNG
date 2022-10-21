package tests.US005;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC002 {
    AlloverPage alloverPage = new AlloverPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() {
        // 1.Belirtilen Url ye gidilir.
        // 2."Singin" butonuna tıklanır
        // 3."Username or email adress" bölümüne vendor email girilir
        // 4."Password" bölümüne verdor password girilir
        // 5."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        // 6. My Account’a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        // 7.Store manager’a tıklanır ve
        alloverPage.storeManagerButton.click();
        // 8. sonrasında Product’a tıklanır
        alloverPage.products.click();
        // 9.Add new butonuna tıklanır
        alloverPage.addNewButton.click();
        // 10.Virtual veya downloadable işaretlenebilirmi test edilir?
        alloverPage.virtualCheckBox.click();
        Assert.assertTrue(alloverPage.virtualCheckBox.isSelected());
        ReusableMethods.waitFor(3);
        alloverPage.downloadableCheckBox.click();
        Assert.assertTrue(alloverPage.downloadableCheckBox.isSelected());
    }
}
