package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KokpitPage {
    WebDriver driver;

    @FindBy(css = "a[title='Wyloguj']")
    WebElement logoutButton;

    @FindBy(css = "li.item4 a[href*='/versions']")
    WebElement versionsMenuButton;

    public KokpitPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }

    public void goToVersions(){
        versionsMenuButton.click();
    }

    public Boolean isLogoutButtonDisplayed(){
        return logoutButton.isDisplayed();
    }
}
