package page_object.constants_containers;


public final class XpathContainer {

    public final class ProductsListXPATHContainer {
        public static final String PRODUCTS_SORT_BY_NAME_XPATH = "//a[contains(@href, 'sort=name')]";
        public static final String PRODUCTS_SORT_BY_PRICE_XPATH = "//a[contains(@href, 'sort=price')]";
        public static final String ALL_PRODUCTS_NAMES_LIST_XPATH = "//div[@class='catalog']/div[@class='item']/div[@class='name']/a";
        public static final String FIRST_FIVE_PRODUCTS_NAMES_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='name']/a";
        public static final String ALL_PRODUCTS_PRICES_LIST_XPATH = "//div[@class='catalog']/div[@class='item']/div[@class='price']/a";
        public static final String FIRST_FIVE_PRODUCTS_PRICES_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='price']/strong";
        public static final String FIRST_FIVE_PRODUCTS_DESCRIPTIONS_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='description']";
    }

    public final class MainPageXPATHContainer {
        public static final String FRIDGES_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[3]";
        public static final String WASHERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[4]";
        public static final String MICROWAVE_OWENS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[6]";
        public static final String BREAD_BAKERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[9]";
        public static final String CONDITIONERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[1]";
    }

    public final class ProductInfoXPATHContainer {

    }

    public static class ProductPriceXPATHContainer {

    }

}
