import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test_US_206 extends BaseDriver {
    @Test
    public void Test6() {
        driver.navigate().to("https://demowebshop.tricentis.com/");
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

        WebElement computers = driver.findElement(By.linkText("Computers"));
        computers.click();

        WebElement notebooks = driver.findElement(By.linkText("Notebooks"));
        notebooks.click();
        MyFunc.wait(1);
        driver.navigate().back();
        driver.navigate().forward();

        WebElement lenovoPicture= driver.findElement(By.linkText("14.1-inch Laptop"));
        lenovoPicture.click();
        MyFunc.wait(2);

        WebElement addCard= driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        addCard.click();

        WebElement shoppingCard = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        shoppingCard.click();

        WebElement checkSubtotal= driver.findElement(By.xpath("//span[@class='product-subtotal']"));
        Assert.assertTrue("Melumat duzgun deyil",checkSubtotal.getText().contains("0"));

        WebElement country= driver.findElement(By.xpath("//select[@id='CountryId']"));
        country.click();
        Select WebCountry = new Select(country);
        WebCountry.selectByValue("8");

        WebElement state= driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
        state.click();

        WebElement zipcode= driver.findElement(By.xpath("//input[@id='ZipPostalCode']"));
        zipcode.sendKeys("1111");
        MyFunc.wait(2);

        WebElement agreeTerms= driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agreeTerms.click();

        WebElement checkoutBtn= driver.findElement(By.xpath("//button[@id='checkout']"));
        checkoutBtn.click();

        WebElement addressInfo= driver.findElement(By.xpath("//select[@id='billing-address-select']"));
        addressInfo.click();
        Select WebAdres = new Select(addressInfo);
        WebAdres.selectByValue("4928415");

        WebElement continueBtn = driver.findElement
                (By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        continueBtn.click();

        WebElement pickupStoreBtn = driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        pickupStoreBtn.click();

        WebElement continueBtn2 = driver.findElement
                (By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]"));
        continueBtn2.click();

        WebElement paymentChoices = driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        paymentChoices.click();

        WebElement continueBtn3 = driver.findElement
                (By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        continueBtn3.click();
        MyFunc.wait(2);

        WebElement selectCard = driver.findElement(By.xpath("//select[@id='CreditCardType']"));
        selectCard.click();
        Select WebCard = new Select(selectCard);
        WebCard.selectByValue("Visa");

        WebElement cardHolder = driver.findElement(By.xpath("//input[@id='CardholderName']"));
        cardHolder.click();
        cardHolder.sendKeys("T");

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='CardNumber']"));
        cardNumber.click();
        cardNumber.sendKeys("2");

        WebElement ExpirationMonth = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        ExpirationMonth.click();
        Select WebMonth= new Select(ExpirationMonth);
        WebMonth.selectByValue("1");

        WebElement ExpirationYear = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        ExpirationYear.click();
        Select WebYear = new Select(ExpirationYear);
        WebYear.selectByValue("2026");

        WebElement cardCode = driver.findElement(By.xpath("//input[@id='CardCode']"));
        cardCode.click();
        cardCode.sendKeys("3");

        WebElement continueBtn4 = driver.findElement
                (By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        continueBtn4.click();

        WebElement messege = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));

        Assert.assertTrue("Yanlis melumat secilib",messege.getText().contains("Wrong"));

        driver.navigate().refresh();
        WebElement addressInfo2= driver.findElement(By.xpath("//select[@id='billing-address-select']"));
        addressInfo2.click();
        Select WebAdres2 = new Select(addressInfo2);
        WebAdres2.selectByValue("4928415");

        WebElement continueBtn5 = driver.findElement
                (By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        continueBtn5.click();

        WebElement pickupStoreBtn2 = driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        pickupStoreBtn2.click();

        WebElement continueBtn6 = driver.findElement
                (By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]"));
        continueBtn6.click();

        WebElement paymentChoices2 = driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        paymentChoices2.click();

        WebElement continueBtn7 = driver.findElement
                (By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        continueBtn7.click();
        MyFunc.wait(2);

        WebElement selectCard2 = driver.findElement(By.xpath("//select[@id='CreditCardType']"));
        selectCard2.click();
        Select WebCard2 = new Select(selectCard2);
        WebCard2.selectByValue("MasterCard");

        WebElement cardHolder2 = driver.findElement(By.xpath("//input[@id='CardholderName']"));
        cardHolder2.click();
        cardHolder2.sendKeys("Test");

        WebElement cardNumber2 = driver.findElement(By.xpath("//input[@id='CardNumber']"));
        cardNumber2.click();
        cardNumber2.sendKeys("4242424242424242");

        WebElement ExpirationMonth2 = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        ExpirationMonth2.click();
        Select WebMonth2 = new Select(ExpirationMonth2);
        WebMonth2.selectByValue("7");

        WebElement ExpirationYear2 = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        ExpirationYear2.click();
        Select WebYear2 = new Select(ExpirationYear2);
        WebYear2.selectByValue("2027");

        WebElement cardCode2 = driver.findElement(By.xpath("//input[@id='CardCode']"));
        cardCode2.click();
        cardCode2.sendKeys("123");

        WebElement continueBtn8 = driver.findElement
                (By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        continueBtn8.click();

        WebElement comfirmBtn = driver.findElement
                (By.xpath("//input[@value='Confirm']"));
        comfirmBtn.click();

        WebElement messege2 = driver.findElement
                (By.xpath("//*[text()='Your order has been successfully processed!']"));

        Assert.assertTrue("Yanlis melumat secilib", messege2.getText().contains("successfully"));
        gozleBagla();
    }
}
