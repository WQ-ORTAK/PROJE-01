package tests.SlaytTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TO_218 {


    //1- https://www.testotomasyonu.com/ anasayfasina gidin
    //2- login linkine basin
    //3- 3 farkli test method’u olusturun.
    //- gecerli username, gecersiz password
    //- gecersiz username, gecerli password
    //- gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin


    TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
    @Test
    public void gecerliEmailGecersizPassword(){
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        testOtomasyonuPage.accountLink.click();
        testOtomasyonuPage.emailLogin.sendKeys(ConfigReader.getProperty("toValidEmail"));
        testOtomasyonuPage.passwordLogin.sendKeys(ConfigReader.getProperty("toInvalidPassword"));
        testOtomasyonuPage.signinButton.click();
        Assert.assertTrue(testOtomasyonuPage.wrongLoginText.isDisplayed());


    }
    @Test(dependsOnMethods = "gecerliEmailGecersizPassword")
    public void gecersizEmailGecerliPassword(){
        testOtomasyonuPage.emailLogin.clear();
        testOtomasyonuPage.emailLogin.sendKeys(ConfigReader.getProperty("toInvalidEmail"));
        testOtomasyonuPage.passwordLogin.clear();
        testOtomasyonuPage.passwordLogin.sendKeys(ConfigReader.getProperty("toValidPassword"));
        testOtomasyonuPage.signinButton.click();
        Assert.assertTrue(testOtomasyonuPage.wrongLoginText.isDisplayed());

    }
    @Test(dependsOnMethods = "gecersizEmailGecerliPassword")
    public void gecersizEmailGecersizPassword(){
        testOtomasyonuPage.emailLogin.clear();
        testOtomasyonuPage.emailLogin.sendKeys(ConfigReader.getProperty("toInvalidEmail"));
        testOtomasyonuPage.passwordLogin.clear();
        testOtomasyonuPage.passwordLogin.sendKeys(ConfigReader.getProperty("toInvalidPassword"));
        testOtomasyonuPage.signinButton.click();
        Assert.assertTrue(testOtomasyonuPage.wrongLoginText.isDisplayed());
        Driver.closeDriver();


    }

}