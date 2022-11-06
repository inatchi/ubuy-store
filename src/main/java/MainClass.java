import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("chromedriver","/opt/homebrew/bin");
        driver = new ChromeDriver();
        driver.get("https://www.ubuy.com.tr/");

        //Adding wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Maximise browser window
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        SignIn signIn = new SignIn(driver);
        SignUp signUp = new SignUp(driver);
        ProductPage productPage = new ProductPage(driver);
        ProductCard productCard = new ProductCard(driver);

        mainPage.openMenu();
        mainPage.clickSignIn();
        //mainPage.clickSignIn();

        signIn.logIn("fvdbhvb@mail.com", "fvdfvfdvfd");
        signIn.getHeadingText();
        signIn.getLoginErrorMsg();
        signIn.getPasswordErrorMsg();

//        mainPage.clickSignUp();
//        signUp.registration("username", "446468468", "fvdbvhb@fndjkv.co", "fvnd5^jkbvd");

        //mainPage.clickProductBtn();
        //productPage.productFilter();
        productPage.clickProductItem();
        productCard.addToCart();
        //productCard.goToTheCart();

    }
}
