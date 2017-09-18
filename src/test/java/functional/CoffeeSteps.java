package functional;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

@Component
public class CoffeeSteps extends BddGlue {

	@Inject
	private CoffeeMachine coffeeMachine;

	@Given("^there are (\\d+) coffees left in the machine$")
	public void there_are_coffees_left_in_the_machine(int arg1) throws Throwable {
		
//		coffeeMachine.

		int arg2 = coffeeMachine.coffeesLeft();
		assertEquals(arg1, arg2);
	}

	@Given("^I have deposited (\\d+)\\$$")
	public void i_have_deposited_$(int arg1) throws Throwable {

		coffeeMachine.deposit(arg1);

	}

	@When("^I press the coffee button$")
	public void i_press_the_coffee_button() throws Throwable {

		coffeeMachine.pressCoffeeButton();

	}

	@Then("^I should be served a coffee$")
	public void i_should_be_served_a_coffee() throws Throwable {

		assertEquals(coffeeMachine.isCoffeeServed(), true);

	}

}
