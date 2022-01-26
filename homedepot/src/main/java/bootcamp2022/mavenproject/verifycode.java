package bootcamp2022.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifycode {
	public WebDriver driver;
	@FindBy(xpath = "//*[@type='button'and@class='bttn-outline bttn-outline--primary u--marginNormal-top']")WebElement skip;
	public verifycode(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickskip() {
		skip.click();
	}
}
