import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Aubergine {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\AJ40007958\\Downloads\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"))
				.sendKeys("Flipkart");
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		List<WebElement> suggestion = driver.findElements(By
				.xpath("//ul/li[@class='sbct']"));
		System.out.println(suggestion.size());
		for (WebElement suggest : suggestion) {
			String auto = suggest.getText();
			System.out.println(auto);

		}

		driver.findElement(By.xpath("//ul[@class='erkvQe']/li[1]")).click();
		driver.findElement(By.xpath("//h3[normalize-space()='Flipkart']"))
				.click();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))
				.click();

		WebElement ele = driver.findElement(By
				.xpath("//div[@class='_331-kn _2tvxW']//div[7]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(
				By.xpath("//a[normalize-space()='Air Conditioners']")).click();
		driver.findElement(
				By.xpath("//div[3]//div[2]//div[2]//div[5]//div[1]//div[1]//a[1]//div[1]//img[2]"))
				.click();
		driver.findElement(
				By.xpath("//div[@data-id='ACNFWYTPNBPRUHRZ']//div[@class='_24_Dny']"))
				.click();
		driver.findElement(
				By.xpath("//div[4]//div[1]//div[1]//div[1]//a[1]//div[1]//div[2]//div[1]//span[1]//label[1]//div[1]"))
				.click();
		driver.findElement(
				By.xpath("//div[7]//div[1]//div[1]//div[1]//a[1]//div[1]//div[2]//div[1]//span[1]//label[1]//div[1]"))
				.click();
		driver.findElement(By.xpath("//span[@class='_3hShhO']")).click();
		System.out
				.println("Name of 1st product"
						+ (driver.findElement(By
								.linkText("Voltas 1.5 Ton 5 Star Split Inverter AC - White"))
								.getText()));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2100)");

		driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[5]/div[2]/button[1]"))
				.click();
		driver.findElement(
				By.xpath("//input[@placeholder='Enter delivery pincode']"))
				.sendKeys("679335");
		driver.findElement(By.xpath("//span[@class='UgLoKg']")).click();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,2100)");
		driver.findElement(
				By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(5) > div:nth-child(3) > button:nth-child(1)"))
				.click();
		System.out.println(driver.findElement(By
				.cssSelector("div[class='_3gc7Vf']")));
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,2100)");
		driver.findElement(
				By.xpath("//button[normalize-space()='ADD TO CART']")).click();
		System.out
				.println(driver.findElement(By
						.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1)")));
		driver.findElement(
				By.cssSelector("button[class='_2KpZ6l _2ObVJD _3AWRsL']"))
				.click();
		driver.close();

	}

}
