package creditcards.test.automation.cccomUI.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import creditcards.test.automation.cccomUI.pageobjects.HeaderNav;
import creditcards.test.automation.cccomUI.setup.TestSetUp;

public class HeaderNavTest extends TestSetUp{
	@BeforeMethod
	@BeforeClass
	public void setUp(){
		driver = getDriver();
		driver.navigate().to("http://cccomus.staging.creditcards.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	@Test
	public void verifyHeaderNavigation () throws InterruptedException{
		System.out.print("Header Nav Test");
		HeaderNav headerNav = new HeaderNav(driver);
		headerNav.verifyHeaderNavLowRatesAndFees();
		//headerNav.verifyHeaderNavTravelAndRewards();
		getScreenShot("CccomHeaderNav");
		System.out.println("Test Passed");
		
	}
    
}
