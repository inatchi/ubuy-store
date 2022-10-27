import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public By priceRadioBtn = By.xpath("//div[@class='input-checkbox']//label[@for='rdo_price_1']");
    public By iRobotCheckbox = By.xpath("//div[contains(@class, 'input-checkbox')]/label[@for='chbx_2']");
    public By SharkCheckbox = By.xpath("//div[contains(@class, 'input-checkbox')]/label[@for='chbx_3']");
    public By firstProductCard = By.xpath("//div[@id='usstore-products']/div[contains(@class, 'product-inner-list')][1]");

    public ProductPage productFilter(){
        driver.findElement(priceRadioBtn).click();
        driver.findElement(iRobotCheckbox).click();
        return this;
    }

    public ProductCard clickProductItem(){
        driver.findElement(firstProductCard).click();
        return new ProductCard(driver);
    }

}
