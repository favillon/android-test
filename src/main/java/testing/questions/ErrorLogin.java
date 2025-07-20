package testing.questions;

import net.serenitybdd.screenplay  .Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import testing.ui.LoginPageElements;

public class ErrorLogin implements Question<Boolean> {
    private final String message;
    private final Target element;

    public ErrorLogin(String message, Target element) {
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

    public static ErrorLogin porUsuarioBloqueado(String message) {
        return new ErrorLogin(message, LoginPageElements.TEXT_USER_LOCKED);
    }

    /*public static ErrorLogin porNombreDeUsuarioFaltante(String message) {
        return new ErrorLogin(message, LoginPage.MISSING_USERNAME);
    }

    public static ErrorLogin porFaltaDeContrasena(String expectedErrorMessage) {
        return new ErrorLogin(expectedErrorMessage, LoginPage.MISSING_PASSWORD);
    }*/
}
