import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ubuy.com.tr/");

        //Adding wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Maximise browser window
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        SignIn signIn = new SignIn(driver);

        //mainPage.closeAction();
        //
        mainPage.openMenu();
        mainPage.clickSignIn();

        signIn.logIn("fvdbhvb", "fvdfvfdvfd");

    }
}
