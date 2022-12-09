package com.swaglabs.certification.website.tasks;

import com.swaglabs.certification.website.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.certification.website.userinterfaces.ListaDeProductosPage.LBL_PAGINA_PRODUCTOS;
import static com.swaglabs.certification.website.userinterfaces.LoginPage.*;


public class IngresaLas implements Task {

    private TestData testData;

    public IngresaLas(TestData testData) {
        this.testData = testData;
    }

    public static IngresaLas credenciales(TestData testData) {
        return Tasks.instrumented(IngresaLas.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.getUserName()).into(INPUT_USUARIO),
                Enter.theValue(testData.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN),
                WaitUntil.the(LBL_PAGINA_PRODUCTOS,
                        WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
