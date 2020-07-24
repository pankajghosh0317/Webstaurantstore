package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebPF {
	WebDriver driver;
	
	 public WebPF (WebDriver driver1) {
		  
		  this.driver = driver1;
		  
		  PageFactory.initElements(driver1, this);
		  
	 }


@FindBy(how=How.XPATH, using="//*[@id='searchval']")
private WebElement searchbox;

@FindBy(how=How.XPATH, using="//*[@value='Search']")
private WebElement searchbutton;

@FindBy(how=How.XPATH, using="(//*[@id=\\\"paging\\\"]/div/ul/li[8]/preceding-sibling::li)[7]")
private WebElement gettext;

@FindBy(how=How.XPATH, using="[@data-testid='itemDescription']")
private WebElement alltext;

@FindBy(how=How.XPATH, using="(//*[@id='paging']/div/ul/li[8]")
private WebElement nextbutton;

@FindBy(how=How.XPATH, using="//*[@class='add-to-cart'])[60]")
private WebElement cartbutton;

@FindBy(how=How.XPATH, using="(//*[@data-role='notification']")
private WebElement frame;

@FindBy(how=How.XPATH, using="(//*[@href='/viewcart.cfm']")
private WebElement viewcart;

@FindBy(how=How.XPATH, using="((//*[contains(text(),'Empty Cart')])[2]")
private WebElement emptycart;

@FindBy(how=How.XPATH, using="(//button[@class='btn btn-primary']")
private WebElement confirmbutton;

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public WebElement getSearchbox() {
	return searchbox;
}

public void setSearchbox(WebElement searchbox) {
	this.searchbox = searchbox;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public void setSearchbutton(WebElement searchbutton) {
	this.searchbutton = searchbutton;
}

public WebElement getGettext() {
	return gettext;
}

public void setGettext(WebElement gettext) {
	this.gettext = gettext;
}

public WebElement getAlltext() {
	return alltext;
}

public void setAlltext(WebElement alltext) {
	this.alltext = alltext;
}

public WebElement getNextbutton() {
	return nextbutton;
}

public void setNextbutton(WebElement nextbutton) {
	this.nextbutton = nextbutton;
}

public WebElement getCartbutton() {
	return cartbutton;
}

public void setCartbutton(WebElement cartbutton) {
	this.cartbutton = cartbutton;
}

public WebElement getFrame() {
	return frame;
}

public void setFrame(WebElement frame) {
	this.frame = frame;
}

public WebElement getViewcart() {
	return viewcart;
}

public void setViewcart(WebElement viewcart) {
	this.viewcart = viewcart;
}

public WebElement getEmptycart() {
	return emptycart;
}

public void setEmptycart(WebElement emptycart) {
	this.emptycart = emptycart;
}

public WebElement getConfirmbutton() {
	return confirmbutton;
}

public void setConfirmbutton(WebElement confirmbutton) {
	this.confirmbutton = confirmbutton;
}



}