package com.swaglabs.certification.website.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static com.swaglabs.certification.website.utils.ManualTest.validate;

public class CasosDePruebaStepDefinitions {
    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void manualTest(String step) {
        validate(step, scenario.getName());
    }
}
