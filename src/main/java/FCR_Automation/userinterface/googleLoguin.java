package FCR_Automation.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class googleLoguin {
public static final Target MAIL_LOGUIN= Target.the("loguin mail text").located(By.id("identifierId"));
public static final Target BUTTON_NEXT= Target.the("Button next").locatedBy("//*[@id=\"identifierNext\"]/div/button");
public static final Target PASS_LOGUIN= Target.the("loguin password").locatedBy("//*[@id=\"password\"]/div[1]/div/div[1]/input");
public static final Target BUTTON_LOGUIN= Target.the("Button loguin").locatedBy("//*[@id=\"passwordNext\"]/div/button/div[2]");


}
