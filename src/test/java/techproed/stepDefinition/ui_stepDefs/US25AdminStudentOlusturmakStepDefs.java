package techproed.stepDefinition.ui_stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.US15HomePage;
import techproed.pages.ViceDeanManagementHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class US25AdminStudentOlusturmakStepDefs extends ReusableMethods {
    private static String fakeUsername;
    private static String fakePhoneNumber;
    Faker faker = new Faker();

    String studentNumber;
    int id;

    ViceDeanManagementHomePage viceDeanManagementHomePage = new ViceDeanManagementHomePage();
    US15HomePage us15ViceDeanOgrenci = new US15HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        @Given("Kullanici okul sayfasina gider...")
        public void kullanici_okul_sayfasina_gider() {
            Driver.getDriver().get(ConfigReader.getProperty("Url"));
        }
        @Then("Kullanici Login butonuna tiklar...")
        public void kullanici_login_butonuna_tiklar() {
            js.executeScript("arguments[0].click()",us15ViceDeanOgrenci.loginMenusu);
            bekle(2);
            Assert.assertTrue(us15ViceDeanOgrenci.loginsayfaAssert.isDisplayed());
        }

        @And("Kullanici Admin hesabi ile Sing in yapar...")
        public void kullanici_Admin_hesabi_Ile_Sing_In_Yapar() {
            us15ViceDeanOgrenci.username.sendKeys(ConfigReader.getProperty("adminUsername"));
            bekle(2);
            Assert.assertTrue(us15ViceDeanOgrenci.username.isDisplayed());
            us15ViceDeanOgrenci.password.sendKeys(ConfigReader.getProperty("adminPassword"));
            bekle(2);
            Assert.assertTrue(us15ViceDeanOgrenci.password.isDisplayed());
            Assert.assertTrue(us15ViceDeanOgrenci.loginButton.isDisplayed());
            bekle(2);
            js.executeScript("arguments[0].click()",us15ViceDeanOgrenci.loginButton);
            bekle(2);
        }

        @And ("Kullanici Menua tiklar...")
        public void kullanici_menua_tiklar() {
            Assert.assertTrue(us15ViceDeanOgrenci.Menu.isDisplayed());
            bekle(1);
            js.executeScript("arguments[0].click()",us15ViceDeanOgrenci.Menu);
            bekle(2);
        }

        @And ("Kullanici Student Management tiklar...")
        public void kullanici_student_management_tiklar() {
            Assert.assertTrue(us15ViceDeanOgrenci.StudentManagement.isDisplayed());
            bekle(1);
            js.executeScript("arguments[0].click()", us15ViceDeanOgrenci.Adminstudentmanegment);
            bekle(2);
        }

        @Then ("Kullanici tum alanlarin bos oldugunu test eder...")
        public void Kullanici_tum_alanlarin_bos_oldugunu_test_eder(){
            viceDeanManagementHomePage.name.sendKeys(Keys.TAB);
            ReusableMethods.bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredName.isDisplayed());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredSurname.isDisplayed());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredBirthPlace.isDisplayed());
            bekle(1);
            assertFalse(viceDeanManagementHomePage.maleRadioButton.isSelected());
            bekle(1);
            assertFalse(viceDeanManagementHomePage.femaleRadioButton.isSelected());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredDateOfBirth.isDisplayed());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredPhoneNummer.isDisplayed());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredSsn.isDisplayed());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.requiredUsername.isDisplayed());
            bekle(1);
            assertTrue(viceDeanManagementHomePage.passwordGirUyarisi.isDisplayed());
            bekle(1);
        }

    @And ("Kullanici Choose Teacher yapar...")
    public void kullanici_choose_teacher_yapar() {

        Select select = new Select(us15ViceDeanOgrenci.Chooseteacher);
        select.selectByIndex(4);
        bekle(2);
        Assert.assertTrue(us15ViceDeanOgrenci.Chooseteacher.isDisplayed());
        bekle(1);
    }

    @Then("Kullanici {string} alanina gecerli bir surname girer...")
    public void kullanici_surneme_alanina_gecerli_bir_surname_girer(String surname) {
        viceDeanManagementHomePage.name.sendKeys(Keys.TAB);
        bekle(1);
        us15ViceDeanOgrenci.studentsurname.sendKeys(surname);
        bekle(2);

    }
    @And("Kullanici surName alaninin bos olmadigini test eder...")
    public void kullanici_SurName_Alaninin_Bos_Olmadigini_TestEder() {
        assertTrue(us15ViceDeanOgrenci.studentsurname.isDisplayed());
        bekle(2);
    }

    @Then ("Kullanici {string} alanina gecerli bir birthplace girer...")
    public void kullanici_Birth_Place_Alanina_Gecerli_Bir_Deger_Girer(String BirthPlace) {
        viceDeanManagementHomePage.birthPlace.sendKeys(BirthPlace);
        bekle(1);
    }
    @And ("Kullanici Birth Place alaninin bos olmadigini test eder...")
    public void kullanici_BirthPlace_Alaninin_Bos_Olmadisini_Test_Eder() {
        assertFalse(viceDeanManagementHomePage.requiredBirthPlace.isDisplayed());
        bekle(1);
    }
    @Then("Kullanici {string} alanina gecerli bir email girer...")
    public void Kullanici_Email_alanina_gecerli_bir_email_girer(String Email) {
        us15ViceDeanOgrenci.studentemail.sendKeys(faker.internet().emailAddress());
        bekle(1);
    }

    @And("Kullanici {string} kutusuna gecerli bir telefon numarasi girer...")
    public void Kullanici_Phone_Kutusuna_Gecerli_Bir_Telefon_Numarasi_Girer(String Phone) {
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        viceDeanManagementHomePage.phoneNumber.sendKeys(fakePhoneNumber);
        bekle(1);
        //us15ViceDeanOgrenci.studentPhone.sendKeys("555-666-7787");
        //bekle(2);
    }

    @Then("Kullanici Gender_e_datayi_girer...")
    public void Kullanici_gender_e_datayi_girer() {
        js.executeScript("arguments[0].click()", us15ViceDeanOgrenci.studentgender);
        bekle(2);
    }

    @And("Kullanici Gender seçeneginin bos olmadigini test eder...")
    public void kullanici_Gender_Seceneginin_Bos_Olmasdigini_TestEder() {
        assertFalse(us15ViceDeanOgrenci.malegender.isSelected());
        bekle(2);
        assertTrue(us15ViceDeanOgrenci.studentgender.isSelected());
        bekle(2);
    }

    @Then("Kullanici {string} kutusuna geçerli bir doğum tarihi girer...")
    public void Kullanici_Date_Kutusuna_Gecerli_Bir_Dogum_Tarihi_Girer(String Date) {
        us15ViceDeanOgrenci.studentbirthDay.sendKeys(Date);
        bekle(2);
    }

    @And("Kullanici Date Of Birth kutusunun bos olmadigini test eder...")
    public void kullanici_Date_Of_Birth_Kutusunun_Bos_Olamdigini_Test_Eder() {
        assertTrue(us15ViceDeanOgrenci.studentbirthDay.isDisplayed());
        bekle(1);
    }

    @Then("Kullanici {string} kutusuna gecerli bir SSN girer...")
    public void Kullanici_Ssn_kutusuna_gecerli_bir_SSN_girer(String Ssn) {
            us15ViceDeanOgrenci.studentssn.clear();
        String fakerSsn = faker.idNumber().ssnValid();
        us15ViceDeanOgrenci.studentssn.sendKeys(faker.idNumber().ssnValid());
        bekle(2);
    }
    @And("Kullanici Ssn kutusunun bos olmadigini test eder...")
    public void kullanici_Ssn_Kutusunun_Bos_Olmadigini_Test_Eder() {
        assertTrue(us15ViceDeanOgrenci.studentssn.isDisplayed());
        bekle(1);
    }

    @Then("Kullanici {string} kutusuna gecerli bir User Name girer...")
    public void kullanici_Kutusuna_Gecerli_Bir_User_Name_Girer(String UserName){
        fakeUsername = faker.name().lastName();
        viceDeanManagementHomePage.userName.sendKeys(fakeUsername);
        bekle(1);
    }

    @And ("Kullanici User Name kutusunun bos olmadigini test eder...")
    public void kullanici_UserName_Kutusunun_Bos_Olmadigini_Test_Eder() {
        assertTrue(us15ViceDeanOgrenci.studentName.isDisplayed());
        bekle(1);
    }

    @Then ("Kullanici {string} kutusuna gecerli bir fathername girer...")
    public void Kullanici_fathername_kutusuna_gecerli_bir_fathername_girer(String fathername) {
        us15ViceDeanOgrenci.studentfathername.sendKeys(fathername);
        bekle(1);
    }
    @And("Kullanici father name kutusunun bos olmadigini test eder...")
    public void kullanici_FatherName_Kutusunun_Bos_Olmadigini_Test_Eder() {
        assertFalse(us15ViceDeanOgrenci.fathernameRequired.isDisplayed());
        bekle(1);
    }
    @Then("Kullanici{string}kutusuna gecerli bir mothername girer...")
    public void kullanici_mothername_Kutusuna_Gecerli_Bir_Mothername_Girer(String mothername) {
        us15ViceDeanOgrenci.studentmothername.sendKeys(mothername);
        bekle(1);
    }
    @And ("Kullanici mother name kutusunun bos olmadigini test eder...")
    public void kullanici_MotherName_Kutusunun_Bos_Olmadigini_TestEder() {
        assertFalse(us15ViceDeanOgrenci.mothernameRequired.isDisplayed());
        bekle(1);
    }

    @Then("Kullanici {string} kutusuna buyuk harf kucuk harf ve rakam iceren en az 8 karakterli bir sifreyi girer...")
    public void kullanici_Password_Kutusuna_Buyuk_harf_kucuk_Harf_Ve_Rakam_Iceren_En_Az_8_Karakterli_Bir_Sifreyi_Girer(String Password) {
        us15ViceDeanOgrenci.studentpassword.sendKeys(Password);
        bekle(4);

    }
    @And("Kullanici Password kutusunun bos olmadigini test eder...")
    public void kullanici_Password_Kutusunun_Bos_Olmadigini_TestEder() {
        assertTrue(us15ViceDeanOgrenci.studentpassword.isDisplayed());
        bekle(1);
    }

    @Then("Kullanici submit e tiklar...")
    public void kullanici_Submit_E_Tiklar() {
        js.executeScript("arguments[0].click()", us15ViceDeanOgrenci.studentsubmit);
    }

    @And("Kullanici Name in altinda Required yazisini gorur...")
    public void kullanici_Name_In_Altinda_Required_Yazisini_Gorur() {
        Assert.assertTrue(us15ViceDeanOgrenci.nameRequired.isDisplayed());
        bekle(1);
    }

    @Then("Kullanici {string} alanina gecerli bir ad girer...")
    public void kullanici_Name_Alanina_Gecerli_Bir_Ad_Girer(String Name) {
        viceDeanManagementHomePage.name.sendKeys(Name);
        ReusableMethods.visibleWait(viceDeanManagementHomePage.name, 12);
        bekle(1);

    }

    @And("Kullanici Name alaninin bos olmadigini test eder...")
    public void kullanici_Name_Alaninin_Bos_Olmadigini_TestEder() {
        assertFalse(viceDeanManagementHomePage.requiredName.isDisplayed());
        bekle(1);
    }

    @And("Kullanici surname in altinda Required yazisini gorur...")
    public void kullanici_Surname_In_Altinda_Required_Yazisini_Gorur() {
        assertTrue(viceDeanManagementHomePage.requiredSurname.isDisplayed());
        bekle(1);
    }

    @And("Kullanici birthplace in altinda Required yazisini gorur...")
    public void kullanici_Birthplace_In_Altinda_Required_Yazisini_Gorur() {
        assertTrue(viceDeanManagementHomePage.requiredBirthPlace.isDisplayed());
        bekle(1);
    }

    @And("Kullanici Email in altinda Required yazisini gorur...")
    public void kullanici_Email_In_Altinda_Required_Yazisini_Gorur() {
        assertTrue(us15ViceDeanOgrenci.emailRequired.isDisplayed());;
        bekle(1);
    }

    @And("Kullanici Email alaninin bos olmadigini test eder...")
    public void kullanici_Email_Alaninin_Bos_Olmadigini_Test_Eder() {
        assertTrue(us15ViceDeanOgrenci.studentemail.isDisplayed());
        bekle(1);
    }

    @And("Kullanici Telefon numarası in altinda Required yazisini gorur...")
    public void kullanici_Telefon_Numarası_In_Altinda_Required_Yazisini_Gorur() {
        Assert.assertTrue(us15ViceDeanOgrenci.phoneRequired.isDisplayed());
        bekle(1);
    }

    @And("Kullanici Phone kutusunun bos olmadigini test eder...")
    public void kullanici_Phone_Kutusunun_Bos_Olmadigini_Test_Eder() {
        assertTrue(us15ViceDeanOgrenci.studentPhone.isDisplayed());
        bekle(1);
    }

    @Then("Kullanıci You have entered an invalid value Valid values are MALE FEMALE uyarısını gorur...")
    public void kullanici_You_Have_Entered_An_Invalid_Value_Valid_Values_Are_MALE_FEMALE_Uyarısını_Gorur() {
        Assert.assertTrue(us15ViceDeanOgrenci.studentgender.isDisplayed());
        bekle(1);
    }

    @And("Kullanici Dogum Tarihi in altinda Required yazisini gorur...")
    public void kullanici_DogumTarihi_In_Altinda_Required_Yazisini_Gorur() {
        Assert.assertTrue(us15ViceDeanOgrenci.dateofbrithRequired.isDisplayed());
        bekle(1);
    }

    @And("Kullanici Student save succesfully uyarisini gorur...")
    public void kullanici_Student_Save_Succesfully_Uyarisini_Gorur() {
        //
        bekle(1);
        Assert.assertTrue(us15ViceDeanOgrenci.studensavesuccefully.isDisplayed());
    }

    @And("Kullanici SSN bolunume 3 ve 5 rakamdan sonra - icermeyen ve 9 rakamdan olusan numarayi girir...")
    public void kullanici_SSN_bolunume_3_Ve_5_rakamdan_sonra_cizgi_icermeyen_Ve_9_rakamdan_olusan_numarayi_girir() {
        us15ViceDeanOgrenci.studentssn.sendKeys("369-874102");
        bekle(2);
    }

    @Then("Kullanici Please enter valid SSN number alert uyarisi goruldugunu dogrular...")
    public void kullanici_Please_Enter_Valid_SSN_Number_Alert_Uyarisi_Goruldugunu_Dogrular() {
        bekle(1);
        assertTrue(us15ViceDeanOgrenci.intervalidSSnuyarisi.isDisplayed());
        bekle(2);

    }
    @Then("Kullanici Ssn kutusunu siler...")
    public void kullanici_Ssn_Kutusunu_Siler() {
            us15ViceDeanOgrenci.SSnkutu.clear();
        jsClear(us15ViceDeanOgrenci.studentssn);
        bekle(2);
    }

    @Then("Kullanici Ssn kutusuna 9 karakterden fazla  bir SSN girer...")
    public void kullanici_Ssn_Kutusuna_9_Karakterden_Fazla_Bir_SSN_Girer() {
        viceDeanManagementHomePage.ssn.sendKeys("369-87-41026");
        bekle(2);
    }

    @Then("Kullanici Ssn kutusuna 9 karakterden az bir SSN girer...")
    public void kullanici_Ssn_Kutusuna_Karakterden_Az_Bir_SSNGirer() {
        viceDeanManagementHomePage.ssn.sendKeys("369-87-410");
        bekle(3);
    }

    @Then("Kullanici eksik karakter girdigini dorular...")
    public void kullanici_Eksik_Karakter_Girdigini_Dorular() {
        assertTrue(us15ViceDeanOgrenci.minimum11charakterAssert.isDisplayed());
        bekle(2);
    }
    @Then("Kullanici User Name in altında Required yazisini gorur...")
    public void kullanici_User_Name_In_Altında_Required_Yazisini_Gorur() {
        assertTrue(us15ViceDeanOgrenci.usernameRequired.isDisplayed());
        bekle(2);
    }

    @Then("Kullanici Father Name in altında Required yazisini gorur...")
    public void kullanici_Father_Name_In_Altında_Required_Yazisini_Gorur() {
        assertTrue(us15ViceDeanOgrenci.fathernameRequired.isDisplayed());
        bekle(2);
    }

    @Then("Kullanici Mother Name in altında Required yazisini gorur...")
    public void kullanici_MotherName_In_Altında_Required_Yazisini_Gorur() {
        assertTrue(us15ViceDeanOgrenci.mothernameRequired.isDisplayed());
        bekle(2);
    }
    @Then("Kullanici STUDENT LIST bolumunde teacher number i goror...")
    public void kullanici_STUDENT_LIST_Bolumunde_Teacher_Number_I_Goror() {
        js.executeScript("arguments[0].click()",us15ViceDeanOgrenci.sayfapass);
        js.executeScript("arguments[0].click()",us15ViceDeanOgrenci.sayfapass);
        js.executeScript("arguments[0].click()",us15ViceDeanOgrenci.sayfapass);
        bekle(2);
        Assert.assertTrue(us15ViceDeanOgrenci.stidentNumberAssert.isDisplayed());
        bekle(2);
    }

    @Then("Kullanici password kutusuna EN AZ 8 KARAKTERDEN AZ password girer...")
    public void kullanici_Password_Kutusuna_EN_AZ_8_KARAKTERDEN_AZ_Password_Girer() {
        viceDeanManagementHomePage.password.sendKeys(" ViceDe");
        bekle(2);
    }

    @Then("Kullanici passwordun altında Minimum 8 character uyarisini gorur...")
    public void kullanici_Passwordun_Altında_Minimum_8_Character_Uyarisini_Gorur() {
        assertTrue(us15ViceDeanOgrenci.passwordatleasr8characters.isDisplayed());
        bekle(2);
    }

    @Then("Kullanici password kutusuna SADECE RAKAMDAN OLUsAN EN AZ 8 KARAKTERDEN AZ password girir...")
    public void kullanici_Password_Kutusuna_SADECE_RAKAMDAN_OLUsAN_EN_AZ_8_KARAKTERDEN_AZ_Password_Girir() {
        viceDeanManagementHomePage.password.sendKeys("12345678");
    }

    @Then("kullanici son sayfaya gider...")
    public void kullanici_Son_Sayfaya_Gider() {
        js.executeScript("arguments[0].click()", us15ViceDeanOgrenci.sonsayfayagit);
        bekle(5);

    }

    @Then("Kullanici STUDENT LIST bolumunde student number i goror...")
    public void kullanici_STUDENT_LIST_Bolumunde_Student_Number_I_Goror() {
        assertTrue(us15ViceDeanOgrenci.project10team02Assert.isDisplayed());
        bekle(2);
    }

    @Then("Kullanici Please enter Minimum 11 character yazisini goruldugunu dogrular...")
    public void kullanici_Please_Enter_Minimum_11_Character_Yazisini_Goruldugunu_Dogrular() {
        assertTrue(us15ViceDeanOgrenci.minimum11charakterAssert.isDisplayed());
        bekle(2);
    }

    @Then("Kullanici Phone kutusuna 12 karekterden az sayi girince Minimum 12 character uyarisini gorur...")
    public void kullanici_Phone_Kutusuna_Karekterden_Az_Sayi_Girince_Minimum_Character_Uyarisini_Gorur() {
        jsClear(us15ViceDeanOgrenci.studentPhone);
        us15ViceDeanOgrenci.studentPhone.clear();
        us15ViceDeanOgrenci.studentPhone.sendKeys("ListSSNno");
        bekle(2);
        assertTrue(us15ViceDeanOgrenci.phoneminimun12characteruyari.isDisplayed());
        bekle(2);
    }

    @And("Kullanici sayfayi kapatir...")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}





