package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.PlaceOrder;

public class PlaceOrderStepDef extends BaseUtil {

    private BaseUtil base;

    public PlaceOrderStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to automation practice website$")
    public void iNavigateToAutoPracticeWebsite() {
        PlaceOrder page = new PlaceOrder(base.driver);
        base.driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I add two products to cart$")
    public void addTwoProductsToCart() {
        PlaceOrder page = new PlaceOrder(base.driver);
        page.addtwoProductsToCart();
    }

    @Then("^I should be able to place the order successfully$")
    public void iShouldBeAbleToPlaceTheOrderSuccessfully() {
        PlaceOrder page = new PlaceOrder(base.driver);
        page.placeOrder();
        Assert.assertTrue(page.getOrderSuccessfulConfirmationText().contentEquals("Your order on My Store is complete."), "Issue while placing the order");
    }
}
