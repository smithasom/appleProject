package com.smitha.appleProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BuyIpad {
	WebDriver driver;
	JavascriptExecutor js;

	@Given("^I navigate to apple site$")
	public void i_navigate_to_apple_site() {
		System.setProperty("webdriver.chrome.driver", "/Users/owner/Selenium/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.apple.com/");
	}

	@Then("^select on ipad link$")
	public void select_on_ipad_link() {
		driver.findElement(By.linkText("iPad")).click();
	}

	@Then("^Click on Buy$")
	public void click_on_Buy() {
		driver.findElement(By.partialLinkText("Buy")).click();
	}

	@Then("^Select a silver ipad with 32GB with wifi$")
	public void select_a_silver_ipad_with32GB_with_wifi() {
		try {
			driver.findElement(By.id("dimensionColor-silver")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Item2-dimensionCapacity-32gb")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Item3-dimensionConnection-wifi")).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-ver.fgenerated catch block
			e.printStackTrace();
		}
	}

	@Then("^Add apple care$")
	public void add_apple_care() {
		try {

			driver.findElement(By.id("applecareplus_add_applecareplus_open")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("applecareplus_overlay_open")).click();
			Thread.sleep(2000);
			

		} catch (InterruptedException e) {
			// log exception
			e.printStackTrace();
		}
	}

	@Then("^Add to bag and checkout$")
	public void add_to_bag_and_checkout() {
		try {
			driver.findElement(By.xpath("//button[@title='Continue']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@title='Add to Bag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@title='Review Bag']")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='shoppingCart.actions.checkout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='guest-checkout']")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// log exception
			e.printStackTrace();
		}
	}

	@Then("^Enter shipping address$")
	public void enter_shipping_address() {
		try {
			driver.findElement(By.xpath("//button[contains(text(),'Continue to Shipping Address')]")).click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.firstName']"))
					.sendKeys("Smitha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.lastName']"))
					.sendKeys("Somaraj");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.street']"))
					.sendKeys("123 golden dr");

			Thread.sleep(2000);
			driver.findElement(By
					.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.zipLookup.postalCode']"))
					.sendKeys("12345");

			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='checkout.shipping.addressContactEmail.address.emailAddress']"))
					.sendKeys("smitha@gmail.com");

			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//input[@id='checkout.shipping.addressContactPhone.address.fullDaytimePhone']"))
					.sendKeys("4086545678");

			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Continue to Payment')]")).click();
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// log exception
			e.printStackTrace();
		}
	}

	@Then("^Enter credit card info$")
	public void enter_credit_card_info() {
		try {
			driver.findElement(By.xpath("//div[contains(text(),'Visa, Mastercard, AMEX, Discover, UnionPay, Barcla')]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.name("cardNumber")).sendKeys("4111111111111111");
			driver.findElement(By.name("expiration")).sendKeys("02/20");
			driver.findElement(By.name("securityCode")).sendKeys("124");

			js.executeScript("window.scrollBy(0,900)");
		} catch (InterruptedException e) {
			// log exception
			e.printStackTrace();
		}
	}

	@Then("^Review order$")
	public void review_order() {
		try {
			driver.findElement(By.xpath("//button[contains(text(),'Review Your Order')]"));
			Thread.sleep(2000);
			driver.close();

		} catch (InterruptedException e) {
			// log exception
			e.printStackTrace();
		}
	}

}
