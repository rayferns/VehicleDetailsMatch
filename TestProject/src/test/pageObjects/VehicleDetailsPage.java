package test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Base.TestBase;

public class VehicleDetailsPage extends TestBase {
	
	// Initializing the Page Objects:
	public VehicleDetailsPage() {
		PageFactory.initElements(driver, this);
	}

			@FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div[1]/p/strong")
			WebElement taxDueDate;

			@FindBy(xpath = "//*[@id='content']/div[1]/h1/span[@class='reg-mark']")
			WebElement carRegistrationNumber;

			@FindBy(xpath = "//*[@id='content']/div[4]/div/ul/li[1]/span[2]//strong")
			WebElement vehicleMake;

			@FindBy(xpath = "//*[@id='UKRegistrationDateDummyDateV5CMatch']/span[2]/strong")
			WebElement dateOfFirstRegistration;

			@FindBy(xpath = "//*[@id='content']/div[4]/div/ul/li[3]/span[2]/strong")
			WebElement yearOfManufacture;

			@FindBy(xpath = "//*[@id='FuelTypeShown']")
			WebElement fuelType;
			
			public boolean verifytaxDueDate(){
				return taxDueDate.isDisplayed();
			}
			
			public boolean verifycarRegistrationNumber(){
				return carRegistrationNumber.isDisplayed();
			}
			public boolean verifycarvehicleMaker(){
				return vehicleMake.isDisplayed();
			}
			public boolean verifydateOfFirstRegistration(){
				return dateOfFirstRegistration.isDisplayed();
			}
			public boolean verifyyearOfManufacture(){
				return yearOfManufacture.isDisplayed();
			}
			public boolean verifyfuelType(){
				return fuelType.isDisplayed();
			}
			
			
			
}
