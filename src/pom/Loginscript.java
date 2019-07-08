package pom;

import genriqe.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginscript extends Base_page {
	@FindBy()
	WebElement textbox;
	@FindBy()
	WebElement pwdbox;
	@FindBy()
	WebElement click;
	@FindBy()
	WebElement errmsg;
	@FindBy()
	WebElement lp_page;
	public Loginscript(WebDriver driver)
	{
		super(driver);//PageFactory.initElements(driver, this);
	}
	public void setun(String un)
	{
		textbox.sendKeys(un);
	}
	public void setpwd(String pwd)
	{
		textbox.sendKeys(pwd);
	}
	
	public void click()
	{
		click.click();
	}
	public void verifyerrmsg()
	{
		verifyelement(errmsg);
	}
	public void verifytittle(String lp_page)
	{
		verifytittle(lp_page);
	}
}
	


}	

