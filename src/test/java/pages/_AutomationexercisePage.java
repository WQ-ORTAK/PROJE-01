package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class _AutomationexercisePage {
    public _AutomationexercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(linkText = "Proceed To Checkout")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@data-dismiss='modal']")
    public WebElement continueOnCart;

    @FindBy(xpath = "(//*[@href='/login'])[1]")
    public WebElement signupLogin;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement name;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signup;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement title;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//*[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//*[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//*[@data-qa='first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//*[@data-qa='last_name']")
    public WebElement lastname;

    @FindBy(xpath = "//*[@data-qa='company']")
    public WebElement company;

    @FindBy(xpath = "//*[@data-qa='address']")
    public WebElement address;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//*[@data-qa='state']")
    public WebElement state;

    @FindBy(xpath = "//*[@data-qa='city']")
    public WebElement city;

    @FindBy(xpath = "//*[@data-qa='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@data-qa='mobile_number']")
    public WebElement number;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement account;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@class='col-sm-8']")
    public WebElement loggedInAs;

    @FindBy(xpath = "(//*[@class='container'])[2]")
    public WebElement adres1;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement yorum;

    @FindBy(xpath = "//*[@href='/payment']")
    public WebElement placeOrder;

    @FindBy(xpath = "//*[@data-qa='name-on-card']")
    public WebElement kartIsmi;

    @FindBy(xpath = "//*[@name='card_number']")
    public WebElement kartNo;

    @FindBy(xpath = "//*[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//*[@name='expiry_month']")
    public WebElement ay;

    @FindBy(xpath = "//*[@name='expiry_year']")
    public WebElement yil;

    @FindBy(xpath = "//*[@data-qa='pay-button']")
    public WebElement payButton;

    @FindBy(xpath = "//*[@href='/download_invoice/900']")
    public WebElement download;

    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement finis;


    @FindBy(xpath = "(//*[@class='cart_quantity_delete'])[1]")
    public WebElement X;


    @FindBy(xpath = "//*[@id='cart_info']")
    public WebElement sepetenKaldirildi;

    @FindBy(xpath = "//*[@id=\"product-1\"]/td[1]/a/img")
    public WebElement silinenUrun;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsLinki;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement allProductsSayfasi;

    @FindBy(id = "search_product")
    public WebElement urunAramaKutusu;

    @FindBy(id = "submit_search")
    public WebElement urunAraButonu;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement arananUrunlerSayfasi;

    @FindBy(xpath = "//div[@class='single-products']")
    public List<WebElement> tumUrunlerSayfasi;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement addToCard;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cardLinki;

    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@*='login-button']")
    public WebElement loginButton;

    @FindBy(id = "cart_info")
    public WebElement urunSepetininGoruntulenmesi;

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public WebElement anaSayfa;

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement productButonu;

    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductYaziElementi;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductElementi;

    @FindBy(xpath = "//a[@href='#reviews']")
    public WebElement writeYourReviewYaziElementi;

    @FindBy(id = "name")
    public WebElement yourNameKutusu;

    @FindBy(xpath = "//*[text()='Thank you for your review.']")
    public WebElement thankYouYaziElementi;

    @FindBy(xpath = "//*[@src='/get_product_picture/1']")
    public WebElement firstProductElementi;

    @FindBy(xpath = "//*[@data-product-id='1']")
    public WebElement addToCart1Butonu;


    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continuoShopButonu;

    @FindBy(xpath = "//*[@src='/get_product_picture/2']")
    public WebElement secondProductElementi;

    @FindBy(xpath = "//*[@data-product-id='2']")
    public WebElement addToCart2Butonu;


    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCardElementi;


    @FindBy(xpath = "(//*[@class='product_image'])[1]")
    public WebElement cartProduct1Elementi;

    @FindBy(xpath = "(//*[@class='product_image'])[2]")
    public WebElement cartProduct2Elementi;


    @FindBy(className = "cart_menu")
    public WebElement cartBasliklarElementi;











}