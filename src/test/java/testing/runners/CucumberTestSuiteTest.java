package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        features = "src/test/resources/features/search/LoginPage.feature",
        glue = "testing/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuiteTest {}



