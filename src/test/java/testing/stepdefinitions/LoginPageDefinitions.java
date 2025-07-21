package testing.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.questions.*;
import testing.tasks.*;
import testing.ui.HomePage;
import testing.ui.ProductPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginPageDefinitions {

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

    @When("el usuario autenticado con user {string} y password {string} agrega un producto al carrito")
    public void elUsuarioAutenticadoConUserYPasswordAgregaUnProductoAlCarrito(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(username, password));
        //hacer click en el elemento home para seleccionar el producto
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnHomeElement.on(HomePage.SELECTOR_PRODUCT));
        // hacer click en el boton de agregar al carrito
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnProdcutElement.on(ProductPage.ADD_TO_CARD_BTN));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnProdcutElement.on(ProductPage.VIEW_CARD_BTN));
    }

    @Then("el usuario deberia ver el titulo {string} y el nombre  {string} del producto en el carrito")
    public void elUsuarioDeberiaVerElTituloYElNombreDelProductoEnElCarrito(String titlePage, String titleProdcut) {
        //verificar que el producto se agrego al carrito
        OnStage.theActorInTheSpotlight().should(seeThat(TitleCart.viewTitleCart(titlePage)));
        // verificar el nombre del producto
        OnStage.theActorInTheSpotlight().should(seeThat(TitleProductCart.viewTitleProductCart(titleProdcut)));
    }
}
