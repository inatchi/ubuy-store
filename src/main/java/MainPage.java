import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.applet.Main;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private By menuBtn = By.xpath("//div[@class='header-right']//li[4]/a[@id='acoount-manage']");
    private By loginPageBtn = By.xpath("//ul[contains(@class, 'dropdown-menu')]/li[1]/a[contains(@href, 'login')]");
    private By signUpPageBtn = By.xpath("//ul[contains(@class, 'dropdown-menu')]/li[2]/a[contains(@href, 'create')]");
    private By popupCloseBtn = By.xpath("//a[contains(@class, 'change-country')]");
    private By productBtn = By.xpath("//div[@class='products-listing']//li[2]/a");


    public MainPage closeAction(){
        driver.findElement(popupCloseBtn).click();
        return new MainPage(driver);
    }

    public MainPage openMenu(){
        driver.findElement(menuBtn).click();
        return new MainPage(driver);
    }

    public SignUp clickSignUp(){
        driver.findElement(signUpPageBtn).click();
        return new SignUp(driver);
    }

    public SignIn clickSignIn(){
        driver.findElement(loginPageBtn).click();
        return new SignIn(driver);
    }

    public ProductPage clickProductBtn(){
        driver.findElement(productBtn).click();
        return new ProductPage(driver);
    }

}
