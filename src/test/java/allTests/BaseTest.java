package allTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;

public class BaseTest {

	private static BaseTest instance;
	WebDriver driver;
	HomePage page;

	private BaseTest() {

	}

	public WebDriver getDriver(String DriverValue) {
		if (driver == null) {
			if (DriverValue.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\hoque\\eclipse-workspace\\w3school\\Browsers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if (DriverValue.contains("firefox")) {
				System.setProperty("webdriver.gacko.driver",
						"C:\\Users\\hoque\\eclipse-workspace\\w3school\\Browsers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}

	public static BaseTest getInstance() {
		if (instance == null) {

			instance = new BaseTest();
		}
		return instance;
	}

	public HomePage getHomePage() {
		if (page == null) {
			page = new HomePage(driver);
		}
		return page;
	}

}
