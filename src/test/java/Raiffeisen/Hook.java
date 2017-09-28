package Raiffeisen;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.junit.Before;

public class Hook {
    @Before
    public void checkName (Scenario scenario){
        if ( scenario.getSourceTagNames().equals("Bella")){
            System.out.println(scenario.getSourceTagNames());
        }


        }
    @After
    public void testFailed (Scenario scenario){
        if(scenario.isFailed()){
        System.out.println(scenario.getName());
    }}
}
