package com.swaglabs.certification.website.tasks;

import com.swaglabs.certification.website.models.TestData;
import com.swaglabs.certification.website.utils.Convertir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.swaglabs.certification.website.userinterfaces.ListaDeProductosPage.BTN_AGREGAR_AL_CARRITO;
import static com.swaglabs.certification.website.userinterfaces.ListaDeProductosPage.LBL_PRODUCTO;


public class AgregarProductos implements Task {

    private TestData testData;

    public AgregarProductos(TestData testData) {
        this.testData = testData;
    }

    public static AgregarProductos alCarrito(TestData testData) {
        return Tasks.instrumented(AgregarProductos.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_AL_CARRITO.of(Convertir.producto(testData.getProducto1()))),
                Click.on(LBL_PRODUCTO.of(testData.getProducto2())),
                Click.on(BTN_AGREGAR_AL_CARRITO.of(Convertir.producto(testData.getProducto2())))
        );
    }
}
