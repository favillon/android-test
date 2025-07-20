package testing.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.HomeTitle;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class HomePageDefinitions {

    @Given("que {string} abre la aplicación")
    public void userOpensTheApp(String actorName) {
        OnStage.theActorCalled(actorName);
    }

    @And("el usuario deberia ver el titulo {string}")
    public void elUsuarioDeberiaVerElTitulo(String title) {
        OnStage.theActorInTheSpotlight().should(seeThat(HomeTitle.is(), equalTo(title)));
    }
}
