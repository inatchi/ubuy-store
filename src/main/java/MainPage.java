import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private By menuBtn = By.xpath("class=\"header-right\"");
    private By loginPageBtn = By.xpath("//ul[contains(@class, \"dropdown-menu\")]/li[1]/a[contains(@href, 'login')]");
    private By signUpPageBtn = By.xpath("//ul[contains(@class, \"dropdown-menu\")]/li[2]/a[contains(@href, 'create')]");



    public SignUp clickSignIn(){
        driver.findElement(signUpPageBtn).click();
        return new SignUp(driver);
    }

    public SignIn clickSignUp(){
        driver.findElement(loginPageBtn).click();
        return new SignIn(driver);
    }
}