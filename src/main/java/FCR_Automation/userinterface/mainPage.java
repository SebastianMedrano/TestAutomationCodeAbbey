package FCR_Automation.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class mainPage {
	public static final Target LOGIN_GOOGLE_BUTTON = Target.the("Login button with gmail").locatedBy("/html/body/div[1]/div/div[2]/div[1]/div/a[3]");
	public static final Target PROBLEM_BUTTON = Target.the("Problem button").locatedBy("/html/body/nav/div/ul/li[2]/a");
	

}
