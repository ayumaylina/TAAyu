package cucumber.framework.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {""},
glue = "cucumber.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/nopc/htmlreport/TestRunner.html",
		"json:target/nopc/jsonreport/TestRunner.json",
		"junit:target/nopc/junitreport/TestRunner.xml"})
public class TestRunner extends AbstractTestNGCucumberTests{}
