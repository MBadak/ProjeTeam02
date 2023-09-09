package techproed.stepDefinition;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.AdminManagementHomePage;
import techproed.pages.MainLoginPage;
import techproed.pages.ViceDeanManagementHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static techproed.utilities.ReusableMethods.bekle;


public class US22_AdminEklemeStepDefs extends AdminManagementHomePage{

    private static String fakeUsername;
    private static String fakeSsn;
    private static String fakePhoneNumber;
    private static String fakeName;
    private static String fakeSurname;
    private static String fakeBirtPlace;
    private static String fakeDateOfBirth;
    Faker faker = new Faker();
    MainLoginPage loginPage = new MainLoginPage();
    ViceDeanManagementHomePage viceDeanManagementHomePage = new ViceDeanManagementHomePage();

    AdminManagementHomePage adminManagementHomePage = new AdminManagementHomePage();




    @When("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        loginPage.loginMenusu.click();
        bekle(2);


    }
    @When("kullanici {string} alanina {string} girer")
    public void kullanici_alanina_girer(String Username, String Password) {

        loginPage.username.sendKeys(ConfigReader.getProperty("adminUsername"));
        loginPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.loginButton.click();


    }

    @When("kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {

        AdminManagementHomePage.menu.click();
    }



    @When("kullanici Admin Management sekmesine tiklar")
    public void kullanici_admin_management_sekmesine_tiklar() {
        AdminManagementHomePage.adminManagement.click();

    }

    @Then("kullanici {string} alanina isim girer")
    public void kullanici_alanina_isim_girer(String fakeName) {

        fakeName = faker.name().firstName();
        name.sendKeys(fakeName);
    }

    @When("kullanici {string} alanina soyisim girer")
    public void kullanici_alanina_soyisim_girer(String fakeSurname) {
        fakeSurname = faker.name().lastName();
        AdminManagementHomePage.surname.sendKeys(fakeSurname);

    }

    @When("kullanici {string} alanina doğum yeri girer")
    public void kullanici_alanina_doğum_yeri_girer(String fakeBirtPlace) {
        fakeBirtPlace = faker.address().city();
        AdminManagementHomePage.birthPlace.sendKeys(fakeBirtPlace);

    }

    @Then("kullanici Gender alaninda cinsiyet secer")
    public void kullanici_gender_alaninda_cinsiyet_secer() {
        AdminManagementHomePage.femaleRadioButton.click();

    }

    @When("kullanici {string} alanina doğum tarihi girer")
    public void kullanici_alanina_doğum_tarihi_girer(String fakeDateOfBirth) {

//        fakeDateOfBirth = String.valueOf(faker.date().birthday());
//        dateOfBirth.sendKeys(fakeDateOfBirth);

            Date date=faker.date().past(365*100, TimeUnit.DAYS);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
            String birtDay=simpleDateFormat.format(date);
            AdminManagementHomePage.dateOfBirth.sendKeys(birtDay);


    }

    @Then("kullanici {string} alanina \\(xxx-xxx-xxxx) formatinda telefon numarasi girer")
    public void kullanici_alanina_xxx_xxx_xxxx_formatinda_telefon_numarasi_girer(String fakePhoneNumber) {
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);

        phoneNumber.sendKeys(fakePhoneNumber);

    }




    @Then("kullanici {string} alanina \\(xxx-xx-xxxx) formatina kimlik bilgisi girer")
    public void kullanici_alanina_xxx_xx_xxxx_formatina_kimlik_bilgisi_girer(String fakeSsn) {
        fakeSsn = faker.idNumber().ssnValid();
        ssn.sendKeys(fakeSsn);


    }

    @When("kullanici {string} alanina kullanici adi girer")
    public void kullanici_alanina_kullanici_adi_girer(String fakeUsername) {
        fakeUsername = faker.name().username();
        userName.sendKeys(fakeUsername);

    }



    @When("kullanici {string} alanina isim girmez")
    public void kullanici_alanina_isim_girmez(String username) {
        userName.sendKeys("");


    }


    @When("kullanici Gender alaninda cinsiyet seçmez")
    public void kullanici_gender_alaninda_cinsiyet_seçmez() {

    }


    @When("kullanici {string} alanina kimlik bilgisi girer")
    public void kullanici_alanina_kimlik_bilgisi_girer(String string) {


    }

    @When("kullanici {string} alanina {int} karakterli password girer")
    public void kullanici_alanina_karakterli_password_girer(String string, Integer int1) {
        String eksikPassword = "659asdf";
        password.sendKeys(eksikPassword);

    }

    @Then("kullanici {string} alanina pasword girer")
    public void kullanici_alanina_pasword_girer(String string) {
        String gecerlipassword = "QWErty12.";
        password.sendKeys(gecerlipassword);


    }
    @When("kullanici Submit alanini tiklar.")
    public void kullanici_submit_alanini_tiklar() {
        submitButton.click();

    }







    @When("kullanici {string} alanina telefon numarasi girer")
    public void kullanici_alanina_telefon_numarasi_girer(String string) {

    }



    @When("kullanici admin eklenmediğini doğrular")
    public void kullanici_admin_eklenmediğini_doğrular() {

    }

    @Then("kullanici admin eklendiğini doğrular")
    public void kullanici_admin_eklendiğini_doğrular() {
        ReusableMethods.bekle(3);
        assertTrue(adminManagementHomePage.adminSavedUyarisi.isDisplayed());

    }


}
