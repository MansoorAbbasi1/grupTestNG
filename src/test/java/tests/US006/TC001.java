package tests.US006;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AlloverPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC001 {
    AlloverPage alloverPage=new AlloverPage();
    @Test
    public void test01() {

        // 1.Belirtilen URL` ye gidilir
        // 2."Singin" butonuna tıklanır.
        // 3."Username or email adress" bölümüne vendor email girilir.
        // 4."Password" bölümüne verdor password girilir.
        // 5."Sing in" butonuna tıklanır.
        // 6. My Account’a tıklanır.
        // 7.Store manager’a tıklanır ve
        ReusableMethods.signInStoreManager();
        // 8.sonrasında Product’a tıklanır
        // 9.Add new butonuna tıklanır.
        // 10.Kategorilerin seçilebildiği test edilir.
        //List<String> categories_expected= new ArrayList<>(Arrays.asList("Besin takviyeleri", "Best Seller", "Elektronics", "Ev & yasam", "Indirimli ürünler", "Books & Music & Film", "Kozmetik", "kisisel", "Moda", "Clothing", "Toys & Games", "Taki Aksesuar" , "New Arrivals"));


        /*
        SoftAssert softAssert=new SoftAssert();
        for (WebElement each:alloverPage.categorieslist
        ) {
            //for (String each1:categories_expected
            //    ) {
            // if (each1.equals(each.getText())){
            //ReusableMethods.waitFor(1);
            alloverPage.jse.executeScript("arguments[0].click();",each);
            softAssert.assertTrue(each.isSelected(),"secilmedi");
        }
        softAssert.assertAll();

         */

        for (WebElement each: alloverPage.categoriesList
        ) {

            ReusableMethods.jsClick(each);

        }
    }
}
