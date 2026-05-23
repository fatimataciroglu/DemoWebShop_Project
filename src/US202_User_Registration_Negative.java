import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US202_User_Registration_Negative extends BaseDriver {
    @Test
    public void Test2(){
        MyFunc.wait(3);
        driver.get("https://demowebshop.tricentis.com/");
        WebElement registerBtn = driver.findElement
                (By.xpath("//a[@class='ico-register']"));
        registerBtn.click();
        MyFunc.wait(2);

        WebElement gender = driver.findElement
                (By.xpath("(//input[@name='Gender'])[2]"));
        gender.click();

        WebElement firstname = driver.findElement
                (By.xpath("(//input[@class='text-box single-line'])[1]"));
        firstname.sendKeys("Mary");
        MyFunc.wait(1);

        WebElement lastname = driver.findElement
                (By.xpath("(//input[@class='text-box single-line'])[2]"));
        lastname.sendKeys("Johnson");
        MyFunc.wait(1);

        WebElement email = driver.findElement
                (By.xpath("//input[@id='Email']"));
        email.sendKeys("caps.team12@gmail.com");
        MyFunc.wait(1);

        WebElement password = driver.findElement
                (By.xpath("(//input[@class='text-box single-line password'])[1]"));
        password.sendKeys("pass1234");
        MyFunc.wait(1);

        WebElement confirmPassword = driver.findElement
                (By.xpath("(//input[@class='text-box single-line password'])[2]"));
        confirmPassword.sendKeys("pass1234");

        WebElement registerClick = driver.findElement
                (By.xpath("//input[@id='register-button']"));
        registerClick.click();

        WebElement exists = driver.findElement
                (By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertTrue("The user did not register",
                exists.getText().contains("exists"));
        gozleBagla();
    }
}
