package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AdminManagementHomePage {

    public AdminManagementHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Menu']")
    public static WebElement menu;

    @FindBy(xpath = "//a[text()='Admin Management']")
    public static WebElement adminManagement;

    @FindBy(xpath = "//*[text()='Contact Get All']")
    public static WebElement contactGetAll;

    @FindBy(xpath = "//*[text()='Logout']")
    public static WebElement logout;

    // Add Vice Dean bölümündeki locateler

    @FindBy(xpath = "//*[@id='name']")
    public static WebElement name;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public static WebElement requiredName;

    @FindBy(xpath = "//*[@id='surname']")
    public static WebElement surname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public static WebElement requiredSurname;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public static WebElement birthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public static WebElement requiredBirthPlace;

    @FindBy(xpath = "//*[@id='birthDay']")
    public static WebElement dateOfBirth;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public static WebElement requiredDateOfBirth;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public static WebElement phoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public static WebElement requiredPhoneNummer;

    @FindBy(xpath = "//*[@id='ssn']")
    public static WebElement ssn;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public static WebElement requiredSsn;

    @FindBy(xpath = "//*[@id='username']")
    public static WebElement userName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public static WebElement requiredUsername;

    @FindBy(xpath = "//*[@id='password']")
    public static WebElement password;

    @FindBy(xpath = "//*[@value='FEMALE']")
    public static WebElement femaleRadioButton;

    @FindBy(xpath = "//*[@value='MALE']")
    public static WebElement maleRadioButton;

    @FindBy(xpath = "//*[text()='Submit']")
    public static WebElement submitButton;


    // Vice Dean Management sayfasindaki uyari ve alert'lerin locateleri

    @FindBy(xpath = "//*[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement Phone12KarakterEksikUyarisi;


    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssn11KarakterEksikUyarisi;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordGirUyarisi;


    @FindBy(xpath = "//*[text()='At least 8 characters']")
    public WebElement password8KarakterEksikUyarisi;

    @FindBy(xpath = "//*[text()='One uppercase character']")
    public WebElement passwordBuyukHarfEksikUyarisi;

    @FindBy(xpath = "//*[text()='One lowercase character']")
    public WebElement passwordKucukHarfEksikUyarisi;

    @FindBy(xpath = "//*[text()='One number']")
    public WebElement passwordRakamEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your name should be at least 2 characters'])[1]")
    public WebElement name2KarakterEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your surname should be at least 2 characters'])[1]")
    public WebElement surname2KarakterEksikUyarisi;

    @FindBy(xpath = "(//*[text()='Your birth place should be at least 2 characters'])[1]")
    public WebElement birthPlace2KarakterEksikUyarisi;


    @FindBy(xpath = "(//*[text()='Your username should be at least 4 characters'])[1]")
    public WebElement userName4KarakterEksikUyarisi;


    @FindBy(xpath = "(//*[text()='Phone number should be exact 12 characters'])[1]")
    public WebElement PhoneNumber12KarakterFazlaUyarisi;

    @FindBy(xpath = "(//*[text()='Please enter valid phone number'])[1]")
    public WebElement PhoneNumberDogruDegilUyarisi;


    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement ssnDogruDegilUyarisi;

    @FindBy(xpath = "(//*[text()='Vice dean Saved'])[1]")
    public WebElement viceDeanSavedUyarisi;

    @FindBy(xpath = "(//*[text()='Admin Saved'])[1]")
    public WebElement adminSavedUyarisi;


    // Vice Dean Listesindeki ilk satir locateleri  ( sayfanin  en alti )

    @FindBy(xpath = "((//tr)[2]/td)[1]")
    public WebElement listeName;

    @FindBy(xpath = "((//tr)[2]/td)[2]")
    public WebElement listeGender;

    @FindBy(xpath = "((//tr)[2]/td)[3]")
    public WebElement listePhoneNummer;

    @FindBy(xpath = "((//tr)[2]/td)[4]")
    public WebElement listeSnn;

    @FindBy(xpath = "((//tr)[2]/td)[5]")
    public WebElement listeUserName;

    @FindBy(xpath = "((//tr)[2]/td)[6]")
    public WebElement listeEdit;

    // Vice Dean Listesindeki  en alt soldaki sayfa ilerletme lokateleri

    @FindBy(xpath = "(//*[@class='page-link'])[1]")
    public WebElement ilkSayfayaGitButtonu;

    @FindBy(xpath = "(//*[@class='page-link'])[1]")
    public WebElement oncekiSayfayaGitButtonu;

    @FindBy(xpath = "(//*[@class='page-link'])[1]")
    public WebElement sayfaNumarasi;

    @FindBy(xpath = "(//*[@class='page-link'])[1]")
    public WebElement sonrakiSayfayaGitButtonu;

    @FindBy(xpath = "(//*[@class='page-link'])[1]")
    public WebElement sonSayfayaGitButtonu;


    // Main menu / Contact Get All  sayfasi locateleri
    // Contact Message altindaki ilk mail bilgileri


    @FindBy(xpath = "((//tr)[2]/td)[1]")
    public WebElement contactName;

    @FindBy(xpath = "((//tr)[2]/td)[2]")
    public WebElement contactMail;

    @FindBy(xpath = "((//tr)[2]/td)[3]")
    public WebElement contactDate;

    @FindBy(xpath = "((//tr)[2]/td)[4]")
    public WebElement subject;

    @FindBy(xpath = "((//tr)[2]/td)[5]")
    public WebElement message;

    @FindBy(xpath = "((//tr)[2]/td)[6]")
    public WebElement deleteButton;







}
