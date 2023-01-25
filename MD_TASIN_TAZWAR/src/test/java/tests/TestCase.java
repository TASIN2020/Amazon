package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class TestCase {
	
	
	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	HomePage homePage  = new HomePage(driver);
	Timeout time = new Timeout();
	
	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();		
	}
	
	@Test
	public void Test() {
		
		
		commonMethods.clickOnButton(Locators.SelectCategory);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.CategoryBaby);
		time.timeout();
		
		commonMethods.sendText(Locators.WriteProduct, "Bag");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.ClickOnSearch);
		time.timeout();
		
		
		
		
		//Driver Close
		base.tearDown();
		
	}
	
	
}
