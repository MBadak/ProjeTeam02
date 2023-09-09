package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.LessonManagementHomepage;
import techproed.pages.MainLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Us10_Ders_Programi_Olustur_StepDefs {
    MainLoginPage mainLogin = new MainLoginPage();
    LessonManagementHomepage viceDean = new LessonManagementHomepage();
    Actions actions = new Actions(Driver.getDriver());

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici managementonschools.com sayfasina gider")
    public void kullaniciManagementonschoolsComSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @When("Kullanici Login Butonuna tıklar")
    public void kullaniciLoginButonunaTıklar() {
        mainLogin.loginMenusu.click();
    }

    @Then("kullanici User Name boxa tıklar")
    public void kullaniciUserNameBoxaTıklar() {
        mainLogin.username.sendKeys("ViceDeanTeam02");
    }

    @And("kullanici Password boxa tıklar")
    public void kullaniciPasswordBoxaTıklar() {
        mainLogin.password.sendKeys("ViceDeanTeam02.");
    }

    @And("kullanıcı Login butonuna tıklar")
    public void kullanıcıLoginButonunaTıklar() {
        mainLogin.loginButton.click();
    }

    @And("kullanıcı Lesson Program sekmesini bulur")
    public void kullanıcıLessonProgramSekmesiniBulur() {

        ReusableMethods.click(viceDean.lessonProgram);
    }

    @And("kullanıcı Choose Lessons menusunu tıklar")
    public void kullanıcıChooseLessonsMenusunuTıklar() {
        viceDean.chooseLesson.click();
        viceDean.chooseLesson.getText().indexOf(0);
    }

    @And("kullanıcı Choose Lessons menusunden ilk siradaki dersi secer")
    public void kullanıcıChooseLessonsMenusundenIlkSiradakiDersiSecer() {
        viceDean.chooseLesson.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    }

    @And("kullanici Choose Education Term sekmesini tiklar")
    public void kullaniciChooseEducationTermSekmesiniTiklar() {
        viceDean.chooseEducationTerm.click();
    }

    @And("kullanici Choose Education Term sekmesinden ikinci secenegi secer")
    public void kullaniciChooseEducationTermSekmesindenIkinciSecenegiSecer() {
        Select ddm = new Select(viceDean.chooseEducationTerm);
        ddm.selectByIndex(1);
    }

    @And("kullanici Choose Day menusunden {int}. secenegi secer")
    public void kullaniciChooseDayMenusundenSecenegiSecer(int arg0) {
        ReusableMethods.click(viceDean.chooseDay);
        // viceDean.chooseDay.click();
        Select ddm = new Select(viceDean.chooseDay);
        ddm.selectByIndex(2);
    }

    @And("kullanici Start Time menusune saat girer")
    public void kullaniciStartTimeMenusuneSaatGirer() {
        viceDean.startTime.click();
       // ReusableMethods.sendKeysJS(viceDean.startTime,"1230");
      viceDean.startTime.sendKeys("12:30");
    }

    @And("kullanici Stop Time menusune saat girer")
    public void kullaniciStopTimeMenusuneSaatGirer() {

        viceDean.stopTime.sendKeys("13:30");
    }

    @And("kullanici bilgileri submit yapar")
    public void kullaniciBilgileriSubmitYapar() {
        viceDean.addLessonProgramSubmit.click();
    }


}

