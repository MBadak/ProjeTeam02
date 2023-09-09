package techproed.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

import org.openqa.selenium.Keys;

import techproed.pages.MainLoginPage;
import techproed.pages.ViceDeanManagementHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.*;

public class US06_ViceDeanOlusturmaStepDefs {
    private static String fakeUsername;
    private static String fakeSsn;
    private static String fakePhoneNumber;
    Faker faker = new Faker();
    MainLoginPage loginPage = new MainLoginPage();
    ViceDeanManagementHomePage viceDeanManagementHomePage = new ViceDeanManagementHomePage();

    @Given("Kullanici anasayfaya gider.")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @Then("Kullanici Dean hesabi ile Sing in yapar.")
    public void kullanici_dean_hesabi_ile_sing_in_yapar() {
        ReusableMethods.bekle(2);
        loginPage.loginMenusu.click();
        loginPage.username.clear();
        loginPage.username.sendKeys(ConfigReader.getProperty("deanUsername"));
        loginPage.password.clear();
        loginPage.password.sendKeys(ConfigReader.getProperty("deanPassword"));
        loginPage.loginButton.click();
    }

    @Then("Kullanici Menu botonuna tiklar.")
    public void kullanici_menu_tiklar() {
        viceDeanManagementHomePage.menuButton.click();
        ReusableMethods.bekle(1);

    }

    @Then("Kullanici tüm alanlarin bos oldugunu test eder.")
    public void kullanici_tüm_alanlarin_bos_oldugunu_test_eder() {
        viceDeanManagementHomePage.name.sendKeys(Keys.TAB);
        ReusableMethods.bekle(1);

        assertTrue(viceDeanManagementHomePage.requiredName.isDisplayed());
        assertTrue(viceDeanManagementHomePage.requiredSurname.isDisplayed());
        assertTrue(viceDeanManagementHomePage.requiredBirthPlace.isDisplayed());

        assertFalse(viceDeanManagementHomePage.maleRadioButton.isSelected());
        assertFalse(viceDeanManagementHomePage.femaleRadioButton.isSelected());

        assertTrue(viceDeanManagementHomePage.requiredDateOfBirth.isDisplayed());
        assertTrue(viceDeanManagementHomePage.requiredPhoneNummer.isDisplayed());
        assertTrue(viceDeanManagementHomePage.requiredSsn.isDisplayed());
        assertTrue(viceDeanManagementHomePage.requiredUsername.isDisplayed());
        assertTrue(viceDeanManagementHomePage.passwordGirUyarisi.isDisplayed());

    }


    @Then("Kullanici {string} alanina gecerli bir ad girer.")
    public void kullanici_Name_alanina_gecerli_bir_ad_girer(String name) {
        viceDeanManagementHomePage.name.sendKeys(name);
        ReusableMethods.visibleWait(viceDeanManagementHomePage.name, 12);
    }

    @Then("Kullanici Name alaninin bos olmadisini test eder.")
    public void kullanici_name_alaninin_bos_olmadisini_test_eder() {
        assertFalse(viceDeanManagementHomePage.requiredName.isDisplayed());

    }

    @Then("Kullanici {string} alanina gecerli bir surname girer.")
    public void kullanici_surname_alanina_gecerli_bir_surname_girer(String surname) {
        viceDeanManagementHomePage.surname.sendKeys(surname);

    }


    @Then("Kullanici Surname  alaninin bos olmadisini test eder.")
    public void kullanici_surname_alaninin_bos_olmadisini_test_eder() {
        assertFalse(viceDeanManagementHomePage.requiredSurname.isDisplayed());
    }

    @Then("Kullanici {string} alanina gecerli bir değer girer.")
    public void kullanici_birth_place_alanina_gecerli_bir_değer_girer(String birthplace) {
        viceDeanManagementHomePage.birthPlace.sendKeys(birthplace);
    }

