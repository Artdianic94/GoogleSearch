package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.WebUrl;


public class SearchResultPage extends BasePage {
    private By SEARCH_INPUT = By.xpath("//input[@class = 'gLFyf']");
    private By SEARCH_BUTTON = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']");
    private By WHITE_FIELD = By.id("gb");
    private By ALL_RESULT = By.xpath("//h3[contains(text(),'Hello')]");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void openGooglePage() {
        driver.get(WebUrl.GOOGLE_URL);
    }

    public String sendTextAndGetFirstSearchedText() {
        driver.findElement(SEARCH_INPUT).sendKeys("Hello World");
        driver.findElement(WHITE_FIELD).click();
        driver.findElement(SEARCH_BUTTON).click();
        return driver.findElement(ALL_RESULT).getText();
    }
}
