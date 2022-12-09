package com.swaglabs.certification.website.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage extends PageObject {

    public static final Target BTN_CHECKOUT = Target.the("Boton verificar productos").
            locatedBy("//button[@id='checkout']");

}
