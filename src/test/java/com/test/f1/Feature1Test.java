package com.test.f1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/test/feature1.feature"},
		glue = "com.test.f1",
		monochrome = true,
		plugin = {"pretty"},
		dryRun = false)
public class Feature1Test {

}
