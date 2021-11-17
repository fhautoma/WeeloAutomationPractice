package co.com.weelo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        glue = "co.com.weelo.stepdefinitions",
        features = "src/test/resources/features/weelo_automation_practice.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)


public class WeeloRunner {
}
