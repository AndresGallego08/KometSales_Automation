package com.swaglabs.certification.website.stepdefinitions;

import com.swaglabs.certification.website.exceptions.CompraFallidaException;
import com.swaglabs.certification.website.models.TestData;
import com.swaglabs.certification.website.questions.ElMensaje;
import com.swaglabs.certification.website.tasks.Comprar;
import com.swaglabs.certification.website.tasks.IngresaLas;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.swaglabs.certification.website.utils.UrlCertificacion.SWAGLABS_CERTIFICATION_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CompletarCompraStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void config() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new Cast());
        theActorCalled("User");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que el usuario inicia sesion en swag labs$")
    public void queElUsuarioIniciaSesionEnSwagLabs(List<TestData> testDataList) {
        theActorInTheSpotlight().wasAbleTo(Open.url(SWAGLABS_CERTIFICATION_URL),
                IngresaLas.credenciales(testDataList.get(0)));
    }

    @Cuando("^realiza la compra de productos$")
    public void realizaLaCompraDeProductos(List<TestData> testDataList) {
        theActorInTheSpotlight().attemptsTo(Comprar.productos(testDataList.get(0)));
    }

    @Entonces("^puede ver el mensaje (.*)$")
    public void puedeVerElMensajeDeConfirmacionDeLaCompra(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.deConfirmacion(), Matchers.containsString(mensaje)).
                orComplainWith(CompraFallidaException.class, "No se pudo completar la compra"));
    }
}
