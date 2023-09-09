package techproed.stepDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.LessonManagementHomepage;
import techproed.pages.MainLoginPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Us12_StepDefs {
    MainLoginPage mainLogin = new MainLoginPage();
    LessonManagementHomepage viceDean = new LessonManagementHomepage();
    Actions actions = new Actions(Driver.getDriver());

    //----------------TC02--------------------

    @And("Kullanici Lesson Program List te dersin eklendigini dogrulamalidir")
    public void kullaniciLessonProgramListTeDersinEklendiginiDogrulamalidir() {

    }

    //----------------TC03--------------------
    @And("kullanci sayfayi Choose Lesson gorunene kadar kaydirir")
    public void kullanciSayfayiChooseLessonGoruneneKadarKaydirir() {
        ReusableMethods.scroll(viceDean.chooseLessonbox);
    }
    @And("Kullanici Lesson Program sayfasinda olusturulan dersi Choose Lesson sekmesindeki klik boxunu isaretler")
    public void kullaniciLessonProgramSayfasindaOlusturulanDersiChooseLessonSekmesindekiKlikBoxunuIsaretler() {
       // viceDean.chooseLessonClickBox.click();
      //  ReusableMethods.visibleWait(viceDean.chooseLessonClickBox, 7);
       ReusableMethods.click(viceDean.chooseLessonClickBox);

    }
    @And("kullanici sayfayi Choose Teacher menusune kadar kaydirir")
    public void kullaniciSayfayiChooseTeacherMenusuneKadarKaydirir() {
      ReusableMethods.scroll(viceDean.chooseTeacherTitle);
      ReusableMethods.visibleWait(viceDean.chooseTeacherTitle,7);

      actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Teacher menusunu tiklar")
    public void kullaniciTeacherMenusunuTiklar() {

       //ReusableMethods.click(viceDean.chooseTeacher);
       // viceDean.chooseTeacher.click();
    }
    @And("Kullanici Lesson Program List sayfasinin altindaki Choose Teacher menusunden 2 siradaki ismi tiklar")
    public void KullaniciLessonProgramListsayfasininaltindakiChooseTeachermenusunden2siradakiismitiklar() {
        ReusableMethods.click(viceDean.chooseTeacher);
        ReusableMethods.bekle(2);
        Select select =new Select(viceDean.chooseTeacher);
        select.selectByIndex(2);


    }



}
