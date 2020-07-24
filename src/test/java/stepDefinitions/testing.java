package stepDefinitions;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testing {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webstaurantstore.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		WebElement searchbox= driver.findElement(By.xpath("//*[@id='searchval']"));
//		searchbox.sendKeys("stainless work table");
//		
//		WebElement searchbtn=driver.findElement(By.xpath("//*[@value='Search']"));
//		searchbtn.click();
//		
//
//	
//		
//		String digit = driver.findElement(By.xpath("(//*[@id=\"paging\"]/div/ul/li[8]/preceding-sibling::li)[7]")).getText();
//		int num = Integer.parseInt(digit);
//		for (int i= 0; i<num;i++) {
//			js.executeScript("window.scrollBy(0, 6000)");
//			List<WebElement> allText = driver.findElements(By.xpath("//*[@data-testid='itemDescription']"));
//		
//			for (int j =0; j< allText.size();j++) {
//				System.out.println("Page number: "+i+" Item number: "+j+" "+allText.get(j).getText());
//				Assert.assertTrue("Table word not present",allText.get(j).getText().contains("Table"));
//			}
//			WebElement nextBtn=driver.findElement(By.xpath("//*[@id='paging']/div/ul/li[8]"));
//			nextBtn.click();
//		}
//		
//		
//		WebElement cartbtn=driver.findElement(By.xpath("(//*[@class='add-to-cart'])[60]"));
//		cartbtn.click();
//		
//		
//		
//		
//		WebElement frame=driver.findElement(By.xpath("//*[@data-role='notification']"));
//		WebElement viewcart=driver.findElement(By.xpath("//*[@href='/viewcart.cfm']"));
//		frame.click();
//		Thread.sleep(1000);
//		viewcart.click();
//		
//		Thread.sleep(4000);
//		WebElement emptycart=driver.findElement(By.xpath("(//*[contains(text(),'Empty Cart')])[2]"));
//		emptycart.click();
//		
//		
//		WebElement confirm=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		confirm.click();
//
		WebElement messageappears=driver.findElement(By.xpath("//*[@class='header-1']"));
//        messageappears.click();

        String expected ="Your cart is empty.";
    	String actual=messageappears.getText();
    	System.out.println(actual);
    	Assert.assertEquals(expected, actual);
		
		System.out.println("Cart is cleared!");


	
		//driver.close();
//this is a trial
		//git update
	}

}
