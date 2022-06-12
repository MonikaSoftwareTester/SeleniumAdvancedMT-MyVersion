package base;

import org.testng.annotations.BeforeMethod;
import pages.checkout.*;
import pages.commons.ProductsGridPage;
import pages.commons.TopMenuPage;
import pages.products.CartPage;
import pages.products.CartPopupPage;
import pages.products.ProductDetailsPage;
import pages.user.*;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public ProductsGridPage productsGridPage;
    public ProductDetailsPage productDetailsPage;
    public CartPopupPage cartPopupPage;
    public CartPage cartPage;

    public AddressCheckoutPage addressCheckoutPage;

    public CheckoutConfirmationPage checkoutConfirmationPage;

    public PaymentsCheckoutPage paymentsCheckoutPage;

    public PersonalInfoCheckoutPage personalInfoCheckoutPage;

    public ShippingCheckoutPage shippingCheckoutPage;

    public MyAccountPage myAccountPage;

    public HistoryOfOrdersPage historyOfOrdersPage;

    public OrderDetailsPage orderDetailsPage;

    @BeforeMethod
    public void pagesSetup() {
        productDetailsPage = new ProductDetailsPage(driver);
        cartPopupPage = new CartPopupPage(driver);
        cartPage = new CartPage(driver);
        productsGridPage = new ProductsGridPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);


        addressCheckoutPage = new AddressCheckoutPage(driver);
        checkoutConfirmationPage = new CheckoutConfirmationPage(driver);
        paymentsCheckoutPage = new PaymentsCheckoutPage(driver);
        personalInfoCheckoutPage = new PersonalInfoCheckoutPage(driver);
        shippingCheckoutPage = new ShippingCheckoutPage(driver);

        myAccountPage = new MyAccountPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);
        orderDetailsPage = new OrderDetailsPage(driver);


    }
}
