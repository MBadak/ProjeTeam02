package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US15HomePage {

    public US15HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[2]")
    public WebElement loginbuton;//.

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[2]/nav/div/span/a/img")
    public WebElement sayfaAssert;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/div")
    public WebElement loginsayfaAssert;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement loginusername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement loginpassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginLogin;
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div/nav/button")
    public WebElement Menu;
    @FindBy(xpath = "(//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[3])[2]")
    public WebElement StudentManagement;
    @FindBy(xpath = "//*[@id=\"advisorTeacherId\"]")
    public WebElement Chooseteacher;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement studentName;
    @FindBy(xpath = "//*[@id=\"fatherName\"]")
    public WebElement studentfathername;
    @FindBy(xpath = "//*[@id=\"motherName\"]")
    public WebElement studentmothername;
    @FindBy(xpath = "//*[@id=\"phoneNumber\"]")
    public WebElement studentPhone;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement studentemail;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[4]/div/div[1]/div/input")
    public WebElement studentgender;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[4]/div/div[2]/div/input")
    public WebElement malegender;
    @FindBy(xpath = "//*[@id=\"birthDay\"]")
    public WebElement studentbirthDay;
    @FindBy(xpath = "//*[@id=\"ssn\"]")
    public WebElement studentssn;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement studentpassword;
    @FindBy(xpath = "//*[@id=\"surname\"]")
    public WebElement studentsurname;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[6]/div/button")
    public WebElement studentsubmit;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[2]/div[2]/ul/li[4]/a/span[1]")
    public WebElement sayfayigecir;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[2]/span")
    public WebElement Assert;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[1]/span")
    public WebElement studentnumberAssert;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[2]/div/div")
    public WebElement nameRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[3]/div/div")
    public WebElement surnameRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[2]/div/div")
    public WebElement emailRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[3]/div/div")
    public WebElement phoneRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[5]/div/div")
    public WebElement dateofbrithRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[1]/div/div")
    public WebElement SsnRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[2]/div/div")
    public WebElement usernameRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[3]/div/div")
    public WebElement fathernameRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[4]/div/div")
    public WebElement mothernameRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[5]/div/div")
    public WebElement passwordRequired;
    @FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[1]/span")
    public WebElement stidentNumberAssert;
    @FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[2]/div[2]/ul/li[4]/a/span[1]")
    public WebElement sayfapass;
    @FindBy(xpath ="//*[text()='Student saved Successfully']")
    public WebElement studensavesuccefully;
    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginMenusu;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[1]/div/div")
    public WebElement minimum11charakterAssert;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[1]/span")
    public WebElement project10team02Assert;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[2]/div[2]/ul/li[5]/a/span[1]")
    public WebElement sonsayfayagit;
    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement intervalidSSnuyarisi;
    @FindBy(xpath = "//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[6]")
    public WebElement Adminstudentmanegment;
    @FindBy(xpath = "//*[@id=\"ssn\"]")
    public WebElement SSnkutu;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[5]/div/div")
    public WebElement passwordatleasr8characters;
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[3]/div/div")
    public WebElement phoneminimun12characteruyari;

}
