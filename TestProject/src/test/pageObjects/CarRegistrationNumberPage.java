package test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.Base.TestBase;

public class CarRegistrationNumberPage extends TestBase
{
	// Initializing the Page Objects:
	public CarRegistrationNumberPage() {
		PageFactory.initElements(driver, this);
	}	
	
	// Verify label for 'Registration number (number plate)' exist
	@FindBy(xpath = "//span[@class='form-label']")
	WebElement registrationNoLabel;
	
	// Textbox to insert car registration number
	@FindBy(xpath = "//input[@id='Vrm']")
	WebElement vrmTextBox;
	
	@FindBy(xpath = "//button[@name='Continue']")
	WebElement continueButton;
	
	public boolean vefifyRegistrationLabel(){
		return registrationNoLabel.isDisplayed();
	}
	
	public void verifyCarRegNo(String carReg){
		 vrmTextBox.sendKeys(carReg);
		 continueButton.click();
	}

}
