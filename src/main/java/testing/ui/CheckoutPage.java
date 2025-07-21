package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    private CheckoutPage() { }

    public static final Target FULL_NAME_INPUT = Target.the("full name input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/fullNameET"));

    public static final Target ADDRESS_INPUT = Target.the("address input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/address1ET"));

    public static final Target CITY_INPUT = Target.the("city input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/cityET"));

    public static final Target ZIP_CODE_INPUT = Target.the("zip code input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/zipET"));

    public static final Target COUNTRY_INPUT = Target.the("country input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/countryET"));

    public static final Target PAYMENT_BTN = Target.the("to payment btn")
        .located(By.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));

    // PAYMANT PAGE
    public static final Target FULL_PAY_NAME_INPUT = Target.the("full pay name input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/nameET"));

    public static final Target CARD_NUMBER_INPUT = Target.the("card number input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/cardNumberET"));

    public static final Target EXPIRATION_DATE_INPUT = Target.the("expiration date input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/expirationDateET"));

    public static final Target CODE_INPUT = Target.the("security code input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/securityCodeET"));

    public static final Target REVIEW_ORDER_BTN = Target.the("review order btn")
        .located(By.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));

    // PLACE ORDER PAGE
    public static final Target PAYMENT_END_BTN = Target.the("payment end btn")
            .located(By.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));

    // Checkout complete page
    public static final Target CHECKOUT_COMPLETE_TITLE = Target.the("checkout complete title")
        .located(By.id("com.saucelabs.mydemoapp.android:id/completeTV"));
}







