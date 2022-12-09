package com.swaglabs.certification.website.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionEnvioPage extends PageObject {

    public static final Target LBL_FIRST_NAME = Target.the("Campo nombre").
            locatedBy("//input[@id='first-name']");

    public static final Target LBL_LAST_NAME = Target.the("Campo apellido").
            locatedBy("//input[@id='last-name']");

    public static final Target LBL_CODIGO_POSTAL = Target.the("Campo codigo postal").
            locatedBy("//input[@id='postal-code']");

    public static final Target BTN_CONTINUE = Target.the("Boton continuar compra").
            locatedBy("//input[@id='continue']");

    public static final Target BTN_FINISH = Target.the("Boton finalizar compra").
            locatedBy("//button[@id='finish']");

    public static final Target LBL_SUCCESSFUL_PURCHASE= Target.the("Mensaje de compra exitosa").
            locatedBy("//div[contains(text(),'Your order has been dispatched')]");
}
