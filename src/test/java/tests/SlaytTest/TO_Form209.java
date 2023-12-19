package tests.SlaytTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TO_Form209 {
@Test
    public void formTesti(){

              //1 - https://testotomasyonu.com/form adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toFormUrl"));
              //2- Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
    TestOtomasyonuFormPage testOtomasyonuFormPage=new TestOtomasyonuFormPage();
    Select selectGun =new Select(testOtomasyonuFormPage.dropdownMenuElementleriList.get(0));
    selectGun.selectByIndex(5);
              //3- Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
    Select selectAy =new Select(testOtomasyonuFormPage.dropdownMenuElementleriList.get(1));
    selectAy.selectByValue("nisan");
               //4- Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
    Select selectYil =new Select(testOtomasyonuFormPage.dropdownMenuElementleriList.get(2));
    selectYil.selectByVisibleText("1990");
                //5- Secilen değerleri konsolda yazdirin
    System.out.println("Secilen tarih: "+selectGun.getFirstSelectedOption().getText()+" "
            +selectAy.getFirstSelectedOption().getText()+" "+selectYil.getFirstSelectedOption().getText());
               //6- Ay dropdown menüdeki tum değerleri(value) yazdırın
      List<WebElement> ayDropDownMenu=selectAy.getOptions();
    System.out.println(ReusableMethods.stringListeDonustur(ayDropDownMenu));


    //7- Ay Dropdown menusunun boyutunun 13 olduğunu test edin
    int expectedAyDdm= 13;
    int actualAyDdm=ayDropDownMenu.size();
    Assert.assertEquals(actualAyDdm,expectedAyDdm);

    Driver.quitDriver();

    }
}
