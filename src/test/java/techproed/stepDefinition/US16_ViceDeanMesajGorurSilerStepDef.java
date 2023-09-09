package techproed.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.MainLoginPage;
import techproed.pages.ViceDeanManagementHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;
import static techproed.utilities.ReusableMethods.bekle;

public class US16_ViceDeanMesajGorurSilerStepDef {

    MainLoginPage loginPage = new MainLoginPage();
    ViceDeanManagementHomePage viceDeanManagementHomePage = new ViceDeanManagementHomePage();

    @Given("Kullanici ana sayfaya gider.")
    public void kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

    }
    @When("Kullanici Vice Dean hesabi ile giris yapar.")
    public void kullanici_vice_dean_hesabi_ile_giris_yapar() {

        bekle(2);
        loginPage.loginMenusu.click();
        loginPage.username.clear();
        loginPage.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
        loginPage.loginButton.click();

    }
    @When("Kullanici Menu ye  tiklar.")
    public void kullanici_menu_ye_tiklar() {
       viceDeanManagementHomePage.menuButton.click();

    }
    @Then("Kullanici  acilan pencereden Contact Get All yazisina  tiklar.")
    public void kullanici_acilan_pencereden_contact_get_all_yazisina_tiklar() {
        viceDeanManagementHomePage.contactGetAll.click();

    }
    @Then("Kullanici Name altinda gönderici isimlerini gordugunu dogrular.")
    public void kullanici_name_altinda_gönderici_isimlerini_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.contactName.isDisplayed());

    }
    @Then("Kullanici Email altinda gönderici Email adreslerini gordugunu dogrular.")
    public void kullanici_email_altinda_gönderici_email_adreslerini_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.contactMail.isDisplayed());

    }
    @Then("Kullanici Date altinda mesaj tarihlerini gordugunu dogrular.")
    public void kullanici_date_altinda_mesaj_tarihlerini_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.contactDate.isDisplayed());

    }
    @Then("Kullanici Subject altindaki bilgileri gordugunu dogrular.")
    public void kullanici_subject_altindaki_bilgileri_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.subject.isDisplayed());

    }
    @Then("Kullanici Message altindaki mesajlari gordugunu dogrular.")
    public void kullanici_message_altindaki_mesajlari_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.message.isDisplayed());

    }
    @Then("Kullanici sayfa kapatir.")
    public void kullanici_sayfa_kapatir() {
        Driver.getDriver().quit();

    }


    @Then("Kullanici silme buton  gordugunu dogrular.")
    public void kullanici_silme_buton_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.message.isDisplayed());

    }
    @Then("Kullanici silme butona tiklar")
    public void kullanici_silme_butona_tiklar() {
        viceDeanManagementHomePage.deleteButton.click();

    }


}
