import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US205_Login_Negative extends BaseDriver {
    @Test
    public void Test5() {
        MyFunc.wait(3);
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
        loginEmail.sendKeys("");
        WebElement loginPassword = driver.findElement(By.xpath("//input[@name='Password']"));
        loginPassword.sendKeys("");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();
        MyFunc.wait(1);
        WebElement messages = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertTrue("Melumat duzgun eks olunmayib",
                messages.getText().contains("No customer account found"));

       driver.navigate().refresh();

       loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
       loginEmail.sendKeys("caps.team123@gmail.com");
        MyFunc.wait(1);
       loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
       loginBtn.click();
        MyFunc.wait(1);
       messages = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertTrue("Melumat duzgun eks olunmayib",
                messages.getText().contains("The credentials provided are incorrect"));


        driver.navigate().refresh();

        loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
        loginPassword = driver.findElement(By.xpath("//input[@name='Password']"));
        loginEmail.clear();
        loginPassword.sendKeys("pass1234");
        MyFunc.wait(1);
        loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();
        MyFunc.wait(1);
        messages = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertTrue("Melumat duzgun eks olunmayib",
                messages.getText().contains("No customer account found"));

        driver.navigate().refresh();
        loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
        loginEmail.sendKeys("wrongname@yahoo.com");
        MyFunc.wait(1);
        loginPassword = driver.findElement(By.xpath("//input[@name='Password']"));
        loginPassword.sendKeys("wrong123");
        MyFunc.wait(1);
        loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();
        MyFunc.wait(1);
        messages = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertTrue("Melumat duzgun eks olunmayib",
                messages.getText().contains("unsuccessful"));
        gozleBagla();

    }}
