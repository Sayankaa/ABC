package Own_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Own_Practice {
	
	public static void main(String[] agrs) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://doubleclicktest.com/");
	    
		WebElement doubleClick = driver.findElement(By.id("clicker"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick);
		
		
	}
}
