package bootcamp2022.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createpage {
	public  WebDriver driver;
	@FindBy(xpath = "//*[@class='col__12-12 default-box default-border']")WebElement selectac;
public createpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void selectacclick() {
	selectac.click();
}
}
