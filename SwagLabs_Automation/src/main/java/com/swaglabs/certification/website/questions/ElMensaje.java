package com.swaglabs.certification.website.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.swaglabs.certification.website.userinterfaces.InformacionEnvioPage.LBL_SUCCESSFUL_PURCHASE;

public class ElMensaje implements Question<String> {

    public static ElMensaje deConfirmacion() {
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_SUCCESSFUL_PURCHASE).viewedBy(actor).asString();
    }
}
