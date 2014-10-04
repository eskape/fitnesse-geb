import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

driver = { new FirefoxDriver() }

environments {
    chrome {
        driver = { new ChromeDriver() }
    }
}