package allTests;

import static org.testng.Assert.assertEquals;

import javax.sound.midi.Soundbank;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	BaseTest instance= BaseTest.getInstance();
	
	
	@Test
	public void titleValidation() {
		instance.getDriver("chrome");
		instance.getHomePage().url();
		String title=instance.getHomePage().getTitle();
		System.out.println(title);
		
    	Assert.assertEquals(title, "W3Schools Online Web Tutorials");
	}

	
	@AfterClass
	public void tearDown() {
		instance.driver.close();
	}
	
	
	
}
