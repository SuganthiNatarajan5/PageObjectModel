package phplogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageObjectWithoutAnnotation {
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;

	@Test
	public void login() {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, PageObjectWithoutAnnotation.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
	}
}
