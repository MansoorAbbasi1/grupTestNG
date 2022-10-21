package tests.US003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC002 {
    AlloverPage alloverPage = new AlloverPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void test01() {
        //Belirtilen URL` ye gidilir
        //Giris yap' a tiklanir
        //Gecerli kullanici bilgileri girilir
        //Giris yap' a tiklanir
        ReusableMethods.signIn();
        //MyAccount Tiklanir
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //Hesabim sayfasina giris yapildigi test edilir
        Assert.assertTrue(alloverPage.myAccountText.isDisplayed());
        //Acilan sayfada siparisler bolumune tiklanir
        alloverPage.ordersButton.click();
        //Acilan sayfada Browse Products(Urunlere Goz At) butonuna tiklanir
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.goShop);
        //Magaza butonunun gorunur oldugu test edilir
        Assert.assertTrue(alloverPage.shopText.isDisplayed());
        //Rastgele 5 urun secilir ve sepete eklenir
        ReusableMethods.hover(alloverPage.sepeteEkle);
        ReusableMethods.waitFor(2);
        for (int i = 0; i <5 ; i++) {
            alloverPage.jse.executeScript("arguments[0].scrollIntoView(true);",alloverPage.sepeteEkle);
            alloverPage.jse.executeScript("arguments[0].click();",alloverPage.sepeteEkle);

        }
        /*for (WebElement each:liste
             ) {
            ReusableMethods.waitFor(3);
        actions.moveToElement(alloverPage.sepeteEkle).click(each).perform();

        }
        */

        //Urunlerin sepette gorundugu test edilir
    }


}