    @Then("Kullanici Birth Place alaninin bos olmadisini test eder.")
    public void kullanici_birth_place_alaninin_bos_olmadisini_test_eder() {
        assertFalse(viceDeanManagementHomePage.requiredBirthPlace.isDisplayed());

    }

    @Then("Kullanici Gender seçeneginden birini seçer.")
    public void kullanici_gender_seçeneginden_birini_seçer() {
        viceDeanManagementHomePage.maleRadioButton.click();
    }

    @Then("Kullanici Gender seçeneginin bos olmasdigini test eder.")
    public void kullanici_gender_seçeneginin_bos_olmasdigini_test_eder() {
        assertFalse(viceDeanManagementHomePage.femaleRadioButton.isSelected());
        assertTrue(viceDeanManagementHomePage.maleRadioButton.isSelected());

    }

    @Then("Kullanici {string} kutusuna geçerli bir doğum tarihi girer.")
    public void kullanici_date_of_kutusuna_geçerli_bir_doğum_tarihi_girer(String date) {
        viceDeanManagementHomePage.dateOfBirth.sendKeys(date);
    }

    @Then("Kullanici Date Of Birth kutusunun bos olamdigini test eder.")
    public void kullanici_date_of_birth_kutusunun_bos_olamdigini_test_eder() {

    }

    @Then("Kullanici {string} kutusuna gecerli bir telefon numarasi girer.")
    public void kullanici_phone_kutusuna_gecerli_bir_telefon_numarasi_girer(String phonenummer) {
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);

