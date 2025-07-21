package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOnProdcutElement implements Task {
    private final Target element;

    public ClickOnProdcutElement(Target element) {
        this.element = element;
    }

    public static ClickOnProdcutElement on(Target element) {
        return new ClickOnProdcutElement(element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(element));
    }
}