package techproed.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pages.RegisterPage;

import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import static techproed.utilities.ReusableMethods.click;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;



public class US01_RegisterStepDefs {

//////////////methodlarim//////////////
    public static String generateFakePassword(int length) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String characters = uppercase + lowercase + digits;
        SecureRandom random = new SecureRandom();
        StringBuilder fakePassword = new StringBuilder(length);

        // En az bir büyük harf ekleyin
        fakePassword.append(uppercase.charAt(random.nextInt(uppercase.length())));

        // En az bir küçük harf ekleyin
        fakePassword.append(lowercase.charAt(random.nextInt(lowercase.length())));

        // En az bir rakam ekleyin
        fakePassword.append(digits.charAt(random.nextInt(digits.length())));

        // Geri kalan karakterleri rastgele seçin
        for (int i = 3; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            fakePassword.append(randomChar);
        }

        // Karakterleri karıştırın
        String shuffledPassword = shuffleString(fakePassword.toString());

        return shuffledPassword;
    }

    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);

    }

    /////


    public static String generateRandomDate(String startDateStr, String endDateStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date startDate = dateFormat.parse(startDateStr);
            Date endDate = dateFormat.parse(endDateStr);

            long startTime = startDate.getTime();
            long endTime = endDate.getTime();

            Random random = new Random();
            long randomTime = startTime + (long) (random.nextDouble() * (endTime - startTime));
            Date randomDate = new Date(randomTime);

            return dateFormat.format(randomDate);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //////////////////////////////////////////////////////////////////////
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    private static String name;
    private static String surname;
    private static String birthplace;
    private static String phone;
    private static String gender;
    private static String ssn;
    private static String username;
    private static String password;



    @Given("Kullanici url' e gider")
    public void kullanici_url_e_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @Given("Kullanici register bölümüne tiklar")
    public void kullanici_register_bölümüne_tiklar() {

        registerPage.registerLink.click();
    }

    @Then("Kullanici name kutucuguna herhangi bir karakter iceren ve bos birakilmayan bir {string} degeri girer")
    public void kullaniciNameKutucugunaHerhangiBirKarakterIcerenVeBosBirakilmayanBirDegeriGirer(String name) {

        registerPage.nameInput.sendKeys(name);
    }

    @And("Kullanici surname kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciSurnameKutucugunaGecerliBirDegeriGirer(String surname) {

        surname = faker.name().lastName();
    }

    @And("Kullanici birthPlace kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciBirthPlaceKutucugunaGecerliBirDegeriGirer(String birthPlace) {

        birthPlace = faker.address().country();
    }

    @And("Kullanici phone kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciPhoneKutucugunaGecerliBirDegeriGirer(String phone) {

        phone = faker.numerify("###-###-####");
    }

    @And("Kullanici {string} secer")
    public void kullaniciSecer(String gender) {

        gender=faker.demographic().sex();

        if (gender.equalsIgnoreCase("male")) {
            click(registerPage.maleRadioButton);
        } else {
            click(registerPage.femaleRadioButton);
        }

    }

    @And("Kullanici dateOfBirth kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciDateOfBirthKutucugunaGecerliBirDegeriGirer(String dateOfBirth) {

        String startDate = "01/01/1923"; // Başlangıç tarihi
        String endDate = "12/31/2015";  // Bitiş tarihi

        String randomDate = generateRandomDate(startDate, endDate);

        dateOfBirth =randomDate;


    }

    @And("Kullanici ssn kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciSsnKutucugunaGecerliBirDegeriGirer(String ssn) {

        ssn = faker.numerify("3##-##-####");
    }

    @And("Kullanici username kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciUsernameKutucugunaGecerliBirDegeriGirer(String username) {

        username = faker.name().username() + "1234";
    }

    @And("Kullanici password kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciPasswordKutucugunaGecerliBirDegeriGirer(String password) {

        password = generateFakePassword(8);

    }

    @And("Kullanici Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {

        registerPage.registerButton.click();
    }

    @And("Olumlu Mesaj görür")
    public void olumluMesajGorur() {
        // Guest User registered.


    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.getDriver().quit();
    }

    @Then("Kullanici name kutucuguna {string} degeri atamaz")
    public void kullaniciNameKutucugunaDegeriAtamaz(String name) {

        registerPage.nameInput.sendKeys("");
    }

    @And("Olumsuz Mesaj görür")///???????????????????
    public void olumsuzMesajGorur() {
    }

    @Then("Kullanici name kutucuguna gecerli bir {string} degeri girer")
    public void kullaniciNameKutucugunaGecerliBirDegeriGirer(String name) {

        name=faker.name().firstName();

    }

    @And("Kullanici surname kutucuguna herhangi bir karakter iceren ve bos birakilmayan bir {string} degeri girer")
    public void kullaniciSurnameKutucugunaHerhangiBirKarakterIcerenVeBosBirakilmayanBirDegeriGirer(String surname) {

        registerPage.surNameInput.sendKeys(surname);

    }

    @And("Kullanici surname kutucuguna {string} degeri atamaz")
    public void kullaniciSurnameKutucugunaDegeriAtamaz(String surname) {

        registerPage.surNameInput.sendKeys("");

    }

    @And("Kullanici birthPlace kutucuguna herhangi bir karakter iceren ve bos birakilmayan bir {string} degeri girer")
    public void kullaniciBirthPlaceKutucugunaHerhangiBirKarakterIcerenVeBosBirakilmayanBirDegeriGirer(String birthPlace) {

        registerPage.birthPlaceInput.sendKeys(birthPlace);

    }

    @And("Kullanici birthPlace kutucuguna {string} degeri atamaz")
    public void kullaniciBirthPlaceKutucugunaDegeriAtamaz(String birthPlace) {

        registerPage.birthPlaceInput.sendKeys("");

    }

    @And("Kullanici phone kutucuguna xxx-xxx-xxxx formatina uygun bir {string} degeri girer")
    public void kullaniciPhoneKutucugunaXxxXxxXxxxFormatinaUygunBirDegeriGirer(String phone) {

        registerPage.phoneNumberInput.sendKeys(phone);

    }

    @And("Kullanici phone kutucuguna xxx-xxx-xxxx formatina uygun ama bir eksik ya da bir fazla {string} degeri girer")
    public void kullaniciPhoneKutucugunaXxxXxxXxxxFormatinaUygunAmaBirEksikYaDaBirFazlaDegeriGirer(String phone) {

        registerPage.phoneNumberInput.sendKeys(phone);
    }

    @And("Kullanici phone kutucuguna xxx-xxx-xxxx formatina uymayan bir {string} degeri girer")
    public void kullaniciPhoneKutucugunaXxxXxxXxxxFormatinaUymayanBirDegeriGirer(String phone) {

        registerPage.phoneNumberInput.sendKeys(phone);
    }

    @And("Kullanici phone kutucuguna bir {string} degeri girmez")
    public void kullaniciPhoneKutucugunaBirDegeriGirmez(String phone) {

        registerPage.phoneNumberInput.sendKeys("");
    }

    @And("Kullanici dateOfBirth kutucuguna {string} degeri girmez")
    public void kullaniciDateOfBirthKutucugunaDegeriGirmez(String dateOfBirth) {

        registerPage.birthDayInput.sendKeys("");
    }
    @And("Kullanici dateOfBirth kutucuguna {int} - {int} yil araliginda bir {string} degeri girer")
    public void kullaniciDateOfBirthKutucugunaYilAraligindaBirDegeriGirer(int arg1923, int arg2015, String dateOfBirth) {

        registerPage.birthDayInput.sendKeys(dateOfBirth);
    }

    @And("Kullanici dateOfBirth kutucuguna {int}'ten önce bir {string} degeri girer")
    public void kullaniciDateOfBirthKutucugunaTenOnceBirDegeriGirer(int arg1923oncesi, String dateOfBirth) {

        registerPage.birthDayInput.sendKeys(dateOfBirth);
    }

   

    @And("Kullanici dateOfBirth kutucuguna {int} yili sonrasi bir {string} degeri girer")
    public void kullaniciDateOfBirthKutucugunaYiliSonrasiBirDegeriGirer(int arg2015, String dateOfBirth) {
        
        registerPage.birthDayInput.sendKeys(dateOfBirth);
        
        
    }

    @And("Kullanici dateOfBirth kutucuguna  {int} - {int} yil araliginda artik yil olan bir {string} degeri girer")
    public void kullaniciDateOfBirthKutucugunaYilAraligindaArtikYilOlanBirDegeriGirer(int arg1923, int arg2015, String dateOfBirth) {
        
        registerPage.birthDayInput.sendKeys(dateOfBirth);
        
    }

    @And("Kullanici dateOfBirth kutucuguna  {int} - {int} yil araliginda artik yil olmayan bir {string} degeri girer")
    public void kullaniciDateOfBirthKutucugunaYilAraligindaArtikYilOlmayanBirDegeriGirer(int arg1923, int arg2015, String dateOfBirth) {

        registerPage.birthDayInput.sendKeys(dateOfBirth);
   
    }

    @And("Kullanici ssn kutucuguna {string} degeri girmez")
    public void kullaniciSsnKutucugunaDegeriGirmez(String ssn) {

        registerPage.ssnInput.sendKeys("");
    }

    @And("Kullanici ssn kutucuguna xxx-xx-xxxx formatina uygun bir {string} degeri girer")
    public void kullaniciSsnKutucugunaXxxXxXxxxFormatinaUygunBirDegeriGirer(String ssn) {

        registerPage.ssnInput.sendKeys(ssn);

    }

    @And("Kullanici ssn kutucuguna xxx-xx-xxxx formatina uygun ama bir eksik ya da bir fazla {string} degeri girer")
    public void kullaniciSsnKutucugunaXxxXxXxxxFormatinaUygunAmaBirEksikYaDaBirFazlaDegeriGirer(String ssn) {

        registerPage.ssnInput.sendKeys(ssn);

    }

    @And("Kullanici ssn kutucuguna xxx-xx-xxxx formatina uymayan bir {string} degeri girer")
    public void kullaniciSsnKutucugunaXxxXxXxxxFormatinaUymayanBirDegeriGirer(String ssn) {

        registerPage.ssnInput.sendKeys(ssn);

    }

    @And("Kullanici username kutucuguna {string} degeri girmez")
    public void kullaniciUsernameKutucugunaDegeriGirmez(String username) {

        registerPage.userNameInput.sendKeys("");
    }

    @And("Kullanici username kutucuguna dört karakterli bir {string} girer")
    public void kullaniciUsernameKutucugunaDortKarakterliBirGirer(String username) {

        registerPage.userNameInput.sendKeys(username);

    }

    @And("Kullanici username kutucuguna dört karakterden az ya da onalti'dan fazla bir {string} girer")
    public void kullaniciUsernameKutucugunaDortKarakterdenAzYaDaOnaltiDanFazlaBirGirer(String username) {

        registerPage.userNameInput.sendKeys(username);

    }

    @And("Kullanici password kutucuguna {string} degeri girmez")
    public void kullaniciPasswordKutucugunaDegeriGirmez(String arg0, String arg1) {

        registerPage.passwordInput.sendKeys("");
    }

    @And("Kullanici password kutucuguna sekiz karakterden az karakterde {string} girer")
    public void kullaniciPasswordKutucugunaSekizKarakterdenAzKarakterdeGirer(String password) {

        registerPage.passwordInput.sendKeys(password);
    }

    @And("Kullanici password kutucuguna en az sekiz karakterde {string} girer")
    public void kullaniciPasswordKutucugunaEnAzSekizKarakterdeGirer(String password) {

        registerPage.passwordInput.sendKeys(password);

    }


    @And("Kullanici password kutucuguna en az sekiz karakterde kosullara uygun {string} girer")
    public void kullaniciPasswordKutucugunaEnAzSekizKarakterdeKosullaraUygunGirer(String password) {

        registerPage.passwordInput.sendKeys(password);

    }



}