package com.swaglabs.certification.website.tasks;

import com.swaglabs.certification.website.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Comprar implements Task {

    private TestData testData;

    public Comprar(TestData testData) {
        this.testData = testData;
    }

    public static Comprar productos(TestData testData) {

        return Tasks.instrumented(Comprar.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AgregarProductos.alCarrito(testData),
                Completar.laCompra(testData)
        );
    }
}
