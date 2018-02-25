package fr.frg.tunisien.bdd.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.frg.tunisien.TunisienMatcher;

public class TunisienSteps {

	private TunisienMatcher matcher;

	@Before
	public void setUp() {
		matcher = new TunisienMatcher();
	}

	@Given("^input \"([^\"]*)\"$")
	public void input(String a) throws Throwable {
		matcher.setA(a);
	}

	@When("^compare to \"([^\"]*)\"$")
	public void compare_to(String b) throws Throwable {
		matcher.setB(b);
	}

	@Then("^MATCH$")
	public void match() throws Throwable {
		assertTrue(matcher.match());

		TunisienMatcher matcherReverse = new TunisienMatcher();
		matcherReverse.setA(matcher.getB());
		matcherReverse.setB(matcher.getA());
		assertTrue(matcherReverse.match());
	}

}
