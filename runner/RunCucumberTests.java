package runner;

import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectSpecificMethods;

@CucumberOptions(features = "src/test/java/features",
                 glue = "stepDef",
                 monochrome = true,
                 publish = true)
public class RunCucumberTests extends ProjectSpecificMethods {
	
	
	

}
