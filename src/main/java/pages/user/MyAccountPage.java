package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"history-link\"]/span")
    private WebElement ordersHistory;

    public void goToHistoryOfOrders() {
        waitToBeVisible(ordersHistory);
        click(ordersHistory);
    }
}
