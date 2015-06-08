package page_object.base;

import org.openqa.selenium.WebDriver;


public abstract class AbstractPage {

    protected final WebDriver driver;

    protected String title;

    protected String url;

    public AbstractPage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
        title = driver.getTitle();

    }

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected void setUrl(String url) {
        this.url = url;
    }

    protected String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public AbstractPage goToPage() {
        driver.get(url);
        title = driver.getTitle();
        return this;
    }


}
