package certification.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static certification.utils.Constantes.URL;

public class PokemonGetStepDefinitions {
    @Given("^El usuario utiliza el microservicio$")
    public void elUsuarioUtilizaElMicroservicio() {
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(URL)));
        OnStage.theActorCalled("ACTOR");
    }


    @When("^El usuario trae la informacion del pokemon$")
    public void elUsuarioTraeLaInformacionDelPokemon() {

    }

    @Then("^El usuario vera el codigo de respuesta (.*)$")
    public void elUsuarioVeraElCodigoDeRespuesta(String arg1) {

    }
}
