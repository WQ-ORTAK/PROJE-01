package tests.SlaytTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TO_Form210 {
    @Test
    public void formTesti() {

        //1 - https://testotomasyonu.com/form adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toFormUrl"));
        //2- Sirt Agrisi ve Carpinti checkbox’larini secin
        TestOtomasyonuFormPage page = new TestOtomasyonuFormPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", page.carpintiCheckboxKutusu);
        //3- Sirt Agrisi ve Carpinti checkbox’larininin seçili
        //olduğunu test edin
        // jse.executeScript("arguments[0].click();",page.sirtAgrisiCheckboxKutusu);
        ReusableMethods.bekle(2);
        page.sirtAgrisiCheckboxKutusu.click();
        ReusableMethods.bekle(2);
        page.carpintiCheckboxKutusu.click();
        Assert.assertTrue(page.sirtAgrisiCheckboxKutusu.isSelected() && page.carpintiCheckboxKutusu.isSelected());
        //4- Seker ve Epilepsi checkbox’larininin seçili
        //olmadigini test edin
        //page.sekerCheckboxKutusu.click();
        Assert.assertFalse(page.sekerCheckboxKutusu.isSelected() ||
                page.epilepsiCheckboxKutusu.isSelected());
        //5- sayfayi kapatin
        Driver.quitDriver();

    }
}
