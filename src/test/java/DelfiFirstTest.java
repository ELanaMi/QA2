import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiFirstTest {

    @Test
    public void delfiFirstTitleTest() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://delfi.lv");

    }
}
