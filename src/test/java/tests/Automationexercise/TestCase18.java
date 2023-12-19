package tests.Automationexercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.MenCatogoryJeansPage;
import pages.WomenCatogoryDressPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase18 extends TestBaseRapor {
    @Test
    public void ViewCategoryProductsTest() {
        extentTest = extentReports.createTest("View Category Products Testi", "Kullanici tikladigi katogorinin gorunurlulugunu test eder.");
        //  1. Launch browser
        //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("oeUrl"));
        SoftAssert softAssert = new SoftAssert();
        extentTest.info("Kullanici http://automationexercise.com sayfasinia girer");
        //  3. Verify that categories are visible on left side bar
        HomePage homePage = new HomePage();
        softAssert.assertTrue(homePage.categoriler.isDisplayed(), "katogori kismi gorunur degil");
        extentTest.pass("Katogori sayfasinda oldugunu test eder");
        //  4. Click on 'Women' category
        ReusableMethods.bekle(2);
        homePage.womenCatogory.click();
        extentTest.info("Women katogorisine tiklar");

        //  5. Click on any category link under 'Women' category, for example: Dress
        homePage.dressWomen.click();
        extentTest.info("Women katogorisinin altinda dress bolumune tiklar");
        //  6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        WomenCatogoryDressPage womenCatogoryDressPage = new WomenCatogoryDressPage();
        String actualText = womenCatogoryDressPage.womenDressProducts.getText();
        String expectedText = "WOMEN - TOPS PRODUCTS";
        Assert.assertEquals(actualText, expectedText, "Gorulen yazi farkli");
        extentTest.pass("Sayfada WOMEN - TOPS PRODUCTS yazinin gorundugunu test eder");

        //  7. On left side bar, click on any sub-category link of 'Men' category
        homePage.menCatogory.click();
        extentTest.info("Men katogorisine tiklar");
        homePage.jeansMen.click();
        extentTest.info("Men katogorisinin altinda birine tiklar");

        //  8. Verify that user is navigated to that category page
        MenCatogoryJeansPage menCatogoryJeansPage = new MenCatogoryJeansPage();
        softAssert.assertTrue(menCatogoryJeansPage.menJeansProducts.isDisplayed());
        extentTest.pass("menJeans katogari sayfasinda oldugunu test eder");
        softAssert.assertAll();
    }
}