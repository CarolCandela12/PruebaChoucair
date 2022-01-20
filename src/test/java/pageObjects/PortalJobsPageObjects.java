package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import utils.Utilidades;

public class PortalJobsPageObjects extends PageObject {

	private By btnRegister = By.xpath("//a[contains(text(),'Regístrate')]");
	private String btnRegisterCountry = "//span[contains(text(),'*')]";
	private By btnContinue = By.xpath("(//span[text()='Continuar']//ancestor::button)[1]");
	//seleccionar
	private By btnDate = By.xpath("//span[text()='Llenar manualmente']");
	private By btnAgree = By.xpath("//input[@Type='checkbox']//ancestor::span");

	private By inputtEmail= By.xpath("//input[@id='email-info_email']");
	private By inputEmailConfirmation = By.xpath("//input[@id='email-info_emailConfirmation']");
	
	private By btnNext = By.xpath("(//span[text()='Siguiente']//ancestor::button)[1]");
	
	private By inputFirstName = By.xpath("//input[@id='personal-info_firstName']");
	private By inputLastName = By.xpath("//input[@id='personal-info_lastName']");
	
	private By inputCountryBirth = By.xpath("//input[@id='birth-info_countryBirth']");
	private String btnCountry = "//div[text()='*']";
	private By inputBirthDate = By.xpath("//input[@id='birth-info_birthdate']");
	
	private By lblWhatIsYourGender = By.xpath("//p[text()='¿Cuál es tu género?']");
	private By rdoInfoGender = By.xpath("//div[@id='gender-info_gender']//input[@type='radio']/ancestor::label");
	
	private By lblWhatIsYourEducationLevel = By.xpath("//*[text()='¿Cuál es tu nivel de estudios completado?']");
	private String btnEducationLevel = "//span[text()='*']";

	private Utilidades utilidades;
	
	public void clickRegisterButton() {
		utilidades.moverScrollAUnElemento(btnRegister);
		utilidades.darClickEnElemento(btnRegister);
	}
	
	public void selectRegisterCountry(String registerCountry) {
		By btnCountry = By.xpath(btnRegisterCountry.replace("*", registerCountry));
		utilidades.darClickEnElemento(btnCountry);
	}
	
	public void clickBtnContinue() {
		utilidades.moverScrollAUnElemento(btnContinue);
		utilidades.darClickEnElemento(btnContinue);
	}
	
	//
	public void clickDate() {
		utilidades.moverScrollAUnElemento(btnDate);
		utilidades.darClickEnElemento(btnDate);
	}
	public void clickAgree() {
		utilidades.moverScrollAUnElemento(btnAgree);
		utilidades.darClickEnElemento(btnAgree);
	}
	
	public void fillEmailAddress(String email) {
		utilidades.escribirTxt(inputtEmail, email);
		utilidades.escribirTxt(inputEmailConfirmation, email);
		clickBtnNext();
	}
	
	public void clickBtnNext() {
		utilidades.moverScrollAUnElemento(btnNext);
		utilidades.darClickEnElemento(btnNext);
	}
	
	public void fillFirstAndLastName(String firstName, String lastName) {
		utilidades.waitElementPresent(inputFirstName, 20);
		utilidades.moverScrollAUnElemento(inputFirstName);
		utilidades.escribirTxt(inputFirstName, firstName);
		utilidades.escribirTxt(inputLastName, lastName);
		clickBtnNext();
	}
	
	public void fillCountryBirthAndBirthDay(String countryBirth, String birthDate) {
		utilidades.waitElementPresent(inputCountryBirth, 20);
		utilidades.moverScrollAUnElemento(inputCountryBirth);
		utilidades.escribirTxt(inputCountryBirth, countryBirth);
		utilidades.darClickEnElemento(By.xpath(btnCountry.replace("*", countryBirth)));
		utilidades.escribirTxt(inputBirthDate, birthDate);
		clickBtnNext();
	}
	
	public void selectGender() {
		utilidades.waitElementPresent(lblWhatIsYourGender, 20);
		utilidades.esperarTiempoSegundos(3);
		List<WebElement> genders = getDriver().findElements(rdoInfoGender);
		utilidades.clickJS(genders.get(utilidades.generarNumeroAleatorio(genders.size()-1)));
		utilidades.clickJS(btnNext);
	}
	
	public void selectEducationLevel(String educationLevel) {
		utilidades.waitElementPresent(lblWhatIsYourEducationLevel, 20);
		utilidades.esperarTiempoSegundos(2);
		By element = By.xpath(btnEducationLevel.replace("*", educationLevel));
		utilidades.clickJS(element);
		clickBtnNext();
		utilidades.esperarTiempoSegundos(30);
	}
	
}


