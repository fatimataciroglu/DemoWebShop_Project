import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_209_Tarixceni_Endirme extends BaseDriver {
    @Test
    public void Test9() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();

        System.out.println("Gedilen sehifemiz");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
        loginEmail.sendKeys("caps.team123@gmail.com");
        MyFunc.wait(1);

        WebElement loginPassword = driver.findElement(By.xpath("//input[@name='Password']"));
        loginPassword.sendKeys("pass1234");
        MyFunc.wait(1);

        WebElement loginClick = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginClick.click();

        WebElement myAccount = driver.findElement(By.xpath("(//a[@class='account'])[2]"));
        myAccount.click();

        WebElement orders = driver.findElement(By.xpath("(//a[@class='inactive'])[2]"));
        orders.click();

        WebElement details = driver.findElement
                (By.xpath("(//input[@class='button-2 order-details-button'])[3]"));
        details.click();

        WebElement invoice = driver.findElement
                (By.xpath("//a[@class='button-2 pdf-order-button']"));
        invoice.click();
        Assert.assertTrue("Melumat duzgun eks olunmayib",
                invoice.getText().equalsIgnoreCase("PDF Invoice"));
        gozleBagla();
    }
}
