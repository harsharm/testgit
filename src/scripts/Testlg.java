package scripts;

import genriqe.Base_page;
import genriqe.Excel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom.Pomclass;



public class Testlg {
	@Test
	public void testmethod()
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("www.facebook.com");
		String un=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 1, 1);
		String pwd=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 1, 2);
		String click=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 1, 3);
		Pomclass lp=new Pomclass(driver);
		lp.setun("hsdbsdb");
		lp.setpwd("sjnsadjn");
		lp.clickon();
	}
	}
	

