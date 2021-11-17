package co.com.weelo.stepdefinitions;

import co.com.weelo.exceptions.GeneralDemoException;
import co.com.weelo.questions.ValidateTextField;
import co.com.weelo.tasks.AgregarVestidoACarrito;
import co.com.weelo.tasks.BuscarVestido;
import co.com.weelo.userinterfaces.EveningDresses;
import co.com.weelo.userinterfaces.HomePageYourLogo;
import co.com.weelo.utils.Constants;
import co.com.weelo.utils.ErrorMessage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
//import io.github.bonigarcia.wdm.WebDriverManager;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class WeeloAutomationPracticeStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("^Necesito un vestido$")
    public void necesitoUnVestido() {
        theActorCalled(Constants.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePageYourLogo()));
        theActorInTheSpotlight().attemptsTo(BuscarVestido.buscarVestido());

    }


    @When("^El tipo de vestido es nocturno$")
    public void elTipoDeVestidoEsNocturno() {
        theActorInTheSpotlight().attemptsTo(AgregarVestidoACarrito.agregar());
    }

    @Then("^Valido que el vestido sea agregado al carrito de compras$")
    public void validoQueElVestidoSeaAgregadoAlCarritoDeCompras() {
        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(EveningDresses.QUANTITY),
                equalTo(Constants.QUANTITY_ONE)).orComplainWith(GeneralDemoException.class,
                ErrorMessage.MSG_ERROR_QUANTITY));

    }
}