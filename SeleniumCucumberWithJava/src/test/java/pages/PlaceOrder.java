package pages;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {

    @FindBy(id = "email")
    WebElement usernameField;
    @FindBy(id = "passwd")
    WebElement passwordField;
    @FindBy(id = "SubmitLogin")
    WebElement signInButton;
    @FindBy(css = "#homefeatured:nth-of-type(1) > li:nth-of-type(1) > * a[data-id-product='1']")
    WebElement product1;
    @FindBy(css = "#homefeatured:nth-of-type(1) > li:nth-of-type(2) > * a[data-id-product='2']")
    WebElement product2;
    @FindBy(css = "span[class='continue btn btn-default button exclusive-medium']")
    WebElement continueShopping;
    @FindBy(css = "a[class='btn btn-default button button-medium']")
    WebElement proceedCheckout;
    @FindBy(css = "button[name='processAddress']")
    WebElement proceedCheckoutOnAddress;
    @FindBy(css = "button[name='processCarrier']")
    WebElement proceedCheckoutOnProcessCarrier;
    @FindBy(css = "a[class='button btn btn-default standard-checkout button-medium']")
    WebElement proceedCheckoutToPlaceorder;
    @FindBy(id = "uniform-cgv") //css = "input[id='cgv']")
            WebElement checkTandC;
    @FindBy(css = "a[class='cheque']")
    WebElement payTypeByCheck;
    @FindBy(css = "button[class='button btn btn-default button-medium']")
    WebElement confirmOrder;
    @FindBy(css = "p[class='alert alert-success']")
    WebElement orderCompleteBanner;

    private BaseUtil base;
    private WebDriverWait wait;

    public PlaceOrder(WebDriver driver) {
        wait = new WebDriverWait(driver, 60, 50);
        PageFactory.initElements(driver, this);
    }


    public void navigateToEcommerceUrl() {
        base.driver.navigate().to("http://automationpractice.com/index.php");
    }

    public void enterUserName() {
        wait.until(ExpectedConditions.visibilityOf(usernameField)).click();
        usernameField.clear();
        usernameField.sendKeys("testautomation88@gmail.com");
    }

    public void enterPassword() {
        wait.until(ExpectedConditions.visibilityOf(passwordField)).click();
        passwordField.clear();
        passwordField.sendKeys("woolies");
    }

    public void clickSigninButton() {
        wait.until(ExpectedConditions.visibilityOf(signInButton)).click();
    }

    public void addtwoProductsToCart() {
        wait.until(ExpectedConditions.visibilityOf(product1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();
        wait.until(ExpectedConditions.elementToBeClickable(product2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedCheckout)).click();
    }

    public void placeOrder() {
        wait.until(ExpectedConditions.visibilityOf(proceedCheckoutToPlaceorder)).click();
        enterUserName();
        enterPassword();
        clickSigninButton();
        wait.until(ExpectedConditions.visibilityOf(proceedCheckoutOnAddress)).click();
        wait.until(ExpectedConditions.visibilityOf(checkTandC)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedCheckoutOnProcessCarrier)).click();
        wait.until(ExpectedConditions.visibilityOf(payTypeByCheck)).click();
        wait.until(ExpectedConditions.visibilityOf(confirmOrder)).click();
    }

    public String getOrderSuccessfulConfirmationText() {
        return wait.until(ExpectedConditions.visibilityOf(orderCompleteBanner)).getText();
    }
}