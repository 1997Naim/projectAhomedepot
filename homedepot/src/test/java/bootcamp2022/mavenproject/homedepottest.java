package bootcamp2022.mavenproject;

import org.testng.annotations.Test;

import common.Utility;


public class homedepottest extends Utility{
  @Test
  
	  public void f() throws InterruptedException {
			homepage hp=new homepage(driver);
			hp.myaclick();
			hp.registerclick();
		createpage	cac=new createpage(driver) ;
			cac.selectacclick();
			personalinformation pi=new personalinformation(driver);
			pi.emailsend();
			pi.putpassword();
			pi.sendzipcode();
			pi.phonesend();
			pi.keepsic();
			pi.clicksendtext();
			pi.selectnotrobot();
			pi.clickcreatebutton();
  }
}
