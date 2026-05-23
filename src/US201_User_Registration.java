import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US201_User_Registration extends BaseDriver {
        @Test
        public void Test1(){
                MyFunc.wait(3);
        driver.get("https://demowebshop.tricentis.com/");
        WebElement registerBtn = driver.findElement
                (By.xpath("//a[@class='ico-register']"));
        registerBtn.click();
        MyFunc.wait(2);

        WebElement gender = driver.findElement
                (By.xpath("(//input[@name='Gender'])[1]"));
        gender.click();

        WebElement firstname = driver.findElement
                (By.xpath("(//input[@class='text-box single-line'])[1]"));
        firstname.sendKeys("Team");
        MyFunc.wait(1);

        WebElement lastname = driver.findElement
                (By.xpath("(//input[@class='text-box single-line'])[2]"));
        lastname.sendKeys("twelve");
        MyFunc.wait(1);

        WebElement email = driver.findElement
                (By.xpath("//input[@id='Email']"));
        email.sendKeys("caps.team31@gmail.com");
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

        WebElement registerComfirm = driver.findElement
                (By.xpath("//div[@class='page registration-result-page']"));
                 Assert.assertTrue("The user did not register",
                         registerComfirm.getText().contains("completed"));
                 gozleBagla();
        }
}
