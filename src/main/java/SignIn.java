import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SignIn {

    private WebDriver driver;

    public SignIn(WebDriver driver){
        this.driver = driver;
    }

    private By emailInput = By.xpath("//input[@name='login[username]']");
    private By passwordInput = By.xpath("//input[@name='login[password]']");
    private By loginBtn = By.xpath("//button[@id='login-form-btn']");
    private By heading = By.xpath("//div[@class=\"p-5\"]/p");
    private By loginErrorMsg = By.xpath("//div[@id=\"login.username-error\"]");
    private By passwordErrorMsg = By.xpath("//div[@id=\"login.password-error\"]");
    private By createAccountBtn = By.xpath("//a[text()='Create an Account']");

    public SignIn typeEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public SignIn typePassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public SignIn loginWithInvalidCreds(String email, String password){
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(loginBtn).click();
        return new SignIn(driver);
    }
    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
    public String getLoginErrorMsg(){
        return driver.findElement(loginErrorMsg).getText();
    }
    public String getPasswordErrorMsg(){
        return driver.findElement(passwordErrorMsg).getText();
    }

    public SignUp clickSignIn(){
        driver.findElement(createAccountBtn).click();
        return new SignUp(driver);
    }
}
