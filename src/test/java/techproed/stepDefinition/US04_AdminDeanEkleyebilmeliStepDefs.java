package techproed.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.DeanManagementHomePage;
import techproed.pages.MainLoginPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class US04_AdminDeanEkleyebilmeliStepDefs {
    MainLoginPage mainLoginPage = new MainLoginPage();
    DeanManagementHomePage deanManagementPage = new DeanManagementHomePage();
    Faker faker = new Faker();

    @Given("kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String url) {
        Driver.getDriver().get(url);
    }


    @When("Kullanici Login olur")
    public void kullaniciLoginOlur() {
        mainLoginPage.mainLogin.click();
        mainLoginPage.username.sendKeys("AdminTuba");
        mainLoginPage.password.sendKeys("Tuba123+");
        mainLoginPage.login.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanıcı Menu butonuna tıklar")
    public void kullanıcıMenuButonunaTıklar() {
        ReusableMethods.click(mainLoginPage.menu);
    }

    @And("kullanıcı  Dean Management butonunu tiklar")
    public void kullanıcıDeanManagementButonunuTiklar() {
        ReusableMethods.click(deanManagementPage.deanManagementButonu);
        ReusableMethods.bekle(1);

    }

    @And("kullanici name kutusuna {string} girer")
    public void kullaniciNameKutusunaGirer(String name) {
        deanManagementPage.name.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(1);
    }

    @And("kullanici name kutusunun bos olmadigini test eder")
    public void kullaniciNameKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.nameRequired.isDisplayed());
    }

    @And("kullanici surname kutusuna {string} girer")
    public void kullaniciSurnameKutusunaGirer(String surname) {
        deanManagementPage.surname.sendKeys(faker.name().lastName());
        ReusableMethods.bekle(1);

    }

    @And("kullanici surname kutusunun bos olmadigini test eder")
    public void kullaniciSurnameKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.surnameRequired.isDisplayed());
    }

    @And("kullanici birtplace kutusuna {string} girer")
    public void kullaniciBirtplaceKutusunaGirer(String birthplace) {
        deanManagementPage.birthPlace.sendKeys(faker.country().capital());
        ReusableMethods.bekle(1);
    }

    @And("kullanici birthplace kutusunun bos olmadigini test eder")
    public void kullaniciBirthplaceKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.birthPlaceRequired.isDisplayed());
    }

    @And("kullanici gender bolumunden {string} secer")
    public void kullaniciGenderBolumundenSecer(String gender) {
      deanManagementPage.female.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici gender sectigini test eder")
    public void kullaniciGenderKutusununBosOlmadiginiTestEder() {
        assertTrue(deanManagementPage.female.isSelected());

    }

    @And("kullanici dogum tarihi kutusuna {string} girer")
    public void kullaniciDogumTarihiKutusunaGirer(String dogumTarihi) {
        ReusableMethods.bekle(1);
        Date birthDay = faker.date().past(365 * 40, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthDay);
        deanManagementPage.birthDay.sendKeys(formattedDate);

    }

    @And("kullanici dogum tarihi kutusunun bos olmadigini test eder")
    public void kullaniciDogumTarihiKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.birthDayRequired.isDisplayed());
    }

    @And("kullanici phone number kutusuna {string} girer")
    public void kullaniciPhoneNumberKutusunaGirer(String telefonNumarasi) {
        String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        deanManagementPage.phoneNumber.sendKeys(ListPhoneNo);
        ReusableMethods.bekle(1);
    }

    @And("kullanici phone number kutusunun bos olmadigini test eder")
    public void kullaniciPhoneNumberKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.phoneNumberRequired.isDisplayed());
    }

    @And("kullanici ssn kutusuna istenen formatta {string} girer")
    public void kullaniciSsnIstenenFormattaGirer(String ssn) {
        String ListSSNNo = faker.regexify("[0-5]{3}-[0-9]{2}-[0-9]{4}");
        deanManagementPage.ssn.sendKeys(ListSSNNo);
        ReusableMethods.bekle(1);
    }

    @And("kullanici ssn kutusunun bos olmadigini test eder")
    public void kullaniciSsnKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.ssnRequired.isDisplayed());
    }

    @And("kullanici username kutusuna {string} girer")
    public void kullaniciUsernameKutusunaGirer(String username) {
       String userName = faker.name().firstName();
       deanManagementPage.username.sendKeys(userName);
        ReusableMethods.bekle(1);
    }

    @And("kullanici username kutusunun bos olmadigini test eder")
    public void kullaniciUsernameKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.usernameRequired.isDisplayed());
    }

    @And("kullanici {string} kutusuna büyük harf, kücük harf, rakam ve en az sekiz karekterden olusan password girer")
    public void kullaniciKutusunaBüyükHarfKücükHarfRakamVeEnAzSekizKarekterdenOlusanPasswordGirer(String arg0) {
          deanManagementPage.password.sendKeys(faker.internet().password() + "A2a");
          ReusableMethods.bekle(1);
    }

    @And("kullanici password kutusunun bos olmadigini test eder")
    public void kullaniciPasswordKutusununBosOlmadiginiTestEder() {
        assertFalse(deanManagementPage.passwordEnterYourPassword.isDisplayed());
    }

    @And("kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        deanManagementPage.submit.click();
    }

    @And("kullanici basarili bir sekilde Dean ekledigini dogrular.")
    public void kullaniciBasariliBirSekildeDeanEklediginiDogrular() {
    ReusableMethods.visibleWait(deanManagementPage.alertDeanSaved,3);
   assertTrue(deanManagementPage.alertDeanSaved.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
         Driver.closeDriver();
    }

    @And("kullanici ssn kutusuna yanlis formatta {string} girer")
    public void kullaniciSsnKutusunaYanlisFormattaGirer(String ssn) {
        deanManagementPage.ssn.sendKeys(ssn);
    }

    @And("kullanici dogru formatta ssn gir ikazini gorur")
    public void kullaniciDogruFormattaSsnGirIkaziniGorur() {
        ReusableMethods.visibleWait(deanManagementPage.ssnAlert, 4);
        assertTrue(deanManagementPage.ssnAlert.isDisplayed());
    }

    @And("kullanici {string} kutusuna BUYUK HARF kullanmadan bir sifre girer")
    public void kullaniciKutusunaBUYUKHARFKullanmadanBirSifreGirer(String password1) {
        deanManagementPage.password.sendKeys("vera1hank");
    }

    @And("kullanici One uppercase character ikazini gorur")
    public void kullaniciOneUppercaseCharacterIkaziniGorur() {
        assertTrue(deanManagementPage.uppercase.isDisplayed());
    }

    @And("kullanici {string} kutusuna KUCUK HARF kullanmadan bir sifre girer")
    public void kullaniciKutusunaKUCUKHARFKullanmadanBirSifreGirer(String password2) {
        deanManagementPage.password.sendKeys("VERA1HANK");

    }

    @And("kullanici One lowercase character ikazini gorur")
    public void kullaniciOneLowercaseCharacterIkaziniGorur() {
        assertTrue(deanManagementPage.lowercase.isDisplayed());

    }

    @And("kullanici {string} kutusuna RAKAM kullanmadan bir sifre girer")
    public void kullaniciKutusunaRAKAMKullanmadanBirSifreGirer(String password3) {
        deanManagementPage.password.sendKeys("VERAhank");

    }

    @And("kullanici One number ikazini gorur")
    public void kullaniciOneNumberIkaziniGorur() {
        assertTrue(deanManagementPage.oneNumber.isDisplayed());
    }

    @And("kullanici hicbir giris yapmadan submit butonuna tiklar")
    public void kullaniciHicbirGirisYapmadanSubmitButonunaTiklar() {
        deanManagementPage.submit.click();
    }

    @And("kullanici tum alanlarin bos oldugunu dogrular")
    public void kullaniciTumAlanlarinBosOldugunuDogrular() {
        assertTrue(deanManagementPage.nameRequired.isDisplayed());
        assertTrue(deanManagementPage.surnameRequired.isDisplayed());
        assertTrue(deanManagementPage.birthPlaceRequired.isDisplayed());
        assertFalse(deanManagementPage.female.isSelected());
        assertTrue(deanManagementPage.birthDayRequired.isDisplayed());
        assertTrue(deanManagementPage.phoneNumberRequired.isDisplayed());
        assertTrue(deanManagementPage.ssnRequired.isDisplayed());
        assertTrue(deanManagementPage.usernameRequired.isDisplayed());
        assertTrue(deanManagementPage.passwordEnterYourPassword.isDisplayed());
    }


}
