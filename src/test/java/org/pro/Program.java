package org.pro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Program {

	static WebDriver driver;


	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse\\workspacetwo\\SaaviDrivenFrame\\ChroLib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().refresh();
	  
		}

	public static void passUrl() {
		driver.get("https://adactinhotelapp.com/");
		
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void passUserName() throws InterruptedException {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Aravindsamy");
		Thread.sleep(2000);
	}

	public static void passPassword() throws InterruptedException {
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("IN2IB5");
		Thread.sleep(2000);
	}

	public static void clkLoginBut() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

	public static void hotelLocation() {
		WebElement loca = driver.findElement(By.id("location"));
		Select location = new Select(loca);
		location.selectByVisibleText("New York");
		
	}

	public static void hotelName() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotels = new Select(hotel);
		hotels.selectByVisibleText("Hotel Hervey");
	}

	public static void roomType() throws InterruptedException {
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select typeRoom = new Select(roomType);
		typeRoom.selectByVisibleText("Deluxe");
		  Thread.sleep(2000);
	}

	public static void roomCount() {
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select nosOfRoom = new Select(roomNos);
		nosOfRoom.selectByVisibleText("4 - Four");
	}

	public static void checkinDate() throws InterruptedException {
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys("06/12/2023");
		  Thread.sleep(2000);
	}

	public static void checkoutDate() {
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys("07/12/2023");
	}

	public static void adultRom() {
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select roomForAdult = new Select(adultRoom);
		roomForAdult.selectByVisibleText("2 - Two");
		 
	}

	public static void childRom() throws InterruptedException {
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select roomForChild = new Select(childRoom);
		roomForChild.selectByVisibleText("2 - Two");
		  Thread.sleep(2000);
	}

	public static void signOut() {
		WebElement out = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		out.click();
		driver.quit();
	}
}
