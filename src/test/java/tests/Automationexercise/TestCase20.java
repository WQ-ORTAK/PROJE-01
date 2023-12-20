package tests.Automationexercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages._AutomationexercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase20 {

    @Test
    public void testCase20(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        //3. Click on 'Products' button
        _AutomationexercisePage page=new _AutomationexercisePage();
        page.productsLinki.click();

        //4. Verify user is navigated to ALL PRODUCTS page successfully
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(page.allProductsSayfasi.isDisplayed(),"Sayfa görüntülenemedi!");
        //5. Enter product name in search input and click search button
        page.urunAramaKutusu.click();
        page.urunAramaKutusu.sendKeys(ConfigReader.getProperty("aeUrunAdi1"));
        page.urunAraButonu.click();
        //6. Verify 'SEARCHED PRODUCTS' is visible
        softAssert.assertTrue(page.arananUrunlerSayfasi.isDisplayed(),"Urun sayfası görüntülenemedi");
        //7. Verify all the products related to search are visible
        softAssert.assertTrue(page.urun1.isDisplayed(),"Urun bulunamadı");
        //8. Add those products to cart
        ReusableMethods.bekle(2);
        page.addToCard.click();
        ReusableMethods.bekle(2);
        //9. Click 'Cart' button and verify that products are visible in cart
        page.continueButton.click();
        ReusableMethods.bekle(1);
        page.cardLinki.click();
        softAssert.assertTrue(page.urunSepetininGoruntulenmesi.isDisplayed());
        //10. Click 'Signup / Login' button and submit login details
        page.signupLogin.click();
        page.loginEmail.sendKeys("lefvn.1@gmail.com");
        page.loginPassword.sendKeys("nevfel123");
        page.loginButton.click();
        //11. Again, go to Cart page
        page.cardLinki.click();

        //12. Verify that those products are visible in cart after login as well
        softAssert.assertTrue(page.urunSepetininGoruntulenmesi.isDisplayed(),"sepet görüntülenemedi!");
        softAssert.assertAll();
        Driver.quitDriver();
    }

}
