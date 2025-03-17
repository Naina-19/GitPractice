import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserLaunch {
    @Test
    public void testBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver d= new ChromeDriver();
        d.get("https://www.saucedemo.com/");
    }
}