        viceDeanManagementHomePage.phoneNumber.sendKeys(fakePhoneNumber);
    }

    @Then("Kullanici Phone kutusunun bos olmadigini test eder.")
    public void kullanici_phone_kutusunun_bos_olmadigini_test_eder() {
        assertFalse(viceDeanManagementHomePage.requiredPhoneNummer.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna gecerli bir SSN girer.")
    public void kullanici_ssn_kutusuna_gecerli_bir_ssn_girer(String ssn) {
        fakeSsn = faker.idNumber().ssnValid();
        viceDeanManagementHomePage.ssn.sendKeys(fakeSsn);
    }

    @Then("Kullanici Ssn kutusunun bos olmadigini test eder.")
    public void kullanici_ssn_kutusunun_bos_olmadigini_test_eder() {
        assertFalse(viceDeanManagementHomePage.requiredSsn.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna gecerli bir User Name girer.")
    public void kullanici_username_kutusuna_gecerli_bir_username_girer(String username) {
        fakeUsername = faker.name().username();
        viceDeanManagementHomePage.userName.sendKeys(fakeUsername);
    }

    @Then("Kullanici User Name kutusunun bos olmadigini test eder.")
    public void kullanici_user_name_kutusunun_bos_olmadigini_test_eder() {
        assertFalse(viceDeanManagementHomePage.requiredUsername.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna büyük harf, kücük harf ve rakam iceren  en az -8- karakterli bir sifreyi girer.")
    public void kullanici_password_kutusuna_büyük_harf_kücük_harf_ve_rakam_iceren_en_az_karakterli_bir_sifreyi_girer(String password) {
        viceDeanManagementHomePage.password.sendKeys(password);
    }

    @Then("Kullanici Password kutusunun bos olmadigini test eder.")
    public void kullanici_password_kutusunun_bos_olmadigini_test_eder() {
        assertFalse(viceDeanManagementHomePage.passwordGirUyarisi.isDisplayed());
        ReusableMethods.bekle(2);
    }


    @Then("Kullanici Submit butonunu tiklar.")
    public void kullanici_submit_butonunu_tiklar() {
       viceDeanManagementHomePage.submitButton.click();

    }

    @Then("Kullanici basarili bir sekilde Vice Dean ekledigini dogrular.")
    public void kullanici_basarili_bir_sekilde_vice_dean_ekledigini_dogrular() {
    ReusableMethods.bekle(1);
        assertTrue(viceDeanManagementHomePage.viceDeanSavedUyarisi.isDisplayed());
    }



    @Then("Kullanici {string} kutusuna - olmadan  bir SSN girer.")
    public void kullanici_kutusuna_olmasan_bir_ssn_girer(String snn) {
       viceDeanManagementHomePage.ssn.sendKeys(snn);

    }
    @Then("Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular.")
    public void kullanici_please_enter_valid_ssn_number_alert_uyarisi_gordugunu_dogrular() {
      //  ReusableMethods.bekle(1);
       ReusableMethods.visibleWait(viceDeanManagementHomePage.ssnDogruDegilUyarisi,3);
       assertTrue(viceDeanManagementHomePage.ssnDogruDegilUyarisi.isDisplayed());
       ReusableMethods.bekle(3);

    }
    @Then("Kullanici Ssn kutusunu siler.")
    public void kullanici_ssn_kutusunu_siler() {
       ReusableMethods.jsClear(viceDeanManagementHomePage.ssn);

    }
    @Then("Kullanici {string} kutusuna -9- karakterden fazla  bir SSN girer.")
    public void kullanici_kutusuna_karakterden_fazla_bir_ssn_girer(String ssn1) {
       viceDeanManagementHomePage.ssn.sendKeys(ssn1);


    }
    @Then("Kullanici {string} kutusuna -9- karakterden az bir SSN girer.")
    public void kullanici_kutusuna_karakterden_az_bir_ssn_girer(String ssn2) {
        viceDeanManagementHomePage.ssn.sendKeys(ssn2);

    }
    @Then("Kullanici eksik karakter girdigini dorular.")
    public void kullanici_eksik_karakter_girdigini_dorular() {
      assertTrue(viceDeanManagementHomePage.ssn11KarakterEksikUyarisi.isDisplayed());

    }

    @Then("Kullanici {string} kutusuna sekiz karakterden kucuk bir sifre girer.")
    public void kullanici_Password_kutusuna_sekiz_karakterden_kucuk_bir_sifre_girer(String pass) {
        viceDeanManagementHomePage.password.sendKeys(pass);
    }

    @Then("Kullanici password icin eksik karakter girdigini dogrular.")
    public void kullanici_password_icin_eksik_karakter_girdigini_dogrular() {
        assertTrue(viceDeanManagementHomePage.password8KarakterEksikUyarisi.isDisplayed());

    }

    @Then("Kullanici {string} kutusuna Büyük harf kullanmadan sifre girer.")
    public void kullanici_kutusuna_büyük_harf_kullanmadan_sifre_girer(String pass) {
        viceDeanManagementHomePage.password.sendKeys(pass);
    }
    @Then("Kullanici One uppercase character yazisini gordugunu dogrular.")
    public void kullanici_one_uppercase_character_yazisini_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.passwordBuyukHarfEksikUyarisi.isDisplayed());
    }
    @Then("Kullanici Password kutusun siler.")
    public void kullanici_kutusun_siler() {
       ReusableMethods.jsClear(viceDeanManagementHomePage.password);
    }
    @Then("Kullanici {string} kutusuna Kücük harf kullanmadan sifre girer.")
    public void kullanici_kutusuna_kücük_harf_kullanmadan_sifre_girer(String pass1) {
        viceDeanManagementHomePage.password.sendKeys(pass1);
    }
    @Then("Kullanici One lowercase character yazisini gordugunu dogrular.")
    public void kullanici_one_lowercase_character_yazisini_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.passwordKucukHarfEksikUyarisi.isDisplayed());
    }

    @Then("Kullanici {string} kutusuna rakam kullanmadan sifre girer.")
    public void kullanici_kutusuna_rakam_kullanmadan_sifre_girer(String pass2) {
        viceDeanManagementHomePage.password.sendKeys(pass2);
    }
    @Then("Kullanici One number yazisini gordugunu dogrular.")
    public void kullanici_one_number_yazisini_gordugunu_dogrular() {
        assertTrue(viceDeanManagementHomePage.passwordRakamEksikUyarisi.isDisplayed());
    }

    @Then("Kullanici sayfayi kapatir.")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }





}
