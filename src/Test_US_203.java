import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test_US_203 extends BaseDriver {
    @Test
    public void Test3() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
        loginEmail.sendKeys("caps.team123@gmail.com");
        MyFunc.wait(1);

        WebElement loginPassword = driver.findElement(By.xpath("//input[@name='Password']"));
        loginPassword.sendKeys("pass1234");
        MyFunc.wait(1);

        WebElement loginClick = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginClick.click();

        WebElement hoverElement = driver.findElement(By.xpath("(//ul[@class='top-menu']/li)[2]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverElement).build().perform();
        MyFunc.wait(1);

        WebElement checkName = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        Assert.assertTrue("Melumatlar dogru deyil",checkName.getText().contains("caps"));

        WebElement logoutClick = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logoutClick.click();

        WebElement registerBtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Assert.assertTrue("Logout edilmedi",registerBtn.getText().contains("Register"));

        gozleBagla();


    }}
