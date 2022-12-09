package com.swaglabs.certification.website.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Campo nombre de usuario").
            locatedBy("//input[@id='user-name']");

    public static final Target INPUT_PASSWORD = Target.the("Campo clave de usuario").
            locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target.the("Boton iniciar sesion").
            locatedBy("//input[@id='login-button']");

}
