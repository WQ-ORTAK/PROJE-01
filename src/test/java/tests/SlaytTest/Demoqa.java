package tests.SlaytTest;

import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Demoqa {

    public void webtableTest(){

        // 1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("demo"));
        //2. Headers da bulunan basliklari yazdirin
        DemoqaPage demoqaPage = new DemoqaPage();
        //3. 3.sutunun basligini yazdirin
        //4. Tablodaki tum datalari yazdirin
        //5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        //6. Tablodaki satir sayisini yazdirin
        //7. Tablodaki sutun sayisini yazdirin
        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
        //sayisini girdigimde bana datayi yazdirsin
    }


}
