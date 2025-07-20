package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import testing.ui.HomePage;
import testing.ui.LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLoginOption implements Task {

    public static SelectLoginOption fromMenu() {
        return instrumented(SelectLoginOption.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.DASHBOARD_TEXT)
        );
    }
}
