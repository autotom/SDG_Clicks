package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;

	public Login_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="email")
	WebElement email;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//div//form/input[@value=\"Sign in\"]")
	WebElement submit;
	
	@FindBy(xpath="//section//nav//a[contains(@href,\"mycampaign\")]")
	WebElement mycampaign;

	public WebElement email() {

		return email;
	}

	public WebElement password() {

		return password;
	}

	public WebElement submit() {

		return submit;
	}
	
	public WebElement mycampaign() {

		return mycampaign;
	}
}
