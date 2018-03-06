package fr.frg.tunisien.bdd.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.frg.tunisien.RegExMatcher;

public class TunisienSteps {

	private RegExMatcher matcher;

	@Before
	public void setUp() {
		matcher = new RegExMatcher();
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

		RegExMatcher matcherReverse = new RegExMatcher();
		matcherReverse.setA(matcher.getB());
		matcherReverse.setB(matcher.getA());
		assertTrue(matcherReverse.match());
	}

}
