package page_object.constants_containers;


public final class XpathContainer {

    public final class ProductsListXPATHContainer {
        public static final String PRODUCTS_SORT_BY_NAME_XPATH = "//a[contains(@href, 'sort=name')]";
        public static final String PRODUCTS_SORT_BY_PRICE_XPATH = "//a[contains(@href, 'sort=price')]";
        public static final String ALL_PRODUCTS_NAMES_LIST_XPATH = "//div[@class='catalog']/div[@class='item']/div[@class='name']/a";
        public static final String FIRST_FIVE_PRODUCTS_NAMES_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='name']/a";
        public static final String ALL_PRODUCTS_PRICES_LIST_XPATH = "//div[@class='catalog']/div[@class='item']/div[@class='price']/strong";
        public static final String FIRST_FIVE_PRODUCTS_PRICES_LIST_XPATH = "//preceding-sibling::div[@class='item'][16]/div[@class='price']/strong";
        public static final String FIRST_PRODUCT_COMPARE_OPTION_XPATH = "(//span[contains(@class, 'compare_add_link')][1])[1]";
        public static final String SECOND_PRODUCT_COMPARE_OPTION_XPATH = "(//span[contains(@class, 'compare_add_link')][1])[2]";
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
        public static final String COMPARE_PRODUCTS_LINK_XPATH = "//div/a[contains(@class,'head-compare-link')]";
        public static final String SELECTED_SORT_OPTION_XPATH = "//span[@class='span_active']";
        public static final String MIN_PRICE_FILTER_XPATH = "(//a[contains(text(), '15000')])[1]";
        public static final String MAX_PRICE_FILTER_XPATH = "//div[@class='group'][2]//a[contains(text(), '18000')]";
        public static final String NEXT_PRODUCT_LIST_PAGE_LINK_XPATH = "(//li[@class='pager-next']/a)[1]";
        public static final String BAKERS_MANUFACTURERS_XPATH = "//div[contains(@class, 'criteria')]//div[@class='group'][3]//a[contains(@class, 'active') and position() <= 2]";
        public static final String BAKERS_FIRST_MANUFACTURER_XPATH = "//div[contains(@class, 'criteria')]//div[@class='group'][3]//a[contains(@class, 'active') and position() = 1]";
        public static final String BAKERS_SECOND_MANUFACTURER_XPATH = "//div[contains(@class, 'criteria')]//div[@class='group'][3]//a[contains(@class, 'active') and position() = 2]";
        public static final String WEIGHT_OPTION_XPATH = "//div[@class='group' and position() = last()]//a[2]";
        public static final String ALL_PRODUCTS_ONPAGE_DESCRIPTIONS_XPATH = "//div[@class='item']//div[@class='description']";
        public static final String FIRST_FIVE_PRODUCTS_DESCRIPTIONS_XPATH = "//div[@class='item' and position() <= 7]//div[@class='description']";

    }

    public final class MainPageXPATHContainer {
        public static final String FRIDGES_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[3]";
        public static final String WASHERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[4]";
        public static final String MICROWAVE_OWENS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[6]";
        public static final String BREAD_BAKERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[9]";
        public static final String CONDITIONERS_CATEGORY_XPATH = "//div[@class='home-page-cloud']//h1[3]//following-sibling::a[1]";
        public static final String NEWS_LABEL_XPATH = "//div[@class='promo']";
    }

    public final class ProductInfoXPATHContainer {
        public static final String PRODUCT_DESCRIPTION_XPATH = "//div[@class='row']/span[2]";
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
        public static final String COMPARE_PRODUCTS_LINK_XPATH = "//div/a[contains(@class,'head-compare-link')]";
        public static final String BACK_TO_CATEGORY_XPATH = "//div[@id='page-breadcrumbs']/a[position() = last()]";
    }

    public final class ProductPriceXPATHContainer {
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
        public static final String FIRST_FIVE_PRODUCTS_FROM_PRICE_XPATH = "//preceding-sibling::tr[contains(@class,'price_table_tr')][20]//a[@class='description-link']";

    }

    public final class ProductsComparisonXPATHContainer {
        public static final String BOTH_PRODUCTS_INFO_XPATH = "//table[@class='compare']//td[position() > 1]//.. | //table[@class='compare']//td[position() > 1]";
        public static final String MAIN_PAGE_LINK_XPATH = "//div[@id='page-breadcrumbs']/a[@href='http://pn.com.ua/']";
        public static final String FIRST_PRODUCT_INFO = "//th[@class='row-2'][1]/a";
        public static final String SECOND_PRODUCT_INFO = "//th[@class='row-2'][2]/a";
    }

}
