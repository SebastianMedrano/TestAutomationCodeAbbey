package FCR_Automation.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class solutionPage {
	public static final Target TEXT_SOLUTION = Target.the("Text area to paste solution")
			.locatedBy("//*[@id=\"ace-editor\"]/textarea");
	public static final Target BUTTON_JAVA = Target.the("Butto to compile java").located(By.id("run-python3"));
	public static final Target BUTTON_SUMMIT=Target.the("Butto to summit problem").locatedBy("//*[@id=\"task-attempt\"]/div[7]/div[1]/input");
	public static final Target ANSWER = Target.the("Answer ").locatedBy("//*[@id=\"task-attempt\"]/div[3]/span[1]");
	public static final Target ANSWER_TEXT = Target.the("Answer ").locatedBy("//*[@id=\"answer\"]");
}
