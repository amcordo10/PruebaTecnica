package co.com.pruebaTecnica.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= {"src/test/resources/features/shopping.feature"},
        glue="co.com.pruebaTecnica.stepdefinitions",
        plugin = {"pretty"},
        snippets = CAMELCASE,
        tags = "",
        dryRun = false
)
public class StaysRunner {


}
