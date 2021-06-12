package amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class logframework {
	private static Logger log =LogManager.getLogger(logframework.class.getName());
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		log.debug("setting chrome driver property");
		ChromeDriver driver  = new ChromeDriver();
		log.info("now hitting login url");
		driver.get("https://www.amazon.in/");
		log.debug("landed on page");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("diary");
		driver.findElement(By.id("nav-search-submit-button")).click();
		log.debug("page loaded");
	   Actions a = new Actions (driver);
	   a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().sendKeys(Keys.BACK_SPACE).keyDown(Keys.SHIFT) .sendKeys("christmas")
	   .sendKeys(Keys.ENTER).build().perform();
	   log.debug("action performed");
	   
		//history
	   
		

	}

	

}
