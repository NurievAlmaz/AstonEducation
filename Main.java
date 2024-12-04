import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OnlineReplenishmentTest {
    private WebDriver driver;
    private OnlineReplenishmentPage page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        page = new OnlineReplenishmentPage(driver);
    }

    @Test
    public void testOnlineReplenishmentFlow() {
        driver.get("https://www.mts.by/");


        page.verifyPaymentOptionPlaceholders("Услуги связи");
        page.verifyPaymentOptionPlaceholders("Домашний интернет");
        page.verifyPaymentOptionPlaceholders("Рассрочка");
        page.verifyPaymentOptionPlaceholders("Задолженность");


        page.selectCommunicationServices();
        page.enterPhoneNumber("297777777");
        page.clickContinueButton();


        Assert.assertEquals("Неверная сумма платежа", "41.90 руб", page.getPaymentAmount());
        Assert.assertEquals("Неверный номер телефона", "297777777", page.getPaymentPhoneNumber());
        page.verifyCardDetailsSection();
        page.verifyPaymentSystemIcons();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}



class OnlineReplenishmentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Селекторы элементов страницы
    private By servicesBlockLocator = By.id("servicesBlock");
    private By paymentOptionsLocators = By.cssSelector(".payment-option");
    private By fieldPlaceholderLocators = By.cssSelector(".field-placeholder");
    private By communicationServicesOptionLocator = By.id("communicationServicesOption");
    private By phoneNumberFieldLocator = By.id("phoneNumberField");
    private By continueButtonLocator = By.id("continueButton");
    private By paymentSummarySectionLocator = By.id("paymentSummary");
    private By paymentAmountLocator = By.id("paymentAmount");
    private By paymentPhoneLocator = By.id("paymentPhone");
    private By cardDetailsSectionLocator = By.id("cardDetailsSection");
    private By paymentSystemIconsLocator = By.cssSelector(".payment-system-icon");


    public OnlineReplenishmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    public void verifyPaymentOptionPlaceholders(String optionLabel) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format("//div[@class='payment-option' and contains(text(),'%s')]//div[@class='field-placeholder']", optionLabel))));
        List<WebElement> placeholders = driver.findElements(By.xpath(String.format("//div[@class='payment-option' and contains(text(),'%s')]//div[@class='field-placeholder']", optionLabel)));
        for(WebElement placeholder: placeholders) {
            Assert.assertFalse("Заполнитель поля пустой", placeholder.getText().isEmpty());
        }
    }

    public void selectCommunicationServices() {
        wait.until(ExpectedConditions.elementToBeClickable(communicationServicesOptionLocator)).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumberFieldLocator)).sendKeys(phoneNumber);
    }

    public void clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButtonLocator)).click();
    }

    public String getPaymentAmount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(paymentAmountLocator));
        return driver.findElement(paymentAmountLocator).getText();
    }

    public String getPaymentPhoneNumber() {
        wait.until(ExpectedConditions.presenceOfElementLocated(paymentPhoneLocator));
        return driver.findElement(paymentPhoneLocator).getText();
    }


    public void verifyCardDetailsSection() {
        wait.until(ExpectedConditions.presenceOfElementLocated(cardDetailsSectionLocator));
        List<WebElement> cardDetailsPlaceholders = driver.findElements(By.xpath("//div[@id='cardDetailsSection']//div[@class='field-placeholder']")); // Adjust XPath
        for (WebElement placeholder : cardDetailsPlaceholders) {
            Assert.assertFalse("Заполнитель поля пустой", placeholder.getText().isEmpty());
        }
    }

    public void verifyPaymentSystemIcons() {
        List<WebElement> icons = driver.findElements(paymentSystemIconsLocator);
        Assert.assertTrue("Иконки платежных систем не найдены", icons.size() > 0);
    }
}