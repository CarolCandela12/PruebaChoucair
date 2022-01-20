package definitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.PortalJobsSteps;

public class PortalJobsDefinitions {
	
	@Steps
	private PortalJobsSteps portalJobsSteps;

	@When("^Registro un usuario con los datos \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void RegisterUserWithFollowingData(String registerCountry, String countryBirth, String birthDate, String educationLevel, String placeResidence) {
	   portalJobsSteps.selectRegisterNewUser();
	   portalJobsSteps.selectRegisterCountry(registerCountry);
	   portalJobsSteps.howDoYouWantRegister();
	   portalJobsSteps.agreeTerms();
	   portalJobsSteps.fillUserData(countryBirth, birthDate, educationLevel);
	}
	
	@Given("^Valido el registro exitoso del usuario$")
	public void verifyUserRegister() {
		// En este paso se pretende validar la creacion del usuario una vez se diligencien todos 
		// los datos requeridos, por temas de tiempo, no se alcanza a desarrollar esta validacion.
	}
}


