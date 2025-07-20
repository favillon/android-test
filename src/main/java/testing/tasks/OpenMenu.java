package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenMenu implements Task {

    public static OpenMenu hamburger() {
        return instrumented(OpenMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.HAMBURGER_MENU).
                afterWaitingUntilEnabled()
        );
    }
}
