package co.com.pruebaTecnica.taks;

import co.com.pruebaTecnica.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pruebaTecnica.userinterface.SearchUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SearchTask implements Task {

    private Data data;

    public SearchTask(Data data) {
        this.data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(SEARCH_INPUT));

        actor.attemptsTo(Enter.theValue(data.getSearch()).into(SEARCH_INPUT2));
    }

    public static SearchTask enAmazon(Data data)

    {
        return instrumented(SearchTask.class, data);
    }
}

