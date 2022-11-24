package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;







@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\test\\resources\\features\\login1.feature",
glue= {"testdefinition"},
monochrorme=true,
plugin= {"html:target/htmlreports/report.html",
		"json:target/jsonreports/reports.json ",
		"junit:target/junitreports/reports.xml"})

public class testrunner1 {

}

