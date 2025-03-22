package pomPackage;

import java.io.IOException;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest(); // Create the Object of BaseTest class
		bt.browserSetUp(); // To Perform the Pre-requisites
		
		WelcomePage wp = new WelcomePage(driver); //Create the Object Of WelcomePage class
		wp.getLoginLink().click(); // To Click on Login Link
		
		Flib flib = new Flib(); // Create the Object of Flib class
		String email = flib.readExcelData(EXCEL_PATH,VALIDLOGINCREDS, 1, 0); // To Read Email from excel file
		String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1); // To Read Password from excel file
		
		LoginPage lp = new LoginPage(driver); // Create the Object of LoginPage class
		
		lp.validLoginMethod(email, password);

	}

}
