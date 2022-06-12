package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.RegistrationPage;

import java.util.List;

public class PersonalInfoCheckoutPage extends RegistrationPage {
    public PersonalInfoCheckoutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".form-footer button")
    private WebElement continueBtn;


    public PersonalInfoCheckoutPage goToAddressSection(){
        continueBtn.click();
        return this;
    }



}
