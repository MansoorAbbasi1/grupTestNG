package tests.US017;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC001 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        //2.Ana sayfaya gidildiği doğrulanır
        //3."Sing in" butonuna tıklanır
        //4."Username or email adress" bölümüne vendor email girilir
        //5."Password" bölümüne verdor password girilir
        //6."Sing in" butonuna tıklanır.
        ReusableMethods.signIn();
        //7.My Account’a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //8.Store manager’a tıklanır ve sonrasında Customer’a tıklanır
        alloverPage.storeManagerButton.click();
        ReusableMethods.jsClick(alloverPage.customersButton);
        //9. "Add new" butonuna tıklanır.
        alloverPage.customersAddNew.click();
        //10.Billing adres eklenebilirliği test edilir.( isim,soyisim, şirket ismi,tel, adres1, adres2,ülke, sehir, posta kodu)
        (alloverPage.customerBillingList).forEach(t->t.sendKeys(Faker.instance().name().name()));
        ReusableMethods.selectMethod(alloverPage.customerBillingCountry).selectByIndex(1);



    }
}
