package SeleniumHelloWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class D_019_Antic_Nikola {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                //PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
                "C:\\Users\\Dell\\Desktop\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/text-box");
        Thread.sleep(1000);
        WebElement fullName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        fullName.sendKeys("Nikola");

        WebElement email = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        email.sendKeys("stokos_blokos@yahoo.com");

        WebElement currentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        currentAddress.sendKeys("Vrtlarska");

        WebElement permanentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        permanentAddress.sendKeys("Gandijeva");

        WebElement submit = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        submit.click();

        System.out.println(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[1]")).getText().equals("Name:Nikola"));
        System.out.println(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[2]")).getText().equals("Email:stokos_blokos@yahoo.com"));
        System.out.println(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[3]")).getText().equals("Current Address :Vrtlarska"));
        System.out.println(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[4]")).getText().equals("Permananet Address :Gandijeva"));

        wd.close();


    }
}