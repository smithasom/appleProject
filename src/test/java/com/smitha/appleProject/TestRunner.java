package com.smitha.appleProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(
//features = "src/test/java"
//,glue= {"seleniumgluecode"}
//)
@CucumberOptions(features="src/test/java/buyIpad.feature", format={"pretty","html:target/Reports"},tags = {"@buyipad"} )
public class TestRunner {

}

