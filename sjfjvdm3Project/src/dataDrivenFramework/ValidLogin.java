package dataDrivenFramework;

import java.io.IOException;
import org.openqa.selenium.By;


public class ValidLogin extends BaseTest implements IAutoConstant{

	public static void main(String[] args) throws IOException, InterruptedException {

		Flib flib = new Flib(); // To create the object of Flib Class
		String url = flib.readPropertyData(PROP_PATH, URL); // To read URL from Property File
		
		String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0); // To read Email from Excel File
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1); // To read password from Excel File
		
		BaseTest bt = new BaseTest(); // To create the Object of BaseTest Class
		bt.browserSetUp(); // To perform the pre-requisites
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		bt.browserTearDown(); // To close the browser.
	}

}
