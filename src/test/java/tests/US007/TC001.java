package tests.US007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AlloverPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001 {
    AlloverPage alloverPage=new AlloverPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        //2."Sing in" butonuna tıklanır
        //3."Username or email adress" bölümüne vendor email girilir
        //4."Password" bölümüne verdor password girilir
        //5."Sing in" butonuna tıklanır.
        //6. My Account’a tıklanır.
        //7.Store manager’a tıklanır ve sonrasında Product’a tıklanır
        //8.Add new butonuna tıklanır
        ReusableMethods.signInStoreManager();
        //9.Marka kotegoresinin seçilebildiği test edilir.
        //Elegant Auto group,Green Grass, NodeJS, NS8, RED, SkySuite Tech, Sterling
/*
        for (WebElement each:alloverPage.productBrandlist
        ) {
            //for (String each1:categories_expected
            //    ) {
            // if (each1.equals(each.getText())){
            //ReusableMethods.waitFor(1);
            alloverPage.jse.executeScript("arguments[0].click();",each);
            alloverPage.softAssert.assertTrue(each.isSelected(),"secilmedi");
        }
        alloverPage.softAssert.assertAll();


 */
        for (WebElement each: alloverPage.productBrandsElements
             ) {

            ReusableMethods.jsClick(each);

        }




    }
}
