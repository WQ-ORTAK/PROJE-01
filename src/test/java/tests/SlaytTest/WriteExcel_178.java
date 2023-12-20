package tests.SlaytTest;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel_178 {

    @Test
    public void test01() throws IOException {
        //1) Yeni bir Class olusturalim WriteExcel
        //2) Yeni bir test method olusturalim writeExcelTest()
        //3) Adimlari takip ederek Sayfa1’deki1.satira kadar gidelim
        String dosyaYolu = "src/test/java/utilities/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sayfa = workbook.getSheet("Sayfa1");

        //4) 5.hucreye yeni bir cell olusturalim
        sayfa.getRow(0).createCell(4);
        //5) Olusturdugumuz hucreye “Nufus” yazdiralim
        sayfa.getRow(0).getCell(4).setCellValue("Nufus");
        //6) 2.satir nufus kolonuna 1500000 yazdiralim
        sayfa.getRow(1).createCell(4).setCellValue(1500000);

        //7) 10.satir nufus kolonuna 250000 yazdiralim
        sayfa.getRow(9).createCell(4).setCellValue(250000);

        //8) 15.satir nufus kolonuna 54000 yazdiralim
        sayfa.getRow(14).createCell(4).setCellValue(54000);

        //9) Dosyayi kaydedelim
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        //10)Dosyayi kapatalim
        fis.close();
        workbook.close();
        fos.close();


    }
}