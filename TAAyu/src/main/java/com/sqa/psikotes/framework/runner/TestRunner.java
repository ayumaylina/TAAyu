package com.sqa.psikotes.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
			"src/main/resources/features/176MPOPenMPValid.feature",
			"src/main/resources/features/179MPSearchMPValid.feature",
			"src/main/resources/features/182MPAddMPValid.feature",
			"src/main/resources/features/185MPShow10DataValid.feature",
			"src/main/resources/features/188MPShow25DataValid.feature",
			"src/main/resources/features/191MPShow50DataValid.feature",
			"src/main/resources/features/197MPShow100DataValid.feature",
			"src/main/resources/features/200MPAddSoalPilihanGandaValid.feature",
			"src/main/resources/features/203MPAddSoalEsaiFreeTextValid.feature",
			"src/main/resources/features/206MPAddSoalEnumValid.feature",
			"src/main/resources/features/209MPAddSoalEsaiLengthValid.feature",
			"src/main/resources/features/194MPDeleteModulValid.feature"},
//			"src/main/resources/features/227MPEditModulValid.feature"},
glue = "com.sqa.psikotes.framework.runner",
monochrome=true,
plugin = {"pretty","html:target/psikotes/htmlreport/PSIKOTESRunner.html",
		"json:target/psikotes/jsonreport/PSIKOTESRunner.json",
		"junit:target/psikotes/junitreport/PSIKOTESRunner.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
