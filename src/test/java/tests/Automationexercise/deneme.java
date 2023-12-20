package tests.Automationexercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AaExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class deneme {

    @Test
    public void deneme(){

        //1. Launch browser
        AaExercisePage page=new AaExercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        //3. Click on 'Products' button
        page.productsLinki.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(page.allProductsSayfasi
                  .isDisplayed(),"All Products sayfasina gidilemedi!");
        //5. Enter product name in search input and click search button
        page.urunAramaKutusu.sendKeys(ConfigReader.getProperty("aeUrunAdi1"));
        page.urunAraButonu.click();

        //6. Verify 'SEARCHED PRODUCTS' is visible
        softAssert.assertTrue(page.arananUrunlerSayfasi
                  .isDisplayed(),"Aranan ürünler bulunamadı!");

        //7. Verify all the products related to search are visible
         Driver.getDriver().navigate().back();
        //JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        //jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",page.arananUrunlerSayfasi);
        ReusableMethods.bekle(3);
        System.out.println(ReusableMethods.stringListeDonustur(page.tumUrunlerSayfasi).size());
        int expectedUrunSayisi=34;
        int actualUrunSayisi=page.tumUrunlerSayfasi.size();
        softAssert.assertEquals(actualUrunSayisi,expectedUrunSayisi,
                "Bulunan ürün sayısı eşit değildir!");
        //8. Add those products to cart
        page.urunAramaKutusu.clear();
        page.urunAramaKutusu.sendKeys(ConfigReader.getProperty("aeUrunAdi2"));
        page.urunAraButonu.click();

        page.urunAramaKutusu.sendKeys(ConfigReader.getProperty("aeUrunAdi1"));
        page.urunAraButonu.click();

        //9. Click 'Cart' button and verify that products are visible in cart
        //10. Click 'Signup / Login' button and submit login details
        //11. Again, go to Cart page
        //12. Verify that those products are visible in cart after login as well
        softAssert.assertAll();
    }

    // 1. Tarayıcıyı başlatın
    //2. URL'ye gidin 'http://automationexercise.com'
    //3. 'Ürünler'e tıklayın; düğme
    //4. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla yönlendirildiğini doğrulayın
    //5. Arama girişine ürün adını girin ve ara düğmesine tıklayın
    //6. 'ARAYAN ÜRÜNLER'i doğrulayın görünür
    //7. Aramayla ilgili tüm ürünlerin görünür olduğunu doğrulayın
    //8. Bu ürünleri sepete ekleyin
    //9. 'Sepet'i tıklayın; düğmesine basın ve ürünlerin sepette göründüğünü doğrulayın
    //10. 'Kaydol / Giriş Yap'ı tıklayın. düğmesine basın ve oturum açma ayrıntılarını gönderin
    //11. Tekrar Sepet sayfasına gidin
    //12. Giriş yaptıktan sonra bu ürünlerin sepette de göründüğünü doğrulayın.

}
