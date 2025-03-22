package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	// Declaration
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']") 
	private WebElement smartphoneCartProduct;
    
	// initialization
    public ShoppingCartPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }

    // Utilization
	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}
    
    
}
