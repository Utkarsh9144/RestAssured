package assignment1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="F:/1.Workspaces/Java workspace/RestAssuredAssignments03/src/test/resources/features/assignment1.feature",
				glue={"assignment1"},
				tags="@tag4"
				
		)
public class ResponseRunner {

}
