package org.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by lam on 13/07/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:build/reports/cucumber"},
        glue={ "cucumber.api.spring","classpath:org.test"},
        monochrome = true )
public class RunCukeTests {

}
