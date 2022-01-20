package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.HomePageObjects;

public class HomeSteps {
	
	private HomePageObjects objectHomePageObjects;
	
	@Step
	public void openBrowser() {
		objectHomePageObjects.open();
	}
	
	@Step
	public void selectJobMenu() {
		objectHomePageObjects.clickJobsButton();
	}
	
	@Step
	public void selectJobsPortal() {
		objectHomePageObjects.clickGoToPortalJobsButton();
		objectHomePageObjects.clickBtnContinue();
	}

}
