package FCR_Automation.questions;

import FCR_Automation.userinterface.attemptResponse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class questionCorrect implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return  attemptResponse.RESPONSE.resolveFor(actor).getText();
	}
	
	public static Question<String> value() { return new questionCorrect(); }

}
