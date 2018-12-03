package test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Base.TestBase;

public class HomePage extends TestBase {
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}	

	// Click the Start now button
	@FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
	WebElement StartButton;
	
	// Verify 'Get vehicle information from DVLA' text is displayed
	@FindBy(xpath = "//h1[contains(@class,'gem-c-title__text')]")
	WebElement vehicleInformationTextLabel;
	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyStartNowLabel(){
		return StartButton.isDisplayed();
	}
	
	public void clickStartNowButton(){
		StartButton.click();
	}
		
	public boolean verifyGetvehicleinformationfromDVLALabel(){
		return vehicleInformationTextLabel.isDisplayed();
	}
		

}
