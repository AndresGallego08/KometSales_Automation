package com.swaglabs.certification.website.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/casos_de_prueba.feature",
        glue = "com.swaglabs.certification.website.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CasosDePruebaRunner {
}
