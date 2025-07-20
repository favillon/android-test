package testing.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.questions.ErrorLogin;
import testing.questions.HomeTitle;
import testing.questions.LogoutOption;
import testing.tasks.ClickLoginButton;
import testing.tasks.Login;
import testing.tasks.OpenMenu;
import testing.tasks.SelectLoginOption;
import testing.ui.HomePage;
import testing.ui.LoginPageElements;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginPageDefinitions {

//
//    @When("el usuario abre el menu")
//    public void elUsuarioAbreElMenu() {
//        OnStage.theActorInTheSpotlight().attemptsTo(OpenMenu.hamburger());
//    }
//
//    @When("el usuario selecciona la opcion de login")
//    public void elUsuarioSeleccionaLaOpcionDeLogin() {
//        OnStage.theActorInTheSpotlight().attemptsTo(SelectLoginOption.fromMenu());
//    }
//
//    @Then("el usuario deberia ver el titulo {string}")
//    public void elUsuarioDeberiaVerElTitulo(String title) {
//        OnStage.theActorInTheSpotlight().should(seeThat(HomeTitle.is(), equalTo(title)));
//    }

//    @When("el usuario ingresa con  el username {string} y  passwrod {string}")
//    public void elUsuarioIngresaElUsuarioYLaContrasena(String username, String password) {
//        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(username, password));
//        OnStage.theActorInTheSpotlight().attemptsTo(ClickLoginButton.a());
//    }

//    @When("el usuario oprime el boton de login")
//    public void elUsuarioOprimeElBotonDeLogin() {
//        OnStage.theActorInTheSpotlight().attemptsTo(ClickLoginButton.a());
//    }
//
//    @Then("el usuario deberia ver la opcion de {string}")
//    public void elUsuarioDeberiaVerLaOpcionDe(String option) {
//        System.out.println(option);
//        OnStage.theActorInTheSpotlight().should(seeThat(LogoutOption.is(), equalTo(option)));
//    }



    @When("el usuario ingresa con  el username {string} y  password {string}")
    public void elUsuarioIngresaConElUsernameYPassword(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(username, password));
    }

    @Then("el usuario deberia ver la opcion de {string} en el menu")
    public void elUsuarioDeberiaVerLaOpcionDeEnElMenu(String text) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenMenu.hamburger());
        OnStage.theActorInTheSpotlight().should(seeThat(
                Visibility.of(HomePage.DASHBOARD_TEXT_LOGOUT)
        ));
    }

    @Then("el usuario  vera el mensaje {string}")
    public void elUsuarioVeraElMesaje(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ErrorLogin.porUsuarioBloqueado(message)));
    }
}
