package FCR_Automation.stepdefinitions;

import org.hamcrest.CoreMatchers;
import org.hamcrest.collection.IsArrayContainingInOrder;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import FCR_Automation.questions.questionCorrect;
import FCR_Automation.task.enterSolution;
import FCR_Automation.task.loginWithGoogle;
import FCR_Automation.task.searchProblem;
import FCR_Automation.userinterface.attemptResponse;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class codeAbbeyStepDefinition {
	
	@Managed(driver = "chrome")
	public   WebDriver hisbrowser;
	private Actor Sebas = Actor.named("Sebas");
	
	@Before 
	public void setUp() {
		Sebas.can(BrowseTheWeb.with(hisbrowser));
		Sebas.attemptsTo(Open.url("https://www.codeabbey.com/"));
		hisbrowser.manage().window().maximize();

	}
	
	@Given("^Sebastian se loguea en CodeAbbey$")
	public void sebastianSeLogueaEnCodeAbbey() throws Exception {
	    Sebas.wasAbleTo(loginWithGoogle.go());
	   
	}
	
	@When("^Sebastian Compite resolviendo el caso (\\d+)$")
	public void sebastianCompiteResolviendoElCasoCuatro(int arg1) throws Exception {
		 Sebas.attemptsTo(searchProblem.search(arg1));
		 Sebas.attemptsTo(enterSolution.txt());
		 
	}

	@Then("^Sebastian confirma que lo resolvio correctamente$")
	public void sebastianConfirmaQueLoResolvioCorrectamente() throws Exception {
		Sebas.should(seeThat("Sebastian deberia ver", questionCorrect.value(), CoreMatchers.equalTo("Correct")));
	}

}
