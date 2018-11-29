package test.testCases;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homepage {


	@Test
	public void viewVehiclesHompepage() {
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "src\\test\\utility\\geckodriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://vehicleenquiry.service.gov.uk/ViewVehicle");
	}

}
