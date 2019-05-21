package br.com.munif.pocs.matera.cucumberposit.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" })
public class RunCucumberTest {
}

/*
 * mvn clean install-DCucumberOptions="--glue  br.com.munif.pocs.matera.cucumberposit.test --plugin pretty  src/test/cucumber"
 */