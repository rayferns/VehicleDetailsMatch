$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VehicleDetailsValidation.feature");
formatter.feature({
  "line": 2,
  "name": "Use the https://www.gov.uk/get-vehicle-information-from-dvla site to verify matching information about a vehicle using the vehicle registration",
  "description": "As a user of the gov dvla site\r\nI want to be able to enter a vehicle registraion number\r\nand verify the details match that vehicle",
  "id": "use-the-https://www.gov.uk/get-vehicle-information-from-dvla-site-to-verify-matching-information-about-a-vehicle-using-the-vehicle-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Verify gov dvla held vehicle information using a valid vehicle registration",
  "description": "",
  "id": "use-the-https://www.gov.uk/get-vehicle-information-from-dvla-site-to-verify-matching-information-about-a-vehicle-using-the-vehicle-registration;verify-gov-dvla-held-vehicle-information-using-a-valid-vehicle-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I enter a valid vehicle registration \u0027\u003cregistrationnumber\u003e\u0027 on \u0027vehicle enquiry\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on the button labeled \u0027\u003cbutton_label\u003e\u0027 on \u0027vehicle enquiry\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I land on the \u0027confirm vehicle\u0027 page with title like \u0027\u003cpage_title\u003e\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I verify \u0027\u003cdetails\u003e\u0027 of the vehicle on the \u0027confirm vehicle\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click radio button \u0027\u003cradio_button\u003e\u0027 on the confirm vehicle page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click on the button labeled \u0027\u003cstring\u003e\u0027 on \u0027confirm vehicle\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I land on the \u0027view vehicle\u0027 page with title like \u0027\u003cpage_title_2\u003e\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I verify the vehicle has Tax and MOT on the view vehicle page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify \u0027\u003cfurther_details\u003e\u0027 of the vehicle on the \u0027view vehicle\u0027 page",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "Valid Car registration details",
  "description": "",
  "id": "use-the-https://www.gov.uk/get-vehicle-information-from-dvla-site-to-verify-matching-information-about-a-vehicle-using-the-vehicle-registration;verify-gov-dvla-held-vehicle-information-using-a-valid-vehicle-registration;valid-car-registration-details",
  "rows": [
    {
      "cells": [
        "vehicl_reg",
        "button_label",
        "page_title",
        "details",
        "further_details"
      ],
      "line": 25,
      "id": "use-the-https://www.gov.uk/get-vehicle-information-from-dvla-site-to-verify-matching-information-about-a-vehicle-using-the-vehicle-registration;verify-gov-dvla-held-vehicle-information-using-a-valid-vehicle-registration;valid-car-registration-details;1"
    },
    {
      "cells": [
        "KX67 LFA",
        "Continue",
        "Check if a vehicle is taxed and has an MOT",
        "Registration number:KX67 LFA, Make:AUDI, Color:BLACK",
        "Date of first registration: September 2017, Year of manufacture: 2017, Fuel type: PETROL"
      ],
      "line": 26,
      "id": "use-the-https://www.gov.uk/get-vehicle-information-from-dvla-site-to-verify-matching-information-about-a-vehicle-using-the-vehicle-registration;verify-gov-dvla-held-vehicle-information-using-a-valid-vehicle-registration;valid-car-registration-details;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 7,
  "name": "Get to the DVLA page where I can enter vehicle registration",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the gov dvla page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I can see the heading \u0027Get vehicle information from DVLA\u0027 on \u0027get information\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on the button labeled \u0027Start now\u0027 on \u0027get information\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I land on the \u0027Enter the registration number of the vehicle\u0027 page with title like \u0027check if vehicle is taxed and had an MOT\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "Verify gov dvla held vehicle information using a valid vehicle registration",
  "description": "",
  "id": "use-the-https://www.gov.uk/get-vehicle-information-from-dvla-site-to-verify-matching-information-about-a-vehicle-using-the-vehicle-registration;verify-gov-dvla-held-vehicle-information-using-a-valid-vehicle-registration;valid-car-registration-details;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I enter a valid vehicle registration \u0027\u003cregistrationnumber\u003e\u0027 on \u0027vehicle enquiry\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on the button labeled \u0027Continue\u0027 on \u0027vehicle enquiry\u0027 page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I land on the \u0027confirm vehicle\u0027 page with title like \u0027Check if a vehicle is taxed and has an MOT\u0027",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I verify \u0027Registration number:KX67 LFA, Make:AUDI, Color:BLACK\u0027 of the vehicle on the \u0027confirm vehicle\u0027 page",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click radio button \u0027\u003cradio_button\u003e\u0027 on the confirm vehicle page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click on the button labeled \u0027\u003cstring\u003e\u0027 on \u0027confirm vehicle\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I land on the \u0027view vehicle\u0027 page with title like \u0027\u003cpage_title_2\u003e\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I verify the vehicle has Tax and MOT on the view vehicle page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify \u0027Date of first registration: September 2017, Year of manufacture: 2017, Fuel type: PETROL\u0027 of the vehicle on the \u0027view vehicle\u0027 page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});