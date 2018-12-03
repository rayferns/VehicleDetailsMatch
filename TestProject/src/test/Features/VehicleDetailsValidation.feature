@SmokeTest
Feature: Use the https://www.gov.uk/get-vehicle-information-from-dvla site to verify matching information about a vehicle using the vehicle registration
  As a user of the gov dvla site
  I want to be able to enter a vehicle registraion number
  and verify the details match that vehicle

  Background: Get to the DVLA page where I can enter vehicle registration
    Given I am on the gov dvla page
    Then I can see the heading 'Get vehicle information from DVLA' on 'get information' page
    When I click on the button labeled 'Start now' on 'get information' page
    Then I land on the 'Enter the registration number of the vehicle' page with title like 'check if vehicle is taxed and had an MOT'

  Scenario Outline: Verify gov dvla held vehicle information using a valid vehicle registration
    When I enter a valid vehicle registration '<registrationnumber>' on 'vehicle enquiry' page
    And I click on the button labeled '<button_label>' on 'vehicle enquiry' page
    Then I land on the 'confirm vehicle' page with title like '<page_title>'
    And I verify '<details>' of the vehicle on the 'confirm vehicle' page
    When I click radio button '<radio_button>' on the confirm vehicle page
    And I click on the button labeled '<string>' on 'confirm vehicle' page
    Then I land on the 'view vehicle' page with title like '<page_title_2>'
    And I verify the vehicle has Tax and MOT on the view vehicle page
    And I verify '<further_details>' of the vehicle on the 'view vehicle' page

Examples: Valid Car registration details
| vehicl_reg | button_label | page_title | details | further_details  |
| KX67 LFA    | Continue     | Check if a vehicle is taxed and has an MOT | Registration number:KX67 LFA, Make:AUDI, Color:BLACK | Date of first registration: September 2017, Year of manufacture: 2017, Fuel type: PETROL |
