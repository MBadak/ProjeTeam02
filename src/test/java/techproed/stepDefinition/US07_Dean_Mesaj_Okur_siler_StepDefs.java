package techproed.stepDefinition;

import io.cucumber.java.en.Then;
import techproed.pages.ViceDeanManagementHomePage;

import static org.junit.Assert.assertTrue;

public class US07_Dean_Mesaj_Okur_siler_StepDefs {
    ViceDeanManagementHomePage viceDeanManagementHomePage = new ViceDeanManagementHomePage();
    @Then("Kullanici Menu botonuna  tiklar.")
    public void kullanici_menu_botonuna_tiklar() {
   viceDeanManagementHomePage.menuButton.click();

    }
    @Then("Kullanici  acilan sol pencereden Contact Get All yazisina  tiklar.")
    public void kullanici_acilan_sol_pencereden_contact_get_all_yazisina_tiklar() {
      viceDeanManagementHomePage.contactGetAll.click();
    }
    @Then("Kullanici Name basligi altinda gönderici isimlerini gordugunu dogrular.")
    public void kullanici_name_basligi_altinda_gönderici_isimlerini_görür() {
        assertTrue(viceDeanManagementHomePage.contactName.isDisplayed());
    }
    @Then("Kullanici Email basligi altinda gönderici Email adreslerini gordugunu dogrular.")
    public void kullanici_email_basligi_altinda_gönderici_email_adreslerini_görür() {
        assertTrue(viceDeanManagementHomePage.contactMail.isDisplayed());
    }
    @Then("Kullanici Date basligi altinda mesaj tarihlerini gordugunu dogrular.")
    public void kullanici_date_basligi_altinda_mesaj_tarihlerini_görür() {
        assertTrue(viceDeanManagementHomePage.contactDate.isDisplayed());
    }
    @Then("Kullanici Subject basligi altindaki bilgileri gordugunu dogrular.")
    public void kullanici_subject_basligi_altindaki_bilgileri_görür() {
        assertTrue(viceDeanManagementHomePage.subject.isDisplayed());
    }
    @Then("Kullanici Message basligi altindaki mesajlari gordugunu dogrular.")
    public void kullanici_message_basligi_altindaki_mesajlari_görür() {
        assertTrue(viceDeanManagementHomePage.message.isDisplayed());
    }


    @Then("Kullanici silme butonunu gordugunu dogrular.")
    public void kullanici_silme_butonunu_görür() {
        assertTrue(viceDeanManagementHomePage.message.isDisplayed());
    }
    @Then("Kullanici silme butonuna tiklar")
    public void kullanici_silme_butonuna_tiklar() {
        viceDeanManagementHomePage.deleteButton.click();
    }

}
