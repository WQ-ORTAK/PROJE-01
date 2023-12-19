package tests.SlaytTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Demo {

    @Test
    public void webtableTest() {

        // 1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        //2. Headers da bulunan basliklari yazdirin
        DemoPage demoqaPage = new DemoPage();
        List<WebElement> baslikElementleriList = demoqaPage.baslikElementleriListesi;
        List<String> baslikYazilariList = ReusableMethods.stringListeDonustur(baslikElementleriList);
        System.out.println("Basliklar : " + baslikYazilariList);
        //3. 3.sutunun basligini yazdirin
        System.out.println("Ucuncu baslik : " + baslikYazilariList.get(2));
        //4. Tablodaki tum datalari yazdirin
        List<WebElement> tabloDatalariElementList = demoqaPage.tumDataElementleriListesi;
        List<String> tabloDatalariList = ReusableMethods.stringListeDonustur(tabloDatalariElementList);
        System.out.println("Tum datalar : " + tabloDatalariList);
        //5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<String> doluHucreYaziList = ReusableMethods.stringListeDonustur(demoqaPage.hucrelerListesi);
        int doluHucresayisi = 0;
        for (String each : doluHucreYaziList
        ) {
            if (!each.isBlank()) {
                doluHucresayisi++;
            }
        }
        System.out.println("Dolu hucre sayisi : " + doluHucresayisi);
        //6. Tablodaki satir sayisini yazdirin
        List<String> tabloSatirList = ReusableMethods.stringListeDonustur(demoqaPage.tumDataElementleriListesi);
        System.out.println("Satir sayisi : " + tabloSatirList.size());
        //7. Tablodaki sutun sayisini yazdirin
        System.out.println("Sutun sayisi : " + baslikYazilariList.size());
        //8. Tablodaki 3.kolonu yazdirin
        List<String> ucuncuKolonYazilariList = ReusableMethods.stringListeDonustur(demoqaPage.ucuncuKolonElementleriListesi);
        System.out.println("Ucuncu kolon : " + ucuncuKolonYazilariList);
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        System.out.println("Kiarra maas : " + demoqaPage.kierraMaasElementi.getText());
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
        //sayisini girdigimde bana datayi yazdirsin

        System.out.println(demoqaPage.istenilenHucreBilgisiDondur(2, 6));
        System.out.println(demoqaPage.istenilenHucreBilgisiDondur(3, 1));


        Driver.closeDriver();
    }


}
