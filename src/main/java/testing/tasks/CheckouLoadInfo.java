package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.CheckoutPage;
import testing.ui.HomePage;
import testing.ui.LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckouLoadInfo implements Task {

    private final String name;
    private final String address;
    private final String city;
    private final String zipCode;
    private final String country;
    private final String numberCard;
    private final String expirationDate;
    private final String code;

    public CheckouLoadInfo(String name, String address, String city, String zipCode, String country, String numberCard, String expirationDate, String code) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.numberCard = numberCard;
        this.expirationDate = expirationDate;
        this.code = code;
    }

    public static CheckouLoadInfo withData(String name, String address, String city, String zipCode, String country, String numberCard, String expirationDate, String code) {
        return instrumented(CheckouLoadInfo.class, name, address, city, zipCode, country, numberCard, expirationDate, code);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Enter.theValue(name).into(CheckoutPage.FULL_NAME_INPUT),
            Enter.theValue(address).into(CheckoutPage.ADDRESS_INPUT),
            Enter.theValue(city).into(CheckoutPage.CITY_INPUT),
            Enter.theValue(country).into(CheckoutPage.COUNTRY_INPUT),
            Enter.theValue(zipCode).into(CheckoutPage.ZIP_CODE_INPUT)
        );

        actor.attemptsTo(
            Click.on(CheckoutPage.PAYMENT_BTN)
        );

        actor.attemptsTo(
            Enter.theValue(name).into(CheckoutPage.FULL_PAY_NAME_INPUT),
            Enter.theValue(numberCard).into(CheckoutPage.CARD_NUMBER_INPUT),
            Enter.theValue(expirationDate).into(CheckoutPage.EXPIRATION_DATE_INPUT),
            Enter.theValue(code).into(CheckoutPage.CODE_INPUT)
        );

        actor.attemptsTo(
                Click.on(CheckoutPage.REVIEW_ORDER_BTN)
        );

        actor.attemptsTo(
                Click.on(CheckoutPage.PAYMENT_END_BTN)
        );
    }
}