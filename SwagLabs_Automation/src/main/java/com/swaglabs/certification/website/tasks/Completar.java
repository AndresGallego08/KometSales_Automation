package com.swaglabs.certification.website.tasks;

import com.swaglabs.certification.website.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.swaglabs.certification.website.userinterfaces.CarritoPage.BTN_CHECKOUT;
import static com.swaglabs.certification.website.userinterfaces.InformacionEnvioPage.*;
import static com.swaglabs.certification.website.userinterfaces.ListaDeProductosPage.BTN_CARRITO;
import static com.swaglabs.certification.website.userinterfaces.ListaDeProductosPage.LBL_PRODUCTO;

public class Completar implements Task {

    private TestData testData;

    public Completar(TestData testData) {
        this.testData = testData;
    }

    public static Completar laCompra(TestData testData) {

        return Tasks.instrumented(Completar.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CARRITO),
                WaitUntil.the(LBL_PRODUCTO.of(testData.getProducto1()),
                        WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds(),
                WaitUntil.the(LBL_PRODUCTO.of(testData.getProducto2()),
                        WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds(),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(testData.getFirstName()).into(LBL_FIRST_NAME),
                Enter.theValue(testData.getLastName()).into(LBL_LAST_NAME),
                Enter.theValue(testData.getCodigoPostal()).into(LBL_CODIGO_POSTAL),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );
    }
}
