package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOnHomeElement implements Task {
    private final Target element;

    public ClickOnHomeElement(Target element) {
        this.element = element;
    }

    public static ClickOnHomeElement on(Target element) {
        return new ClickOnHomeElement(element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(element));
    }
}