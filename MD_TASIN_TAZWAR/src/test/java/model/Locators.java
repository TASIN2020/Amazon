package model;
	
	import org.openqa.selenium.By;
	
	public class Locators {
		
		public static String homePageUrl = "https://www.amazon.com/"; 
		public static By SelectCategory = By.xpath("//select[@id='searchDropdownBox']");
		public static By CategoryBaby = By.xpath("//option[contains(text(),'Baby')]");
		public static By WriteProduct = By.xpath("//input[@id='twotabsearchtextbox']");
		public static By ClickOnSearch = By.xpath("//input[@id='nav-search-submit-button']");
		
	}
