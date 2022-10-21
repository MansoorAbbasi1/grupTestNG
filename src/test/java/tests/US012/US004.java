package tests.US012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US004 {
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
        ReusableMethods.jsClick(alloverPage.myAccount);
        //7.Account Details’a tıklanır.
        alloverPage.accountDetailsButton.click();
        //8.Hesap bilgisinin görünür oldugu test edilir.
        Assert.assertTrue(alloverPage.accountDetailsText.isDisplayed());
        //9.e posta adresinin görünür oldugu test edilir.
        Assert.assertTrue(alloverPage.emaildegistir.isDisplayed());
        //10.Update edilebilirliği test edilir.
        alloverPage.emaildegistir.clear();
        alloverPage.emaildegistir.sendKeys(ConfigReader.getProperty("alloverTempEmail"));
        ReusableMethods.jsClick(alloverPage.savechanges);
        ReusableMethods.waitFor(5);
        String succesfully= alloverPage.succesfully.getText();
        System.out.println(succesfully);
        Assert.assertEquals(alloverPage.succesfully.getText(),succesfully);
        alloverPage.emaildegistir.clear();
        alloverPage.emaildegistir.sendKeys(ConfigReader.getProperty("alloverValidEmail"));
        ReusableMethods.jsClick(alloverPage.savechanges);
        //11.sayfayı kapatır.
        Driver.closeDriver();


    }
}
