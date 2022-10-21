package tests.US008;

import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

public class TC002 {
    AlloverPage alloverPage=new AlloverPage();
    @Test
    public void test01() {
        //1.Belirtilen Url ye gidilir.
        //2."Singin" butonuna tıklanır.
        //3."Username or email adress" bölümüne vendor email girilir
        //4."Password" bölümüne vendor password girilir.
        //5."Sing in" butonuna tıklanır.
        //6. My Account’a tıklanır.
        //7.Store manager’a tıklanır ve sonrasında Product’a tıklanır
        //8.Add new butonuna tıklanır
        ReusableMethods.signInStoreManager();
        //9.Backorder seçeneklerinin seçilebilir olduğu test edilir.
        
    }
}
