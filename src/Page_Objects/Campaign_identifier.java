package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign_identifier {
	
	WebDriver driver;

	public Campaign_identifier(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div//table//tbody//tr//td[contains(text(),'Mykronoz')]")
	WebElement mykronoz;

	public WebElement mykronoz() {

		return mykronoz;
	}

	@FindBy(xpath="//div//a//i[contains(@class,\"fa fa-pencil\")]")
	WebElement pencil;

	public WebElement pencil() {

		return mykronoz;
	}
	
	
	
}


