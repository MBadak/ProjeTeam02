package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LessonManagementHomepage {
    public LessonManagementHomepage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //***************************** Lesson Pragam sekmesi lacateleri **********************************************
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;
    //-----------------Add Lesson Program table
    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement chooseLesson;
    @FindBy(xpath = "//*[@id='day']")
    public WebElement chooseDay;
    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement chooseEducationTerm;
    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[1]")
    public WebElement startTime;
    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTime;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement addLessonProgramSubmit;

    //--------------Lesson Program List table US11--
    @FindBy(xpath = "(//table)[3]//tr[2]//td[1]")
    public WebElement dersIsmiGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[2]")
    public WebElement dayGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[3]")
    public WebElement startTimeGorunur;
    @FindBy(xpath = "(//table)[3]//tr[2]//td[4]")
    public WebElement stopTimeGorunur;
    @FindBy(xpath = "(//table//*[@class='form-check-input'])[2]")
    public WebElement chooseLessonClickBox;


    @FindBy(xpath = "//*[@id='teacherId']")
    public WebElement chooseTeacher;
    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[9]")
    public WebElement lessonProgramListTable;

    @FindBy(xpath = "//th[normalize-space()='Choose Lesson']")
    public WebElement chooseLessonbox;

    @FindBy(xpath = "//*[@class='fw-semibold mt-2 form-label']")
    public WebElement chooseTeacherTitle;




}
