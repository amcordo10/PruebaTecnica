package co.com.pruebaTecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchUser {

    public static final Target SEARCH_INPUT = Target.the("input to search what you want")
            .located(By.id("twotabsearchtextbox"));

    public static final Target SEARCH_INPUT2 = Target.the("input to search what you want")
            .locatedBy("//input[@id='twotabsearchtextbox']");
}

