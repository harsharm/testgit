package scripts;

import org.junit.Test;

import pom.Loginscript;
import genriqe.Base_test;
import genriqe.Excel;

public class Excecute extends Base_test {
	@Test
	public void testlogin()
	{
		String un=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 2, 1);
		String pwd=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 2, 2);
		String click=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 2, 3);
		String errmsg=Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 2, 4);
		String lp_tittle = Excel.getcellvalue(".\\Excel\\sample.xlsx","testlogin", 2, 5);
		
		Loginscript lp=new Loginscript(driver);
		lp.setun("dhmdsk");
		lp.setpwd("dbdjs");
	lp.click();
	lp.verifyerrmsg();
	lp.verifytittle(lp_page);
	}

}
