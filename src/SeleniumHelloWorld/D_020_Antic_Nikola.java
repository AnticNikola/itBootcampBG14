package SeleniumHelloWorld;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.IOException;

public class D_020_Antic_Nikola {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dell\\Desktop\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/automation-practice-form");
        wd.manage().window().maximize();




        WebElement name=wd.findElement(By.id("firstName"));
        name.sendKeys("Nikola");
        WebElement lastName=wd.findElement(By.id("lastName"));
        lastName.sendKeys("Antic");
        WebElement email=wd.findElement(By.id("userEmail"));
        email.sendKeys("stokos_blokos@yahoo.com");
        WebElement male=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        male.click();
        WebElement userNumber=wd.findElement(By.id("userNumber"));
        userNumber.sendKeys("1234567891");

        WebElement dateOfBirthInput=wd.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();
        WebElement skrolGodina= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        skrolGodina.click();
        WebElement godina=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        godina.sendKeys("1984");
        WebElement oktobar =wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
        oktobar.click();
        WebElement skrolMesec= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
        skrolMesec.sendKeys("October");
        WebElement devetiOktobar=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"));
        devetiOktobar.click();

        WebElement clickSports =wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/label[1]"));
        clickSports.click();

//        WebElement uploadPicture=wd.findElement(By.id("uploadPicture"));
//        uploadPicture.sendKeys("C/");

        WebElement currentAddress=wd.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Vrtlarska");

        WebElement state=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);

        WebElement city=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        city.sendKeys("Gurgaon");
        city.sendKeys(Keys.ENTER);

        WebElement submit =wd.findElement(By.id("submit"));
        submit.click();



        //WebElement city=wd.findElement(By.id("city"));
        //city.click();
        //state.sendKeys(Keys.ENTER);
        //JavascriptExecutor javascriptExecutor =(JavascriptExecutor) wd;
        //javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",currentAddress);

        //Actions action = new Actions(wd);
        //action.moveToElement(submit).perform();
    }
}