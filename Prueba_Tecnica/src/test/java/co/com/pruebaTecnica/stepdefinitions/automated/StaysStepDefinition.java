package co.com.pruebaTecnica.stepdefinitions.automated;

import co.com.pruebaTecnica.model.Data;
import co.com.pruebaTecnica.taks.SearchTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.pruebaTecnica.utils.Urls.PRUEBA_PAGE;
public class StaysStepDefinition {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("tester");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(PRUEBA_PAGE.getUrl()));

    }

   /* @Given("^What (.*) enters the amazon page$")
    public void whatUserEntersTheAmazonPage(String user) {
        OnStage.theActorCalled(user).wasAbleTo(Open.url(PRUEBA_PAGE));

    }*/

    @When("^the use puts the article$")
    public void theUsePutsTheArticle(DataTable data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTask.enAmazon(new Data(data)));


    }


}
