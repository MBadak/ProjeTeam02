package techproed.stepDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.LessonManagementHomepage;
import techproed.pages.MainLoginPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class Us11_Olusturulan_Dersin_Kontrolu_StepDefs {
    MainLoginPage mainLogin = new MainLoginPage();
    LessonManagementHomepage viceDean = new LessonManagementHomepage();
    Actions actions = new Actions(Driver.getDriver());


    @And("kullanici sayfayi kaydirir")
    public void kullaniciSayfayiKaydirir() {
        ReusableMethods.scroll(viceDean.lessonProgramListTable);
        //  actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Lesson görebilmelidir.")
    public void kullaniciLessonDayGörebilmelidir() {
        System.out.println(viceDean.dersIsmiGorunur.getText());
        assertTrue(viceDean.dersIsmiGorunur.isDisplayed());
    }

    @And("kullanici Day görebilmelidir.")
    public void kullaniciDayGörebilmelidir() {
        System.out.println(viceDean.dayGorunur.getText());
        assertTrue(viceDean.dayGorunur.isDisplayed());
    }

    @And("kullanici Start Time görebilmelidir.")
    public void kullaniciStartTimeGörebilmelidir() {
        System.out.println(viceDean.startTimeGorunur.getText());
        assertTrue(viceDean.startTimeGorunur.isDisplayed());
    }

    @And("kullanici Stop Time görebilmelidir.")
    public void kullaniciStopTimeGörebilmelidir() {
        System.out.println(viceDean.stopTimeGorunur.getText());
        assertTrue(viceDean.stopTimeGorunur.isDisplayed());
    }


}
