package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

import java.util.List;

public class AddressCheckoutPage extends BasePage {
    public AddressCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "id_state")
    private WebElement state;

    @FindBy(name = "postcode")
    private WebElement zipCode;

    @FindBy(name = "id_country")
    private WebElement country;

    @FindBy(name = "confirm-addresses")
    private WebElement confirmAddressBtn;


    public AddressCheckoutPage setAddress(String address){
        sendKeys(this.address, address);
        return this;
    }

    public AddressCheckoutPage setCity(String city){
        sendKeys(this.city, city);
        return this;
    }

    public AddressCheckoutPage setState(String state){
        Select states = new Select(this.state);
        states.selectByValue(state);
        return this;
    }

    public AddressCheckoutPage setZipCode(String zipCode){
        sendKeys(this.zipCode, zipCode);
        return this;
    }


    public AddressCheckoutPage goToShippingSection(){
        click(confirmAddressBtn);
        return this;
    }
}
