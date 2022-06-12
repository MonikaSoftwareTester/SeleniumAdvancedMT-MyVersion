package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CheckoutConfirmationPage extends BasePage {
    public CheckoutConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h1")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//div[@id='order-details']//li[1]")
    private WebElement orderNr;


    public String getConfirmationMessage(){
        return confirmationMessage.getText();
    }

    public String getOrderNumber(){
       return orderNr.getText().replace("Order reference: ", "");
    }
}
