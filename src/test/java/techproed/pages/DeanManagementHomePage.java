package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DeanManagementHomePage {

    public DeanManagementHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagementButonu;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequired;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequired;

    @FindBy(xpath = "//label[.='Gender']")
    public WebElement gender;

    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement female;

    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement male;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDay;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement birthDayRequired;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneNumberRequired;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement ssnRequired;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement usernameRequired;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordEnterYourPassword;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;

    @FindBy(xpath = "//div[text()='One uppercase character']")
    public WebElement uppercase;

    @FindBy(xpath = "//div[text()='One lowercase character']")
    public WebElement lowercase;

    @FindBy(xpath = "//div[text()='One number']")
    public WebElement oneNumber;

    @FindBy(xpath = "//div[text()='Dean Saved']")
    public WebElement alertDeanSaved;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnAlert;

    @FindBy(xpath = "(//table//tbody//tr)[11]")
    public WebElement listVeri;

    @FindBy(xpath = "//span[.='Last']")
    public WebElement sonSayfa;

    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement birSonrakiSayfa;
            ;
    @FindBy(xpath = "//tbody//tr[11]")
    public WebElement listonbirinciSatir;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[11]")
    public WebElement editButonu;

    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement editPassword;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editName;

    @FindBy(xpath = "(//*[@id='phoneNumber'])[2]")
    public WebElement editPhoneNumber;

    @FindBy(xpath = "(//*[@id='ssn'])[2]")
    public WebElement editSsn;

    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement editUserName;

    @FindBy(xpath = "(//*[@class='form-check-input'])[3]")
    public WebElement editGender;

    @FindBy(xpath = "(//div[.='Dean updated Successful'])[5]")////div[contains(text(),'Dean updated Successful')]
    public WebElement deanUpdateSuccesful;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmit;


    @FindBy(xpath = "//tbody//tr//td[5]")
    public WebElement usernameList;

}