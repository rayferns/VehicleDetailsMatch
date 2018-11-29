Feature: Car Vehicle details validation

I want to validate all car registration number against gov.uk services

@SmokeTest
Scenario Outline: Validate Vehicle details against valid car registration numbers
Given I am on the https://vehicleenquiry.service.gov.uk/ page
When I enter a valid <registrationnumber> of the vehicle
And I confirm the <registration number>, <make> and <colour> is correct
And I select 'Yes' to confirm they all match
And I press continue
Then I see the Vehicle details page matching with the relavant car registration details
Examples: Valid Car registration details
|registrationnumber| Make | Color | 
|SL67 HWH| TOYOTA | WHITE |
|kX67 LFA| AUDI | BLACK |
|KP18 ZNZ| VAUXHALL | RED |


Scenario: Validate Vehicle details against invalid car registration numbers
Given I am on the https://vehicleenquiry.service.gov.uk/ page
When I enter an invalid <registration number> of the vehicle
And I confirm the <registration number>, <make> and <colour> is correct
And I select 'No' to search again
And I press continue
Then I am navigated to the previous page to enter the registration number of the vehicle
