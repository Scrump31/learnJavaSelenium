package testObjects;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.App;
public class AppTest extends BaseTest {
    App app;

    @Test
    public void whenUserCreate$450Budget_thenBudgetDisplayed() {
        app = new App(getDriver());
        app.openWebPage("https://scrump31.github.io/my-budgety/");
        app.clickSetIncomeBtn();
        app.enterIncome("450");
        app.clickSetIncomeModalBtn();

        Assert.assertEquals(app.getLeftOverAmount(), "$450");
    }
}