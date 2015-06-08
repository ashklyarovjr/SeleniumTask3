package page_object.utils;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {

    private static final Logger LOGGER_INFO = Logger.getLogger(Utils.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(Utils.class);

    public static int getPriceFromString(WebElement price) {
        if (price == null) {
            LOGGER_ERR.error("Utils.class. getPriceFromString method exception. Price is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get price!");
        }
        String[] splittedPrice = price.getText().trim().split("\\s");
        return Integer.parseInt(splittedPrice[0]);
    }

    public static List<String> parseDescriptionToStringList(WebElement description) {
        if (description == null) {
            LOGGER_ERR.error("Utils.class. parseDescriptionToStringList(WebElement) method exception. Description is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }
        String[] splitted = description.getText().trim().split(";\\s");
        List<String> newDesc = new ArrayList<>();
        Collections.addAll(newDesc, splitted);
        return newDesc;
    }

    //TODO
    public static List<String> parseDescriptionToStringList(List<WebElement> description) {
        if (description == null) {
            LOGGER_ERR.error("Utils.class. parseDescriptionToStringList(List<WebElement>) method exception. Description is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }
        return null;
    }

    public static boolean compareDescriptions(List<String> smallDescription, List<String> fullDescription) {
        if (smallDescription == null || fullDescription == null) {
            if (smallDescription == null)
                LOGGER_ERR.error("Utils.class. compareDescriptions method exception. Small description is null.");
            else
                LOGGER_ERR.error("Utils.class. compareDescriptions method exception. Full description is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot compare descriptions!");
        }
        int counter = 0;
        for (int i = 0; i < smallDescription.size(); i++) {
            if (smallDescription.get(i).equalsIgnoreCase(fullDescription.get(i))) {
                counter++;
            }
        }
        return counter == smallDescription.size();
    }

    public static String getTextValueOfWebElement(WebElement element) {
        if (element == null) {
            LOGGER_ERR.error("Utils.class. getTextValueOfWebElement method exception. WebElement is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get element!");
        } else if (element.getText() != null) {
            LOGGER_INFO.info("Utils.class. getTextValueOfWebElement method completed successfully with getText() method");
            return element.getText();
        } else if (element.getAttribute("value") != null) {
            LOGGER_INFO.info("Utils.class. getTextValueOfWebElement method completed successfully with getAttribute() method");
            return element.getAttribute("value");
        } else {
            LOGGER_ERR.error("Utils.class. getTextValueOfWebElement method exception. Cannot get string value of element.");
            throw new IllegalArgumentException("Something went wrong. Cannot get string value of element!");
        }
    }


    public static String getNameOfProductFromHeader(WebElement header) {
        if (header == null) {
            LOGGER_ERR.error("Utils.class. getNameOfProductFromHeader method exception. WebElement is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get element!");
        }
        String[] splittedHeader = getTextValueOfWebElement(header).trim().split("\\s");
        return splittedHeader[0] + " " + splittedHeader[1];
    }

    public static boolean compareWebElementsStringValues(WebElement first, WebElement second) {
        if (first == null || second == null) {
            if (first == null)
                LOGGER_ERR.error("Utils.class. compareWebElementsStringValues method exception. First element is null.");
            else
                LOGGER_ERR.error("Utils.class. compareWebElementsStringValues method exception. Second element is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot compare descriptions!");
        }
        return getTextValueOfWebElement(first).equalsIgnoreCase(getTextValueOfWebElement(second));
    }

}
