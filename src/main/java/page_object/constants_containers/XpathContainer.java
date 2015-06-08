package page_object.constants_containers;


public final class XpathContainer {

    public final class ProductsListXPATHContainer {
        public static final String PRODUCTS_SORT_BY_NAME_XPATH = "//a[contains(@href, 'sort=name')]";
        public static final String PRODUCTS_SORT_BY_PRICE_XPATH = "//a[contains(@href, 'sort=price')]";
        public static final String ALL_PRODUCTS_NAMES_LIST_XPATH = "//div[@class='catalog']/div[@class='item']/div[@class='name']/a";
        public static final String FIRST_FIVE_PRODUCTS_NAMES_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='name']/a";
        public static final String ALL_PRODUCTS_PRICES_LIST_XPATH = "//div[@class='catalog']/div[@class='item']/div[@class='price']/a";
        public static final String FIRST_FIVE_PRODUCTS_PRICES_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='price']/strong";
        public static final String FIRST_PRODUCT_COMPARE_OPTION_XPATH = "(//span[contains(@class, 'compare_add_link')][1])[1]";
        public static final String SECOND_PRODUCT_COMPARE_OPTION_XPATH = "(//span[contains(@class, 'compare_add_link')][1])[2]";
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
        public static final String ALL_PRODUCTS_INFO_IN_THE_LIST_XPATH = "//div[@class='item']/div[@class='name']/a | //div[@class='item']/div[@class='description'] | //div[@class='item']//strong";
        public static final String COMPARE_PRODUCTS_LINK_XPATH = "//div/a[contains(@class,'head-compare-link')]";
        public static final String SELECTED_SORT_OPTION_XPATH = "//span[@class='span_active']";
    }

    public final class MainPageXPATHContainer {
        public static final String FRIDGES_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[3]";
        public static final String WASHERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[4]";
        public static final String MICROWAVE_OWENS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[6]";
        public static final String BREAD_BAKERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[9]";
        public static final String CONDITIONERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[1]";
    }

    public final class ProductInfoXPATHContainer {
        public static final String PRODUCT_PRICE_NAME_DESCRIPTION_XPATH = "//div[@id='page-subheader']/h1 | //div[@class=\"summary-price\"]/b | //div[@class='row']/span[2]";
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
    }

    public final class ProductPriceXPATHContainer {
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
        public static final String FIRST_FIVE_PRODUCTS_FROM_PRICE_XPATH = "//preceding-sibling::tr[contains(@class,'price_table_tr')][20]//a[@class='description-link']";

    }

    public final class ProductsComparisonXPATHCantainer {
        public static final String BOTH_PRODUCTS_INFO_XPATH = "//table[@class='compare']//td[position() > 1]//.. | //table[@class='compare']//td[position() > 1]";
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";

    }

}
