package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class PaymentsCheckoutPage extends BasePage {
    public PaymentsCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#payment-option-1")
    private WebElement payByCheck;

    @FindBy(css = "#conditions_to_approve\\[terms-and-conditions\\]")
    private WebElement acceptTerms;

    @FindBy(css = "#payment-confirmation > div.ps-shown-by-js > button")
    private WebElement placeOrderBtn;


    public PaymentsCheckoutPage payByCheck(){
        click(payByCheck);
        return this;
    }

    public PaymentsCheckoutPage acceptTerms(){
        click(acceptTerms);
        return this;
    }

    public PaymentsCheckoutPage confirmPayment(){
        click(placeOrderBtn);
        return this;
    }
}
