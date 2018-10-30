package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.SetUp.driver;
import static core.SetUp.wait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class GooglePage {

    @FindBy(id = "lst-ib")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@value = 'Szczęśliwy traf']")
    private WebElement luckyShot;

    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    public void typeInSearchEngine(final String text) {
        searchInput.sendKeys(text);
    }

    public DoodlePage goToDoodlePage() {
        wait.until(elementToBeClickable(luckyShot)).click();
        wait.until(driver -> driver.getCurrentUrl().equals("https://www.google.com/doodles/"));
        return new DoodlePage();
    }

    public void clearSearchEngine() {
        searchInput.clear();
    }
}
