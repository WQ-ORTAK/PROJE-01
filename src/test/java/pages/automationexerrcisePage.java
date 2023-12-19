package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class automationexerrcisePage {

public automationexerrcisePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement urun1;

    @FindBy(xpath = "//*[@data-dismiss='modal']")
    public WebElement onayla;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement urun2;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cart;

    @FindBy(xpath = "(//div[@class='container'])[2]")
    public WebElement sepetinGoruntulenmesi;

    @FindBy(xpath = "(//*[@class='cart_quantity_delete'])[1]")
    public WebElement X;

    @FindBy(xpath = "//*[@id='cart_info']")
    public WebElement sepetenKaldirildi;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[1]/a/img")
    public WebElement silinenUrun;




}

