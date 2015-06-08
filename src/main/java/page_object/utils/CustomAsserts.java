package page_object.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class CustomAsserts {

    private static final Logger LOGGER_INFO = Logger.getLogger(CustomAsserts.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(CustomAsserts.class);

    public static void assertThatStringContainsSubstring(String string, String subString) {
        try {
            assertThat(string, containsString(subString));
        } catch (AssertionError e) {
            LOGGER_ERR.error("CustomAsserts.class. Assertion error in substring search method." + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public static void assertElementsAttributeValue(WebElement element, String attribute, String value) {
        try {
            assertThat(element.getAttribute(attribute), is(value));
        } catch (AssertionError e) {
            LOGGER_ERR.error("CustomAsserts.class. Assertion error in assertElementsAttributeValue method." + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public static void assertThatElementIsPresentOnPage(WebElement element) {
        try {
            Assert.assertNotNull(element);
        } catch (AssertionError e) {
            LOGGER_ERR.error("CustomAsserts.class. Assertion error in assertThatElementIsPresentOnPage method." + e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
