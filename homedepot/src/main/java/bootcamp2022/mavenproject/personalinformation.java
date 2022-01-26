package bootcamp2022.mavenproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personalinformation {
	public WebDriver driver;
	@FindBy(id = "email")WebElement email;
	@FindBy(id="password-input-field")WebElement password;
	@FindBy(id="zipCode")WebElement zip;
	@FindBy(id="phone")WebElement phone;
	@FindBy(xpath = "//*[@for='kmsi-checkbox'and@class='checkbox-btn__label-test u__text-align--left']")WebElement keepsi;
	@FindBy(xpath = "//*[@for='verify-phone-checkbox'and@class='checkbox-btn__label-test u__text-align--left']")WebElement sendtext;
	@FindBy(xpath = "//*[@class='col__12-12 u--paddingLarge-bottom u__padding--left-none']") WebElement robot;
	@FindBy(xpath = "//*[@type='submit'and@class='bttn--primary']")WebElement creatb;
	public personalinformation (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void emailsend() {
	email.sendKeys("naimchowdhury.nc@gmail.com");
}
public void putpassword() {
	password.sendKeys("123naim@@");
}
public void sendzipcode() {
	zip.sendKeys("23238");
}
public void phonesend() {
	phone.sendKeys("9293286687");
}
public void keepsic() {
	keepsi.click();
}
public void clicksendtext() {
	sendtext.click();
}
public void selectnotrobot() {
	JavascriptExecutor js=	(JavascriptExecutor)driver;
	robot.click();
	js.executeScript("window.scrollBy(0,200)");
}
public void clickcreatebutton() {
	creatb.click();
}
}
