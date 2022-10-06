package SeleniumHelloWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class DragAndDrop {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dell\\Desktop\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/droppable");

        WebElement draggable =wd.findElement(By.id("draggable"));
        WebElement droppable =wd.findElement(By.id("droppable"));

        Actions actions = new Actions(wd);

        actions.dragAndDrop(draggable,droppable).perform();


    }
}
