import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_US_207 extends BaseDriver {
    @Test
    public void Test6() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();

        WebElement loginEmail = driver.findElement(By.xpath("//input[@name='Email']"));
        loginEmail.sendKeys("caps.team31@gmail.com");
        MyFunc.wait(1);

        WebElement loginPassword = driver.findElement(By.xpath("//input[@name='Password']"));
        loginPassword.sendKeys("pass1234");
        MyFunc.wait(1);

        WebElement loginClick = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginClick.click();

        WebElement communityTest = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        communityTest.click();

        WebElement vote = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        vote.click();

        MyFunc.wait(3);
        WebElement checkVotes = driver.findElement(By.xpath("//div[@class='poll']"));
        MyFunc.wait(3);
        Assert.assertTrue("Melumat duzgun eks olunmayib",checkVotes.getText().contains("vote"));

        WebElement logout = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logout.click();

        WebElement communityTest2 = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        communityTest2.click();

        WebElement vote2 = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        vote2.click();
        MyFunc.wait(2);

        WebElement message = driver.findElement(By.xpath("//div[text()='Only registered users can vote.']"));
        Assert.assertTrue("Melumat duzgun eks olunmayib",
                message.getText().equalsIgnoreCase("Only registered users can vote."));
         gozleBagla();
}}
