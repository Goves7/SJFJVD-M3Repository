package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	// Declaration
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']")
	private WebElement smartphoneCartProduct;
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartphoneCheckbox;
	@FindBy(name = "updatecart")
	private WebElement updateShoppingCartButton;
	@FindBy(name = "continueshopping")
	private WebElement continueShoppingButton;
	@FindBy(id = "termsofservice")
	private WebElement termsOfServicesCheckbox;
	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	// initialization
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}

	public WebElement getSmartphoneCheckbox() {
		return smartphoneCheckbox;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermsOfServicesCheckbox() {
		return termsOfServicesCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

}
