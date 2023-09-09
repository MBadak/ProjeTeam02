package techproed.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.DeanManagementHomePage;
import techproed.pages.MainLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class US05AdminDeanGorebilmeliSilebilmeliStepDefs {
    MainLoginPage mainLoginPage = new MainLoginPage();
    DeanManagementHomePage deanManagementPage = new DeanManagementHomePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} sayfasına gider.")
    public void kullaniciSayfasınaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @When("Kullanici Login olur.")
    public void kullaniciLoginOlur() {
        mainLoginPage.mainLogin.click();
        mainLoginPage.username.sendKeys("AdminBatch151");
        mainLoginPage.password.sendKeys("Batch151+");
        mainLoginPage.login.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanıcı Menu butonuna tıklar.")
    public void kullanıcıMenuButonunaTıklar() {
        ReusableMethods.click(mainLoginPage.menu);
    }

    @And("kullanıcı  Dean Management butonunu tiklar.")
    public void kullanıcıDeanManagementButonunuTiklar() {
        ReusableMethods.click(deanManagementPage.deanManagementButonu);
        ReusableMethods.bekle(1);
    }

    @And("kullanici name kutusuna {string} girer.")
    public void kullaniciNameKutusunaGirer(String name) {
        deanManagementPage.name.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(1);
    }

    @And("kullanici surname kutusuna {string} girer.")
    public void kullaniciSurnameKutusunaGirer(String surname) {
        deanManagementPage.surname.sendKeys(faker.name().lastName());
        ReusableMethods.bekle(1);
    }

    @And("kullanici birtplace kutusuna {string} girer.")
    public void kullaniciBirtplaceKutusunaGirer(String birthplace) {
        deanManagementPage.birthPlace.sendKeys(faker.country().capital());
        ReusableMethods.bekle(1);
    }

    @And("kullanici gender bolumunden {string} secer.")
    public void kullaniciGenderBolumundenSecer(String gender) {
        deanManagementPage.female.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici dogum tarihi kutusuna {string} girer.")
    public void kullaniciDogumTarihiKutusunaGirer(String dogumTarihi ) {
        ReusableMethods.bekle(1);
        Date birthDay = faker.date().past(365 * 40, TimeUnit.DAYS);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(birthDay);
        deanManagementPage.birthDay.sendKeys(formattedDate);
    }

    @And("kullanici phone number kutusuna {string} girer.")
    public void kullaniciPhoneNumberKutusunaGirer(String telefonNumarasi) {
        String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        deanManagementPage.phoneNumber.sendKeys(ListPhoneNo);
        ReusableMethods.bekle(1);
    }

    @And("kullanici ssn kutusuna istenen formatta {string} girer.")
    public void kullaniciSsnKutusunaIstenenFormattaGirer(String ssn) {
        String ListSSNNo = faker.regexify("[0-5]{3}-[0-9]{2}-[0-9]{4}");
        deanManagementPage.ssn.sendKeys(ListSSNNo);
        ReusableMethods.bekle(1);
    }

    @And("kullanici username kutusuna {string} girer.")
    public void kullaniciUsernameKutusunaGirer(String username) {
        String userName = faker.name().firstName();
        deanManagementPage.username.sendKeys(userName);
        ReusableMethods.bekle(1);
    }

    @And("kullanici {string} kutusuna büyük harf, kücük harf, rakam ve en az sekiz karekterden olusan password girer.")
    public void kullaniciKutusunaBüyükHarfKücükHarfRakamVeEnAzSekizKarekterdenOlusanPasswordGirer(String password) {
        deanManagementPage.password.sendKeys(faker.internet().password() + "A2a");
        ReusableMethods.bekle(1);
    }

    @And("kullanici submit butonuna tiklar.")
    public void kullaniciSubmitButonunaTiklar() {
        deanManagementPage.submit.click();
    }

    @And("kullanici Dean List gorundugunu dogrular.")
    public void kullaniciDeanListGorundugunuDogrular() {
        assertTrue(deanManagementPage.listVeri.isDisplayed());
        System.out.println("deanManagementPage.listVeri = " + deanManagementPage.listVeri.getText());
    }


    @And("kullanici deanList teki bir sonraki sayfaya gider.")
    public void kullaniciDeanBirSonrakiSayfayaGider() {
        ReusableMethods.scrollEnd();
        ReusableMethods.click(deanManagementPage.birSonrakiSayfa);
        ReusableMethods.bekle(5);


    }

    @And("kullanici onbirinci satirdaki deani dogrular.")
    public void kullaniciOnbirinciSatirdakiDeaniDogrular() {
        System.out.println("onbirinci Satir = " + deanManagementPage.listonbirinciSatir.getText());
    }


    @And("kullanici onbirinci satirdaki edit butonuna tiklar.")
    public void kullaniciOnbirinciSatirdakiEditButonunaTiklar() {
        deanManagementPage.editButonu.click();
    }

    @And("kullanici Edit Dean sayfasindan verileri gunceller")
    public void kullaniciEditDeanSayfasindanVerileriGunceller() {
     ReusableMethods.jsClear(deanManagementPage.editName);
        deanManagementPage.editName.sendKeys(faker.name().firstName());
        deanManagementPage.editGender.click();
        ReusableMethods.bekle(2);
        ReusableMethods.jsClear(deanManagementPage.editUserName);
        deanManagementPage.editUserName.sendKeys("VeraMera1");
        ReusableMethods.bekle(2);
        deanManagementPage.editPassword.sendKeys("Vera1hank");

    }

    @And("kullanici Edit Dean Submit butonuna tiklar.")
    public void kullaniciEditDeanSubmitButonunaTiklar() {
        deanManagementPage.editSubmit.click();
        ReusableMethods.bekle(2);
    }

    @And("kullanici DeanUpdateSuccessfully uyarisini gordugunu dogrular")
    public void kullaniciDeanUpdateSuccessfullyUyarisiniGordugunuDogrular() {
        assertTrue(deanManagementPage.deanUpdateSuccesful.isDisplayed());
    }

    @And("kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }



  }

