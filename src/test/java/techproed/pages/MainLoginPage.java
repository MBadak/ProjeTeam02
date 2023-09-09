package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MainLoginPage {




    public MainLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // Login sayfasi locateleri
    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginMenusu;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

}

