package tests.US017;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC003 {
    AlloverPage alloverPage = new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        //2.Ana sayfaya gidildiği doğrulanır
        //3."Sing in" butonuna tıklanır
        //4."Username or email adress" bölümüne vendor email girilir
        //5."Password" bölümüne verdor password girilir
        ReusableMethods.signIn();
        //7.My Account’a tıklanır.
        alloverPage.jse.executeScript("arguments[0].click();",alloverPage.myAccount);
        //8.Store manager’a tıklanır ve sonrasında Customer’a tıklanır
        alloverPage.storeManagerButton.click();
        ReusableMethods.jsClick(alloverPage.customersButton);
        //9. "Add new" butonuna tıklanır.
        alloverPage.customersAddNew.click();
        //10."Same as biliing" butonuna tıklanır.
        ReusableMethods.jsClick(alloverPage.customerSameasBillingButton);
        //11.Tüm adres bilgilerinin farklı olarak eklenebilirliği test edilir.
        (alloverPage.customerShippingList).forEach(t->t.sendKeys(Faker.instance().name().name()));
        ReusableMethods.selectMethod(alloverPage.customerShippingCountry).selectByIndex(1);
        //12, Submit'e tıklanır.
        ReusableMethods.jsClick(alloverPage.customerSubmitButton);

    }
}
