package pageObjects;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Utilidades;

@DefaultUrl("https://www.choucairtesting.com/")
public class HomePageObjects extends PageObject {

	
	private By btnJobsMenu = By.xpath("//a[text()='Empleos']");
	private By btnGoPortalJobs = By.xpath("(//span[text()='Ir al portal de empleos']//ancestor::a)[1]");
	private By btnContinue = By.xpath("(//span[text()='Continuar']//ancestor::a)[1]");
	


	private Utilidades utilidades;
	private Logger logger = LoggerFactory.getLogger(HomePageObjects.class);
	
	public void clickJobsButton() {
		utilidades.darClickEnElemento(btnJobsMenu);
	}
	
	public void clickGoToPortalJobsButton() {
		utilidades.moverScrollAUnElemento(btnGoPortalJobs);
		utilidades.darClickEnElemento(btnGoPortalJobs);
	}
	
	public void clickBtnContinue() {
		utilidades.moverScrollAUnElemento(btnContinue);
		utilidades.darClickEnElemento(btnContinue);
	}
	
	

}
