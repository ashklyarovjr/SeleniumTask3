package page_object.utils;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Utils {


    private static final Logger LOGGER_INFO = Logger.getLogger(Utils.class);

    private static final Logger LOGGER_ERR = Logger.getLogger(Utils.class);

    public static List<String> parseDescriptionToStringList(WebElement description) {
        if (description == null) {
            LOGGER_ERR.error("Utils.class. parseDescriptionToStringList(WebElement) method exception. Description is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }
        String[] splitted = description.getText().trim().split("\\s\\b|;\\s");

        splitted[0] = splitted[0] + splitted[1];

        List<String> newDesc = new ArrayList<>();
        Collections.addAll(newDesc, splitted);
        LOGGER_INFO.info("Utils.class. parseDescriptionToStringList(WebElement) method success.");
        return newDesc;
    }


    public static List<String> parseWebElementListToStringList(List<WebElement> elements) {
        if (elements == null) {
            LOGGER_ERR.error("Utils.class. parseDescriptionToStringList(List<WebElement>) method exception. Description is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }
        List<String> stringList = new ArrayList<>();
        for (WebElement element : elements) {
            stringList.add(getTextValueOfWebElement(element));
        }
        LOGGER_INFO.info("Utils.class. parseDescriptionToStringList(List<WebElement>) method success.");
        return stringList;
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

    public static boolean checkIfStringListIsSorted(List<String> list) {
        if (list == null) {
            LOGGER_ERR.error("Utils.class. checkIfStringListIsSorted method exception. List is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }

        List<String> temporary = new ArrayList<>();

        temporary.addAll(list);

        Collections.sort(temporary);

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(temporary.get(i), list.get(i)))
                counter++;
        }
        return counter == list.size();
    }

    public static boolean checkIfIntegerListIsSorted(List<Integer> list) {
        if (list == null) {
            LOGGER_ERR.error("Utils.class. checkIfIntegerListIsSorted method exception. List is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }

        List<Integer> temporary = new ArrayList<>();

        temporary.addAll(list);

        Collections.sort(temporary);
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(temporary.get(i), list.get(i)))
                counter++;
        }
        return counter == list.size();
    }

    public static List<Integer> convertPriceListToIntegerList(List<WebElement> priceList) {
        if (priceList == null) {
            LOGGER_ERR.error("Utils.class. convertPriceListToIntegerList method exception. Price list is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get description!");
        }
        List<Integer> prices = new ArrayList<>();
        for (WebElement price : priceList) {
            prices.add(convertTextValueOfElementToInt(price));
        }
        return prices;
    }

    public static boolean checkThatListContainsAnotherList(List<String> container, List<String> content) {
        if (container == null || content == null) {
            if (container == null)
                LOGGER_ERR.error("Utils.class. checkThatListContainsAnotherList method exception. Container list is null.");
            else
                LOGGER_ERR.error("Utils.class. checkThatListContainsAnotherList method exception. Content list is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot get lists!");
        }
        return container.containsAll(content);
    }

    public static boolean checkThatListContentIsInBounds(List<Integer> content, int lowBound, int highBound) {
        if (content == null || lowBound == 0 || highBound == 0) {
            if (content == null)
                LOGGER_ERR.error("Utils.class. checkThatListContentIsInBounds method exception. Content list is null.");
            else if (lowBound == 0)
                LOGGER_ERR.error("Utils.class. checkThatListContentIsInBounds method exception. Low bound is null.");
            else
                LOGGER_ERR.error("Utils.class. checkThatListContentIsInBounds method exception. High bound is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot check list!");
        }

        for (Integer number : content) {
            if (number >= lowBound && number <= highBound)
                continue;
            else
                return false;
        }
        return true;
    }

    public static int convertTextValueOfElementToInt(WebElement element) {
        if (element == null) {
            LOGGER_ERR.error("Utils.class. checkThatListContentIsInBounds method exception. Content list is null.");
            throw new IllegalArgumentException("Something went wrong. Cannot check list!");
        }
        String stringValue = getTextValueOfWebElement(element).trim().replaceAll("\\D", "");
        return Integer.parseInt(stringValue);
    }




}
