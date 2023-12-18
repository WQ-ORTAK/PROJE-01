package tests.automationexercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationexercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Test03 {
    @Test
    public void test01() {

        //1. Launch browser
        //2. Navigate to url 'http://www.automationexercise.com/'
        Driver.getDriver().get(ConfigReader.getProperty("autUrl"));

        //3. Verify that home page is visible successfully
        automationexercisePage page = new automationexercisePage();

        String expedtedUrl = "https://www.automationexercise.com/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expedtedUrl);


        //4. Add products to cart
        page.urun1.click();
        page.onayla.click();
        page.urun2.click();
        page.onayla.click();

        //5. Click 'Cart' button
        page.cart.click();

        //6. Verify that cart page is displayed
        Assert.assertTrue(page.sepetinGoruntulenmesi.isDisplayed());

        //7. Click 'X' button corresponding to particular product
        page.X.click();
        ReusableMethods.bekle(1);



        //8. Verify that product is removed from the cart

        Assert.assertFalse(page.silinenUrun.isEnabled());







    }
}

