package certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\pokemon_get.feature",
        glue = "certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class PokemonGet {
}
