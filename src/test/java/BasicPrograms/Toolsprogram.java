package BasicPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Toolsprogram {
 
	public WebDriver driver;
	
	
  @Test
  public void Registerform() throws Exception {
	  //first name
	driver.findElement(By.id("firstName")).sendKeys("lilly");
	  //last name
	  driver.findElement(By.id("lastName")).sendKeys("lil");
	  //Enter Email
	  driver.findElement(By.id("userEmail")).sendKeys("lilly123@gmail.com");
	  Thread.sleep(10000);
	  //Gender
	 driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
	  Thread.sleep(3000);
	  //Enter Number
	  driver.findElement(By.id("userNumber")).sendKeys("6300991177");
	  Thread.sleep(3000);
	  //date of birth
	  driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	  Thread.sleep(2000);
	  //select month
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("April");
	  Thread.sleep(3000);
	  //select year
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("2000");
	  Thread.sleep(3000);
	  //click on April 22 date
	  driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, April 22nd, 2000']")).click();
	  Thread.sleep(3000);
	  //subject
	  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  Thread.sleep(10000);
	  //hobbies
	  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
	  //upload picture
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\NAGA MOUNIKA\\Downloads\\pexels-pixabay-60597.jpg");
	  //current address
	  driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad city Views");
	  driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
	  //state
	  driver.switchTo().activeElement().sendKeys("NCR");
	  
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  //city
	  driver.switchTo().activeElement().sendKeys("delhi");
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	  
	 //submit
	 driver.findElement(By.id("submit")).click();
	 //close
	 driver.findElement(By.id("closeLargeModal")).click();  
	  
  }
  
  @BeforeTest
  public void openurl() throws Exception {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(10000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
