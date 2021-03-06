package br.com.cedumoret.rest.runner;

import br.com.cedumoret.rest.core.utils.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/main/resources/features"},
        glue = {"br/com/cedumoret/rest/steps", "br/com/cedumoret/rest/core/hooks"},
        tags = {"@regression"})

public class RunTest {
    @AfterClass
    public static void gerarRelatorio(){
        Report.gerarRelarotioClueCumber();
    }
}