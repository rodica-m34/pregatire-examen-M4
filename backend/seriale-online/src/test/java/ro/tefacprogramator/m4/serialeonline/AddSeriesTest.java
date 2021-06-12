package ro.tefacprogramator.m4.serialeonline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSeriesTest {
    
    @Test
    public void addNewSeries() {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("http://localhost:3000/");

        driver.findElement(By.cssSelector("[name='name']")).sendKeys("test selenium");
        driver.findElement(By.cssSelector("[name='numberOfSeasons']")).sendKeys("12");
        driver.findElement(By.cssSelector("[name='idCategory']")).sendKeys("1");
        driver.findElement(By.cssSelector("[name='idPlatform']")).sendKeys("3");

        driver.findElement(By.cssSelector("#send-btn")).click();

        String statusMessage = driver.findElement(By.cssSelector("#message")).getText();
        driver.quit();

        assertEquals("Datele au fost salvate cu succes !", statusMessage);
    }


}
