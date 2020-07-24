package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue={"stepDefinitions"},
                 tags= {"@Interview"},
                 monochrome=true,
	 plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/reportfolder/reportfile.html"})

public class WebstaurantstoreRunners {

}
