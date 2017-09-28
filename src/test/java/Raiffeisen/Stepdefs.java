package Raiffeisen;

import cucumber.api.PendingException;
import cucumber.api.Transpose;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

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

    @Given("^User table:$")
    public void userTable(@Transpose List<Whereabouts> whereabouts) throws Throwable {
        for (Whereabouts whereabout : whereabouts) {
            System.out.println(whereabout.name);
            System.out.println(whereabout.surname);
        }
    }
}
