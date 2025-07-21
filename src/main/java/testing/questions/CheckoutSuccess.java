package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import testing.ui.CartPage;
import testing.ui.CheckoutPage;

public class CheckoutSuccess implements Question<Boolean> {
    private final String message;
    private final Target element;

    public CheckoutSuccess(String message, Target element) {
        this.message = message;
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(element).isDisplayed(),
                Ensure.that(element).text().contains(message)
        );
        return true;
    }

    public static CheckoutSuccess viewTitleCheckout(String message) {
        return new CheckoutSuccess(message, CheckoutPage.CHECKOUT_COMPLETE_TITLE);
    }
}
