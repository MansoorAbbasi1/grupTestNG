package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC003 {
    AlloverPage alloverPage=new AlloverPage();

    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        //2."Singin" butonuna tıklanır
        //3."Username or email adress" bölümüne vendor email girilir
        //4."Password" bölümüne verdor password girilir
        //5."Sing in" butonuna tıklanır.
        ReusableMethods.signInStoreManager();
        //6. My Account’a tıklanır.
        //alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //7.Store manager’a tıklanır ve
        //alloverPage.storeManagerButton.click();
        //8.sonrasında Product’a tıklanır
        //alloverPage.products.click();
        //9.Add new butonuna tıklanır
        //alloverPage.addNewButton.click();
        //10.Ürün ismi eklenebildiği test edilir( Product title ve satis miktarı)
        //alloverPage.producttitleBox.sendKeys("Team20"+ Keys.TAB);
        alloverPage.actions.sendKeys(alloverPage.productTitleBox,"Team10").sendKeys(Keys.TAB,"20").perform();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(!alloverPage.productTitleBox.getText().isEmpty());
        //Assert.assertTrue(!alloverPage.productTitleBox.);






    }
}
