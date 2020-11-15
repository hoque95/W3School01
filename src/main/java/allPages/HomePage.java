package allPages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Generic{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public void url() {
		driver.get("https://www.w3schools.com/");
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
      
	
	
}
