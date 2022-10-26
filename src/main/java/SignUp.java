import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    private WebDriver driver;

    public SignUp(WebDriver driver){
        this.driver = driver;
    }

    private By nameInput = By.xpath("//input[@id=\"fullname\"]");
    private By phoneInput = By.xpath("//input[@id=\"rmobile\"]");
    private By emailInput = By.xpath("//input[@id=\"email\"]");
    private By passwordInput = By.xpath("//input[@id=\"password\"]");
    private By confirmationInput = By.xpath("//input[@id=\"confirmation\"]");
    private By checkBox = By.xpath("//div[contains(@class, \"input-checkbox\")]");
    private By createBtn = By.xpath("//button[@id=\"create-form-btn\"]");

    public void clickSignUp(){
        driver.findElement(createBtn).click();
    }


}
