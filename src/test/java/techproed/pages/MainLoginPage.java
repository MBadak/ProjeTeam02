package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MainLoginPage {

        public MainLoginPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//*[@class='header_link ms-2']")
        public WebElement mainLogin;

        @FindBy(xpath = "(//*[@class='form-control'])[1]")
        public WebElement username;

        @FindBy(xpath = "//*[@id='password']")
        public WebElement password;

        @FindBy(xpath = "(//button[@type='button'])[3]")
        public WebElement login;

        @FindBy(xpath = "//button[text()='Menu']")
        public WebElement menu;
    }

