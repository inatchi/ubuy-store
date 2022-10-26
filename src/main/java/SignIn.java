import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SignIn {

    private WebDriver driver;

    public SignIn(WebDriver driver){
        this.driver = driver;
    }

    private By emailInput = By.xpath("//input[@name=\"login[username]\"]");
    private By passwordInput = By.xpath("//input[@name=\"login[password]\"]");
    private By loginBtn = By.xpath("//button[@id=\"login-form-btn\"]");

//    public void clickSignIn(){
//        driver.findElement(loginBtn).click();
//    }

    public SignUp clickSignIn(){
        driver.findElement(loginBtn).click();
        return new SignUp(driver);
    }
}
