package Browser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IE_Browser_Test {
    public static void main(String[] args) {
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
}

