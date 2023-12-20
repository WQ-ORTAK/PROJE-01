package tests.Automationexercise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AaExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase21 {
    @Test
    public void testReview() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        //3. Click on 'Products' button
        AaExercisePage page = new AaExercisePage();
        page.productButonu.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(page.allProductYaziElementi.isDisplayed());
        //5. Click on 'View Product' button
        page.viewProductElementi.click();
        //6. Verify 'Write Your Review' is visible
        Assert.assertTrue(page.writeYourReviewYaziElementi.isDisplayed());
        //7. Enter name, email and review
        //8. Click 'Submit' button
        Actions actions = new Actions(Driver.getDriver());
        actions.click(page.yourNameKutusu).sendKeys("ali")
                .sendKeys(Keys.TAB)
                .sendKeys("ali@ali.com")
                .sendKeys(Keys.TAB)
                .sendKeys("text kutusuna yazi gonderelim")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        //9. Verify success message 'Thank you for your review.'
        String expectedYazi = "Thank you for your review.";
        String actualYazi = page.thankYouYaziElementi.getText();
        Assert.assertEquals(actualYazi,expectedYazi);

        ReusableMethods.bekle(3);
        Driver.closeDriver();


    }
}
