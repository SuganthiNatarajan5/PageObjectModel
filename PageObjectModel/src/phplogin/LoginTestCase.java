package phplogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {

	public void login() {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\sugannat\\Desktop\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, page);
	}
	
}
