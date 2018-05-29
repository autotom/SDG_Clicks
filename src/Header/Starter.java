package Header;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Objects.*;

public class Starter {

	public WebDriver driver;
	public Properties p = new Properties();
	
	@BeforeTest
	public void setup() throws IOException {
		
		FileInputStream f = new FileInputStream("/home/harish/Desktop/\\/SharafDG_clicks/src/default.properties");
		p.load(f);
		
		System.setProperty("webdriver.chrome.driver", p.getProperty("cpath"));
		driver = new ChromeDriver();
	}
	
	@Test(priority=1)
	public void login() {
		
		driver.get(p.getProperty("url"));
		System.out.println(driver.getTitle());
		
		Login_Page lp = new Login_Page(driver);
		
		lp.email().sendKeys(p.getProperty("email"));
		
		lp.password().sendKeys(p.getProperty("pass"));
		
		lp.submit().click();
		
	}
	
	@Test(priority=2)
	public void pickcampaign() {
		
		Login_Page lp1 = new Login_Page(driver);
		
		lp1.mycampaign().click();
		
	}
	
	@Test(enabled=false)
	public void report() {
		
		Campaign_identifier ci = new Campaign_identifier(driver);
		int i =0;
		System.out.println(ci.mykronoz().getSize());
		
		List<WebElement> myk =  ci.mykronoz();
		//fix this also
		while(i<3) {
			
			System.out.println(ci.mykronoz().getText());
			i++;
		}
		
	@Test(priority=3)
	public void pencil() {
		Campaign_identifier ci1 = new Campaign_identifier(driver);
		//start from here

	}
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
}
