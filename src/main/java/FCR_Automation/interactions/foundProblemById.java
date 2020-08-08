package FCR_Automation.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class foundProblemById implements Task {
	private int idNumber;

	public foundProblemById(int id) {
		this.idNumber = id;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(tablesearch(idNumber, BrowseTheWeb.as(actor).getDriver())));

	}

	public static foundProblemById found(int id) {
		return instrumented(foundProblemById.class, id);
	}

	public Target tablesearch(Integer value, WebDriver driver) {
		int index = 2;

		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/table[2]"));
		WebElement td;
		List<WebElement> tr = element.findElements(By.tagName("tr"));
		for (int i = 1; i < tr.size(); i++) {
			td = tr.get(i).findElement(By.tagName("td"));
			if (td.getAttribute("innerText").equals(value.toString())) {
				index = i+1;
			}
		}
		return Target.the("Problem to be resolv").locatedBy("/html/body/div[1]/table[2]/tbody/tr[" + index + "]/td[2]/a");
	}

}
