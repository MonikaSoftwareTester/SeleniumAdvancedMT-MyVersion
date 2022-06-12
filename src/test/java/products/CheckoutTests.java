package products;

import base.Pages;
import helpers.RandomHelper;
import models.SocialTitle;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.user.MyAccountPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTests extends Pages {

    @Test
    public void shouldBuyProduct(){

        productsGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productDetailsPage.addToCart();

        cartPopupPage.proceedToCheckout();

        cartPage.goToCheckout();

        personalInfoCheckoutPage
                .selectSocialTitle(SocialTitle.Mr)
                .setFirstName("Jan")
                .setLastName("Nowak")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("12345")
                .acceptPolices();

        personalInfoCheckoutPage.goToAddressSection();

        addressCheckoutPage.setAddress("ul. Testowa")
                .setCity("Warszawa")
                .setState("3")
                .setZipCode("00000")
                .goToShippingSection();

        shippingCheckoutPage.goToPaymentSection();

        paymentsCheckoutPage.payByCheck()
                .acceptTerms()
                .confirmPayment();

        assertThat(checkoutConfirmationPage.getConfirmationMessage()).contains("YOUR ORDER IS CONFIRMED");

        String orderNr = checkoutConfirmationPage.getOrderNumber();
        assertThat(orderNr).isNotEmpty();

        topMenuPage.goToMyAccount();

        myAccountPage.goToHistoryOfOrders();

        assertThat(historyOfOrdersPage.getOrdersNumber()).contains(orderNr);

        historyOfOrdersPage.openOrder(orderNr);

        assertThat(orderDetailsPage.getOrderInfo()).contains(orderNr);





        // w koszyku clikc -> Proceed to checkout
        // 1 PERSONAL INFORMATION -> wypelnienie wymaganych danych
        // klikamy continue

        // 2 ADDRESSES -> wymagane dane
        // klikamy continue


        // 3 SHIPPING METHOD ->  klikamy continue

        //4 PAYMENT -> zaznacz Pay by Check i checkbox I agree to the terms of service
        // klik Place order

        // sprzawczy czy tekst YOUR ORDER IS CONFIRMED zostal wyswietlony
        // ***dla chętnych: weryfikacja danych kupionego produktu (nazwa, cena, ilosc, cena laczna)

        // pkt 5 do zmiennej zapisz wygenerowany numer zamowienia

        // przejdz do 'Your account'
        // przejdz do ORDER HISTORY AND DETAILS
        // sprawdz czy na stronie z historia zamowien znajduje się numer zamowienia z pkt 5

        // otworz zamowienie o numerze z pkt 5
        // sprzeczy czy tekst "Order Reference JBCERFQZQ - placed on 06/11/2022" zawiera numer zamowienia z pkt5
        // ****dla chetnych spr pozostałe szczegoly zamowienia

    }
}
