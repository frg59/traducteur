package fr.frg.tunisen.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "fr.frg.tunisien.bdd.steps",
        features = "classpath:cucumber/tunisien.feature"
)
public class RunTunisienTest {
}
