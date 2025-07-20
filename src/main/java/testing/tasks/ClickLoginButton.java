package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickLoginButton implements Task {

    public static ClickLoginButton a() {
        return instrumented(ClickLoginButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPageElements.LOGIN_BUTTON)
        );
    }
}
