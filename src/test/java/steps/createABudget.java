package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.App;

public class createABudget {
    App app;
    static WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();
        app = new App(driver);
        app.openWebPage("https://scrump31.github.io/my-budgety/");
    }

    @After
    public void afterScenario() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Given("I open the set income modal")
    public void i_open_the_set_income_modal() {
        app.clickSetIncomeBtn();
    }

    @When("I enter {string} as the income")
    public void i_enter_as_the_income(String string) {
        app.enterIncome("450");
    }

    @When("I close the set income modal")
    public void i_close_the_set_income_modal() {
        app.clickSetIncomeModalBtn();
    }

    @Then("Income is set to ${string}")
    public void income_is_set_to_$450(String string) {
        Assert.assertEquals(app.getIncomeStat(), "Income: $450");
    }
}
