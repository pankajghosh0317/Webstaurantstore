package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Webstaurantstorestepdef {
	static JavascriptExecutor js;
	static WebDriver driver;
	WebDriverWait wait;
	@Given("^user go to the webstaurantstore homepage$")
	public void user_go_to_the_webstaurantstore_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webstaurantstore.com");
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 30);
		
	}

	@When("^user type for \"([^\"]*)\"$")
	public void user_type_for(String arg1) throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement searchbox= driver.findElement(By.xpath("//*[@id='searchval']"));
		searchbox.sendKeys("stainless work table");
	}
	
	@When("^user click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement searchbtn=driver.findElement(By.xpath("//*[@value='Search']"));
		searchbtn.click();
	}
	
	@When("^user verify the word table in every item$")
	public void user_verify_the_word_table_in_every_item() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String digit = driver.findElement(By.xpath("(//*[@id=\"paging\"]/div/ul/li[8]/preceding-sibling::li)[7]")).getText();
		int num = Integer.parseInt(digit);
		for (int i= 0; i<num;i++) {
			js.executeScript("window.scrollBy(0, 6000)");
			List<WebElement> allText = driver.findElements(By.xpath("//*[@data-testid='itemDescription']"));
		
			for (int j =0; j< allText.size();j++) {
				System.out.println("Page number: "+i+" Item number: "+j+" "+allText.get(j).getText());
				Assert.assertTrue("Table word not present",allText.get(j).getText().contains("Table"));
			}
			WebElement nextBtn=driver.findElement(By.xpath("//*[@id='paging']/div/ul/li[8]"));
			nextBtn.click();
		}
	}


	@When("^user click on the add to cart button on the last item of last page$")
	public void user_click_on_the_add_to_cart_button_on_the_last_item_of_last_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement cartbtn=driver.findElement(By.xpath("(//*[@class='add-to-cart'])[60]"));
		cartbtn.click();
	}

	@When("^user click on view cart on pop up window$")
	public void user_click_on_view_cart_on_pop_up_window() throws Throwable {
		WebElement frame=driver.findElement(By.xpath("//*[@data-role='notification']"));
		WebElement viewcart=driver.findElement(By.xpath("//*[@href='/viewcart.cfm']"));
		frame.click();
		viewcart.click();
		
	}

	@When("^user click on empty cart button on web page$")
	public void user_click_on_empty_cart_button_on_web_page() throws Throwable {
		
		WebElement emptycart=driver.findElement(By.xpath("(//*[contains(text(),'Empty Cart')])[2]"));
		emptycart.click();
	}

	@When("^user click on empty cart on pop up window$")
	public void user_click_on_empty_cart_on_pop_up_window() throws Throwable {
		
		WebElement confirm=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		wait.until(ExpectedConditions.elementToBeClickable(confirm));
		confirm.click();
	}

	@Then("^user verify Your cart is empty message appear$")
	public void user_verify_Your_cart_is_empty_message_appear() throws Throwable {
		WebElement messageappears=driver.findElement(By.xpath("//*[@class='header-1']"));

        String expected ="Your cart is empty.";
    	String actual=messageappears.getText();
    	Assert.assertEquals(expected, actual);
		
		
	}


		
	
	}

