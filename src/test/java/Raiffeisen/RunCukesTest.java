package Raiffeisen;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
features="src/main/java/Raiffeisen/Belly.java")
public class RunCukesTest {

}
