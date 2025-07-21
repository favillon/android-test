package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import testing.ui.CartPage;

public class TitleProductCart implements Question<Boolean> {
    private final String message;
    private final Target element;

    public TitleProductCart(String message, Target element) {
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

    public static TitleProductCart viewTitleProductCart(String message) {
        return new TitleProductCart(message, CartPage.TITLE_PRODUCT_CART);
    }
}
