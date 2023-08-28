package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class VatanPage {
    public VatanPage(){
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }
    @FindBy(xpath = "//span[@class='icon-bars']")
    public WebElement ucCizgiliMenu;

    @FindBy(xpath = "//*[text()='Allow']")
    public WebElement cookies;

    @FindBy(xpath = "(//*[@class='topbar-menu__link'])[14]")
    public WebElement hazirSistem;

}
