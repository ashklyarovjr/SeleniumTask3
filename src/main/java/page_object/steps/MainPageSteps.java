package page_object.steps;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.base.AbstractSteps;
import page_object.pages.MainPage;

public class MainPageSteps extends AbstractSteps {

    private static final Logger LOGGER_INFO = Logger.getLogger(MainPageSteps.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(MainPageSteps.class);

    public MainPageSteps(WebDriver driver) {
        super(driver);
    }


}
