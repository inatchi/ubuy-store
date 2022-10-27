import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCard {
    private WebDriver driver;

    public ProductCard(WebDriver driver){
        this.driver = driver;
    }

    public By addToCartBtn = By.xpath("//div[@class='form-row']/button");
    public By goToTheCart = By.xpath("//div[contains(@class, 'popup-block')]//a[text()='View Cart & Checkout']");

    public ProductCard addToCart(){
        driver.findElement(addToCartBtn).click();
        return new ProductCard(driver);
    }

    public CartPage goToTheCart(){
        driver.findElement(goToTheCart).click();
        return new CartPage(driver);
    }
}
