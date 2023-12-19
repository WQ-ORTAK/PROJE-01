package tests.SlaytTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TO_219 {

    //1- https://www.testotomasyonu.com/ anasayfasina gidin
    //2- phone icin arama yapin
    //3- Listelenen sonuclardan ilkini tiklayin
    //4- urun ismini kaydedin ve sepete ekleyin
    //5- your cart linkine tiklayin
    //6- kaydettiginiz urun ismi ile sepetteki urun isminin ayni oldugunu test edin
    //7- sayfayi kapatin

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakUrun")+ Keys.ENTER);
        testOtomasyonuPage.aramaSonucuCikanIlkUrun.click();
        String expectedUrunIsmi=testOtomasyonuPage.urunIsmi.getText();
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",testOtomasyonuPage.addToCartLink);
        testOtomasyonuPage.yourCartLink.click();
        String actualUrunIsmi=testOtomasyonuPage.sepettekiUrunIsmi.getText();

        Assert.assertEquals(actualUrunIsmi,expectedUrunIsmi,"Kaydedilen urun ismi ile sepetteki urun ismi ayni degildir");

        Driver.closeDriver();


    }
}