package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class App extends BasePage {
    @FindBy(css = "[data-cy=\"setIncomeBtn\"]")
    WebElement setIncomeBtn;

    @FindBy(css = "input[placeholder=\"Enter a number\"]")
    WebElement setIncomeInput;

    @FindBy(css = "[data-cy=\"setIncomeModalBtn\"]")
    WebElement setIncomeModalBtn;

    @FindBy(css = "[data-cy=\"incomeStat\"]")
    WebElement incomeStat;

    @FindBy(css = "[data-cy=\"catSelect\"]")
    WebElement categorySelector;

    public App(WebDriver driver) {
        super(driver);
        // Initializes selectors for use
        PageFactory.initElements(driver, this);
    }

    public void clickSetIncomeBtn() {
        clickWhenClickable(setIncomeBtn);
    }

    public void enterIncome(String amount) {
        waitForElement( setIncomeInput, 3).sendKeys(amount);
    }

    public void clickSetIncomeModalBtn() {
        clickWhenClickable(setIncomeModalBtn);
    }

    public String getIncomeStat() {
        return incomeStat.getText();
    }
}

