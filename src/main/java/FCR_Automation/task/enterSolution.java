package FCR_Automation.task;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import FCR_Automation.userinterface.solutionPage;
import FCR_Automation.utils.problemasResuletos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class enterSolution implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Scroll.to(solutionPage.TEXT_SOLUTION));
		actor.attemptsTo(Enter.keyValues(problemasResuletos.PROBLEMA_54).into(solutionPage.TEXT_SOLUTION));
		actor.attemptsTo(Click.on(solutionPage.BUTTON_JAVA));
		actor.attemptsTo(Scroll.to(solutionPage.ANSWER));
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(solutionPage.BUTTON_SUMMIT));
		
	}

	
	public static enterSolution txt() {
		return instrumented(enterSolution.class);
	}
	
}
