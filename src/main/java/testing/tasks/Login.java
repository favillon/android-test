package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.HomePage;
import testing.ui.LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login withCredentials(String username, String password) {
        return instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.HAMBURGER_MENU)
        );

        actor.attemptsTo(
                Click.on(HomePage.DASHBOARD_TEXT)
        );

        actor.attemptsTo(
            Enter.theValue(username).into(LoginPageElements.USERNAME_INPUT),
            Enter.theValue(password).into(LoginPageElements.PASSWORD_INPUT)
        );
        actor.attemptsTo(
            Click.on(LoginPageElements.LOGIN_BUTTON)
        );
    }
}