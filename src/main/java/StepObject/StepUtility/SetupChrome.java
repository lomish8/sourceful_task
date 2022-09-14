package StepObject.StepUtility;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class SetupChrome {
    String url = "https://sourceful.nl";
    public SetupChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        Configuration.browserCapabilities = options;
        Configuration.browserSize = null;
        Configuration.holdBrowserOpen=true;
    }
    public void goToSite(){
        open(url);
    }
}
