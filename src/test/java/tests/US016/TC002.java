package tests.US016;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Path;

public class TC002 {
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
        //9. Pdf Excel ve Csv olarak indirilebilirliği test edilir.
        for (WebElement each: alloverPage.pdfExcelCSV
             ) {
            each.click();
        }
        ReusableMethods.waitFor(4);
        Assert.assertTrue(Files.exists(Path.of("/Users/mansoorfaizy/Downloads/Store Manager - Allover Commerce.pdf")));
        Assert.assertTrue(Files.exists(Path.of("/Users/mansoorfaizy/Downloads/Store Manager - Allover Commerce.csv")));
        Assert.assertTrue(Files.exists(Path.of("/Users/mansoorfaizy/Downloads/Store Manager - Allover Commerce.xlsx")));


    }
}
