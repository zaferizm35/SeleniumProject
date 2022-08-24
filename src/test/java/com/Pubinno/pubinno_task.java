package com.Pubinno;

import com.Utulities.ConfigurationReader;
import com.Utulities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pubinno_task {
    @Test
    public void test()  {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.xpath("//input[@id='number']")).sendKeys("8");
        Driver.getDriver().findElement(By.xpath("//button[@id='getFactorial']")).click();
        String actualResult= Driver.getDriver().findElement(By.xpath("//p[@class='text-center top-space-20']")).getText();
        Assert.assertFalse(actualResult.contains("40320"),"Test Passed");

    }
}
