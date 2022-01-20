package steps;

import com.github.javafaker.Faker;

import net.thucydides.core.annotations.Step;
import pageObjects.PortalJobsPageObjects;

public class PortalJobsSteps {

	private PortalJobsPageObjects portalJobsPageObjects;
	
	@Step
	public void selectRegisterNewUser() {		
		portalJobsPageObjects.clickRegisterButton();
	}
	
	@Step
	public void selectRegisterCountry(String registerCountry) {
		portalJobsPageObjects.selectRegisterCountry(registerCountry);
		portalJobsPageObjects.clickBtnContinue();
	}
	
	//
    @Step
    public void howDoYouWantRegister() {
    	portalJobsPageObjects.clickDate();
    }
     @Step
     public void agreeTerms() {
    	 portalJobsPageObjects.clickAgree();
    	 portalJobsPageObjects.clickBtnContinue();
     }
     
     @Step
     public void fillUserData(String countryBirth, String birthDate, String educationLevel) {
    	 String email = new Faker().internet().emailAddress();
    	 String firstName = new Faker().name().firstName();
    	 String lastName = new Faker().name().lastName();
    	 portalJobsPageObjects.fillEmailAddress(email);
    	 portalJobsPageObjects.fillFirstAndLastName(firstName, lastName);
    	 portalJobsPageObjects.fillCountryBirthAndBirthDay(countryBirth, birthDate);
    	 portalJobsPageObjects.selectGender();
    	 portalJobsPageObjects.selectEducationLevel(educationLevel);
    	 
     }
}
