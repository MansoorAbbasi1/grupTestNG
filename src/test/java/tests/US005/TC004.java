package tests.US005;

import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TC004 {
    AlloverPage alloverPage=new AlloverPage();

    @Test
    public void test01() throws FileNotFoundException {
        //1.Belirtilen Url ye gidilir.
        //2."Singin" butonuna tıklanır
        //3."Username or email adress" bölümüne vendor email girilir
        //4."Password" bölümüne verdor password girilir
        //5."Sing in" butonuna tıklanır.
        //6. My Account’a tıklanır.
        //7.Store manager’a tıklanır ve sonrasında Product’a tıklanır
        //8.Add new butonuna tıklanır
        ReusableMethods.signInStoreManager();
        //9.Fotoğraf bölümüne tıklanır ve upload files bölümü seçilir.
        alloverPage.addPhoto.click();
        //10.Select files’a tıklanır..
        //alloverPage.selectFiles.click();
        //11.Dosya seçilir ve select butonuna tıklanır.
        //FileInputStream fil= new FileInputStream("src/test/resources/1.png");
        //String farklikisim= System.getProperty("/Users/home");
        //String ayniKisim= "/Desktop/11.png";
        //alloverPage.selectFiles.sendKeys("/Users/mansoorfaizy/Desktop/11.png ");
        //String farkliKisim=System.getProperty("user.home");
        //String ortakKisim= "\\Desktop\\Team10.jpeg";
        //String yuklenecekDosya= farkliKisim+ortakKisim;

        // 3. adim sendKeys ile dosya yolunu, secme butonuna yollayalim
        //alloverPage.selectFilesHepsi.sendKeys(yuklenecekDosya);
        alloverPage.mediaLibrary.click();
        alloverPage.mediaLibraryFirstPhoto.click();
        alloverPage.onSelect.click();
        //12.Fotoğraf bölümüne tıklanır ve upload files bölümü seçilir.
        alloverPage.kucukPhoto.click();
        //13.Dosya seçilir ve select butonuna tıklanır.
        alloverPage.mediaLibraryFirstPhoto.click();
        alloverPage.addToGallery.click();
    }
}
