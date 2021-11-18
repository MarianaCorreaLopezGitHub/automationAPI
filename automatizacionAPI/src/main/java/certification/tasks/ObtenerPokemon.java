package certification.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static certification.utils.Constantes.MICRO;

public class ObtenerPokemon implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Get.resource(MICRO).with(request-> request.param("page","2")

        );
        System.out.println("paso");
        System.out.println(SerenityRest.lastResponse().statusCode());
    }
    public static ObtenerPokemon conSusCaracteristicas(){
        return Tasks.instrumented(ObtenerPokemon.class);
    }
}
