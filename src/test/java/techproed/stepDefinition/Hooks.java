package techproed.stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.time.Duration;

import static techproed.base_url.ManagementonSchoolsUrl.setUp;


public class Hooks {
    @Before
    public void setUpApi(String password, String username) throws Exception {
       setUp(password,username);
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
            Driver.closeDriver();
        }


    }

}
