package Browser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Multi_Browser_Test {
    static String browser = "ie";
    static String baseurl = "https://www.x-cart.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.x-cart.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle().equals("X-Cart | The Last Ecommerce Platform You Will Ever Need"));
            System.out.println(driver.getTitle().contains("X-Cart"));
            System.out.println(driver.getTitle().length());
            driver.close();

        } else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver =new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.x-cart.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle().equals("X-Cart | The Last Ecommerce Platform You Will Ever Need"));
            System.out.println(driver.getTitle().contains("X-Cart"));
            System.out.println(driver.getTitle().length());
            driver.close();

        }
        else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
            WebDriver driver =new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.x-cart.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle().equals("X-Cart | The Last Ecommerce Platform You Will Ever Need"));
            System.out.println(driver.getTitle().contains("X-Cart"));
            System.out.println(driver.getTitle().length());
            driver.close();
        }
        else {
            System.out.println("Wrong browser name");
        }





    }
}

