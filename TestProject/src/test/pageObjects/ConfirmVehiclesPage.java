package test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Base.TestBase;

public class ConfirmVehiclesPage extends TestBase 
{

	// Initializing the Page Objects:
	public ConfirmVehiclesPage() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//title[contains(text(),'Check if a vehicle is taxed and has an MOT')]")
	WebElement titlePage;	
	
		// Verify Car Registration text appears
	@FindBy(xpath = "//ul[@class='list-summary margin-bottom-2']//li[1]//span[2]']")
	WebElement carRegNumber;	

	@FindBy(xpath = "//ul[@class='list-summary margin-bottom-2']//li[2]//span[2]']")
	WebElement CarMake;

	@FindBy(xpath = "//ul[@class='list-summary margin-bottom-2']//li[3]//span[2]']")
	WebElement CarColour;		
	
	@FindBy(xpath = "//input[@id='Correct_True']")
	WebElement yesRadioButton;		

	@FindBy(xpath = "//input[@id='Correct_False']")
	WebElement noRadioButton;

	@FindBy(xpath = "//span[@class='summary']")
	WebElement inCorrectVehicleDetailsLink;
	
	@FindBy(xpath = "//button[@name='Continue']")
	WebElement continueButton;
	
		
	public boolean verifyTitlePage(){
		return titlePage.isDisplayed();
	}
	public boolean verifycarRegNumber(){
		return carRegNumber.isDisplayed();
	}
	public boolean verifyCarMake(){
		return CarMake.isDisplayed();
	}
		public boolean verifyCarColour(){
		return CarColour.isDisplayed();
	}
		public void selectYesRadioButton(){
		yesRadioButton.click();
	}	
		public void selectNoRadioButton(){
		noRadioButton.click();
	}
		public void selectInCorrectVehicleDetailsLink(){
		inCorrectVehicleDetailsLink.click();
	}
		public void selectContinueButton(String name){
		continueButton.click();
	}
}
