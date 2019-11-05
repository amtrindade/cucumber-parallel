package com.test.f2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/test/feature2.feature"},
		glue = "com.test.f2",
		monochrome = true,
		plugin = {"pretty"},
		dryRun = false)
public class Feature2Test {

}
