package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/CreateContact.feature",
				glue="implementationForCreateContact",
				monochrome=true,
				publish=true)

public class RunnerClassForCreateContact extends AbstractTestNGCucumberTests{

}
