package page_object.utils;


public class Utils {

    public static int getPriceFromString(String price){
        int converted;
        String[] splittedPrice = price.split("/s");
        converted = Integer.parseInt(splittedPrice[0]);
        return converted;
    }
}
