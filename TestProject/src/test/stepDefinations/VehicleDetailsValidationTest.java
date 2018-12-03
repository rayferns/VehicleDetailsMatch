/**
 * 
 */
package test.stepDefinations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import test.Base.TestBase;
import test.pageObjects.*;
import test.utility.*;
import test.utility.ExcelUtils;
import test.utility.transform.ExcelDataToDataTable;
import cucumber.api.DataTable;
import cucumber.api.Transform;
/**
 * @author Raymond Fernandes
 * Step Definition for VehicleDetailsValidation.feature
 *  reading data for ExcelDatatoDataTable
 */
public class VehicleDetailsValidationTest extends TestBase{
	
	HomePage homePage; 
	CarRegistrationNumberPage carRegistrationNumberPage;
	ConfirmVehiclesPage confirmVehiclesPage;
	VehicleDetailsPage vehicleDetailsPage;
	ExcelUtils excelUtils;

	String sheetName = "CarDetails";
	
	public VehicleDetailsValidationTest(){
		super();
		}
	
	@Before
	    public void setUp(){
		initialization();
		excelUtils = new ExcelUtils();
		carRegistrationNumberPage = new CarRegistrationNumberPage();
		vehicleDetailsPage = new VehicleDetailsPage();
		confirmVehiclesPage = new ConfirmVehiclesPage();
	 
	    }
	 
	@After
	    public void tearDown(){
		driver.quit();
	    }
		
	@Given("^I am on the gov dvla page$")
	public void i_am_on_the_gov_dvla_page() throws Throwable {
		 driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
	}

	@Then("^I can see the heading 'Get vehicle information from DVLA' on 'get information' page$")
	public void i_can_see_the_heading_Get_vehicle_information_from_DVLA_on_get_information_page() throws Throwable {
		String homePageTitle = homePage.verifyHomePageTitle();
		boolean startButton = homePage.verifyStartNowLabel();
		Assert.assertEquals(homePageTitle, "Get vehicle information from DVLA - GOV.UK", "Home page title not matched");
		Assert.assertEquals(true, startButton);
	}

	@When("^I click on the button labeled 'Start now' on 'get information' page$")
	public void i_click_on_the_button_labeled_Start_now_on_get_information_page() throws Throwable {
		homePage.clickStartNowButton();
	}

	@Then("^I land on the 'Enter the registration number of the vehicle' page with title like 'check if vehicle is taxed and had an MOT'$")
	public void i_land_on_the_Enter_the_registration_number_of_the_vehicle_page_with_title_like_check_if_vehicle_is_taxed_and_had_an_MOT() throws Throwable {
		
	}

	@When("^I enter a valid vehicle registration '<registrationnumber>' on 'vehicle enquiry' page$")
	public void i_enter_a_valid_vehicle_registration_registrationnumber_on_vehicle_enquiry_page(DataTable table) throws Throwable {
		System.out.println(table.toString());
		
		List<String> dataList = table.asList(String.class);
		
		for(String str : dataList){
			System.out.println(str);
		}
		
	}

	@When("^I click on the button labeled 'Continue' on 'vehicle enquiry' page$")
	public void i_click_on_the_button_labeled_Continue_on_vehicle_enquiry_page() throws Throwable {
	}

	@Then("^I land on the 'confirm vehicle' page with title like 'Check if a vehicle is taxed and has an MOT'$")
	public void i_land_on_the_confirm_vehicle_page_with_title_like_Check_if_a_vehicle_is_taxed_and_has_an_MOT() throws Throwable {
	}

	@Then("^I verify 'Registration number:KX(\\d+) LFA, Make:AUDI, Color:BLACK' of the vehicle on the 'confirm vehicle' page$")
	public void i_verify_Registration_number_KX_LFA_Make_AUDI_Color_BLACK_of_the_vehicle_on_the_confirm_vehicle_page(int arg1) throws Throwable {
	}

	@When("^I click radio button '<radio_button>' on the confirm vehicle page$")
	public void i_click_radio_button_radio_button_on_the_confirm_vehicle_page() throws Throwable {
	}

	@When("^I click on the button labeled '<string>' on 'confirm vehicle' page$")
	public void i_click_on_the_button_labeled_string_on_confirm_vehicle_page() throws Throwable {
	}

	@Then("^I land on the 'view vehicle' page with title like '<page_title_(\\d+)>'$")
	public void i_land_on_the_view_vehicle_page_with_title_like_page_title_(int arg1) throws Throwable {
	}

	@Then("^I verify the vehicle has Tax and MOT on the view vehicle page$")
	public void i_verify_the_vehicle_has_Tax_and_MOT_on_the_view_vehicle_page() throws Throwable {
	}

	@Then("^I verify 'Date of first registration: September (\\d+), Year of manufacture: (\\d+), Fuel type: PETROL' of the vehicle on the 'view vehicle' page$")
	public void i_verify_Date_of_first_registration_September_Year_of_manufacture_Fuel_type_PETROL_of_the_vehicle_on_the_view_vehicle_page(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
		System.out.println(table.toString());
		
		List<String> dataList = table.asList(String.class);
		
		for(String str : dataList){
			System.out.println(str);
		
		}
		//Assert.assertEquals(expected, vehicleDetailsPage.verifycarRegistrationNumber());
		Assert.assertEquals();
	}

}
