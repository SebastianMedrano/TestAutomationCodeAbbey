package FCR_Automation.task;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import FCR_Automation.userinterface.googleLoguin;
import FCR_Automation.userinterface.mainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class loginWithGoogle implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(mainPage.LOGIN_GOOGLE_BUTTON));
		actor.attemptsTo(Enter.theValue("fcrprueba123").into(googleLoguin.MAIL_LOGUIN));
		actor.attemptsTo(Click.on(googleLoguin.BUTTON_NEXT));
		actor.attemptsTo(Enter.theValue("l-123456").into(googleLoguin.PASS_LOGUIN));
		actor.attemptsTo(Click.on(googleLoguin.BUTTON_LOGUIN));
		
		
	}

	public static loginWithGoogle go() {
		return instrumented(loginWithGoogle.class);
	}
	
}
