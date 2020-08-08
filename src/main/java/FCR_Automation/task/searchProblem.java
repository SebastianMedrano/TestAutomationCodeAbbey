package FCR_Automation.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import FCR_Automation.interactions.foundProblemById;
import FCR_Automation.userinterface.mainPage;
import FCR_Automation.userinterface.problemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class searchProblem implements Performable {
private int idProblem;

public searchProblem(int id) {
	this.idProblem=id;
}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(mainPage.PROBLEM_BUTTON, WebElementStateMatchers.isVisible()));
		actor.attemptsTo(Click.on(mainPage.PROBLEM_BUTTON));
		actor.attemptsTo(SelectFromOptions.byValue("id1").from(problemPage.FILTER_SELECT));
		actor.attemptsTo(foundProblemById.found(idProblem));	

	}

	
	
	public static searchProblem search(int id) {
		return instrumented(searchProblem.class,id);
	}
}
