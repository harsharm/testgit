package pom;

import genriqe.Base_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass extends Base_test{
	@FindBy(id="email")
	private WebElement unn;
	@FindBy(name="pass")
	private WebElement pwdd;
	@FindBy(id="u_0_b")
	private WebElement click;
	public Pomclass(WebDriver driver)
	{
	super(driver);	//PageFactory.initElements(driver, this);
	}
	public void setun(String un)
	{
		unn.sendKeys(un);
	}
	public void setpwd(String pwd)
	{
		pwdd.sendKeys(pwd);
	}
	public void clickon()
	{
		click.sendKeys();
	}
}
