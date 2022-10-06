package SeleniumHelloWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class DemoDohvatanjeElemenata {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dell\\Desktop\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/text-box");
        WebElement element = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]"));
        Thread.sleep(3000);
        System.out.println(element.getText());
        System.out.println(element.getAttribute("class").equals("form-label"));

        wd.close();
    }
}