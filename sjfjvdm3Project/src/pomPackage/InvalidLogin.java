package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest(); // Create the Object of BaseTest class
		bt.browserSetUp(); // To Perform the Pre-requisites
		
		WelcomePage wp = new WelcomePage(driver); //Create the Object Of WelcomePage class
		wp.getLoginLink().click(); // To Click on Login Link
		
		Flib flib = new Flib(); // Create the Object of Flib class
		int rc = flib.lastRowCount(EXCEL_PATH, INVALIDLOGINCREDS);
		
		LoginPage lp = new LoginPage(driver); // Create the Object of LoginPage class
		
		for(int i=1; i<=rc; i++)
		{
			String email = flib.readExcelData(EXCEL_PATH,INVALIDLOGINCREDS, i, 0); // To Read Email from excel file
			String password = flib.readExcelData(EXCEL_PATH, INVALIDLOGINCREDS, i, 1); // To Read Password from excel file

			lp.invalidLoginMethod(email, password);
		}
	}

}
