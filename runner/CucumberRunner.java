package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature","src/test/java/features/DeleteLead.feature","src/test/java/features/DuplicateLead.feature","src/test/java/features/MergeLead.feature","src/test/java/features/EditLead.feature"},
                  glue="steps",
                  monochrome=true,
                  publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests {

	}
