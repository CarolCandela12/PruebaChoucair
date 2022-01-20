package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;

public class HomeDefinitions {
	
	@Steps
	private HomeSteps objectHomeSteps;
	
	@Given("^Ingreso a la pagina de Choucair$")
	public void goToChoucairWebPage() {
		objectHomeSteps.openBrowser();
	}
	
	@And("^Ingreso al portal de empleos$")
	public void goJobMenu() {
		objectHomeSteps.selectJobMenu();
		objectHomeSteps.selectJobsPortal();
	}

}
