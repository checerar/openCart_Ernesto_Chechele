package Run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        plugin = {
                "pretty",
                "json:target/surefire-reports/cucumber.json",
                "html:target/cucumber-html-report.html",
        },
        glue = {
                "/StepDefs",
                "/Support"
        },
        features = {
                "src/test/resources"
        }
)
public class RunTest {

}
/*package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.github.artsok.RepeatedIfExceptionsTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MyTest1.class,
        MyTest2.class,
        MyTest3.class
})
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/test/resources",
        glue = "StepDefs"
)
public class TestSuite {
}
*/