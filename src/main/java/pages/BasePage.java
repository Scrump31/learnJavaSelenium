package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitForElement(WebElement element, int timeout) {
        try {
            System.out.println("Waiting for max:: " + timeout + " seconds for element to be visible");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(
                    ExpectedConditions.visibilityOf(element));
            System.out.println("Element appeared on web page");
        } catch (Exception e) {
            System.out.println(e + "\n Element not visible on web page");
        }
        return element;
    }

    protected void clickWhenClickable(WebElement element) {
        try {
            System.out.println("Waiting for max:: " + 3 + " seconds for element to be clickable");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(
                    ExpectedConditions.elementToBeClickable(element));
            element.click();
            System.out.println("Element clicked on the web page");
        } catch (Exception e) {
            System.out.println("Element not appeared on the web page");
        }
    }

    public void openWebPage(String url) {
        driver.get(url);
    }
}
