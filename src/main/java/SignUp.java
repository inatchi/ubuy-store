import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    private WebDriver driver;

    public SignUp(WebDriver driver){
        this.driver = driver;
    }

    private By nameInput = By.xpath("//input[@id='fullname']");
    private By phoneInput = By.xpath("//input[@id='rmobile']");
    private By emailInput = By.xpath("//input[@id='email']");
    private By passwordInput = By.xpath("//input[@id='password']");
    private By confirmationInput = By.xpath("//input[@id='confirmation']");
    private By checkboxMailingList = By.xpath("//form[@id='new-user-create-form']/div[contains(@class, 'input-checkbox')][1]");
    private By checkboxTerms = By.xpath("//form[@id='new-user-create-form']/div[contains(@class, 'input-checkbox')][2]");
    private By checkboxCapcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
    private By createBtn = By.xpath("//button[@id='create-form-btn']");
    private By heading = By.xpath("//div[contains(@class, 'px-5')]/p[contains(@class, 'h2')]");
    private By fullnameErrorMsg = By.xpath("//div[@id='fullname-error']");
    private By phoneErrorMsg = By.xpath("//div[@id='rmobile-error']");
    private By emailErrorMsg = By.xpath("//div[@id='email-error']");
    private By passwordErrorMsg = By.xpath("//div[@id='password-error']");
    private By passwordConfirmErrorMsg = By.xpath("//div[@id='confirmation-error']");
    private By checkboxErrorMsg = By.xpath("//div[@id='chkTerms-error']");
    private By capthaErrorMsg = By.xpath("//div[@id='g-recaptcha-error']");

    public void clickSignUp(){
        driver.findElement(createBtn).click();
    }

    public SignUp typeName(String username){
        driver.findElement(nameInput).sendKeys(username);
        return this;
    }
    public SignUp typePhone(String telephone){
        driver.findElement(phoneInput).sendKeys(telephone);
        return this;
    }
    public SignUp typeEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }
    public SignUp typePassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }
    public SignUp typePasswordConfirmation(String password){
        driver.findElement(confirmationInput).sendKeys(password);
        return this;
    }
    public SignUp registration(String username, String telephone, String email, String password){
        this.typeName(username);
        this.typePhone(telephone);
        this.typeEmail(email);
        this.typePassword(password);
        this.typePasswordConfirmation(password);
        this.clickSignUp();
        return new SignUp(driver);
    }

    public SignUp loginWithInvalidCreds(String username, String telephone, String email, String password){
        this.typeName(username);
        this.typePhone(telephone);
        this.typeEmail(email);
        this.typePassword(password);
        this.typePasswordConfirmation(password);
        driver.findElement(createBtn).click();
        return new SignUp(driver);
    }
    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }
    public String getfullnameErrorMsg(){
        return driver.findElement(fullnameErrorMsg).getText();
    }
    public String getPhoneErrorMsg(){
        return driver.findElement(phoneErrorMsg).getText();
    }
    public String getEmailErrorMsg(){
        return driver.findElement(emailErrorMsg).getText();
    }
    public String getPasswordErrorMsg(){
        return driver.findElement(passwordErrorMsg).getText();
    }
    public String getPasswordConfirmErrorMsg(){
        return driver.findElement(passwordConfirmErrorMsg).getText();
    }
    public String getCheckboxErrorMsg(){
        return driver.findElement(checkboxErrorMsg).getText();
    }
    public String getCapthaErrorMsg(){
        return driver.findElement(capthaErrorMsg).getText();
    }
}
