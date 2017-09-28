package Raiffeisen;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^Стороны треугольника равны (\\d+), (\\d+), (\\d+)$")
    public void sides(int first, int snd, int trd ) throws Throwable {
        if (first==90 || snd == 90 || trd == 90){
            System.out.println("Прямоугольный треугольник");
        }

    }
}
