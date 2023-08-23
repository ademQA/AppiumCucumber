package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class TrendyolPage{

    public TrendyolPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }
    @FindBy(xpath ="//*[@text='Turkey']")
    public MobileElement ulke;

    @FindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    public MobileElement cinsiyet;

    @FindBy(xpath = "//*[@text='Elektronik']")
    public MobileElement elektronik;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Çok Satanlar']")
    public MobileElement cokSatanlar;

    @FindBy(xpath = "//*[@text='iPhone 13 128 GB Mavi Cep Telefonu (Apple Türkiye Garantili)']")
    public MobileElement iphone13;

    @FindBy(id = "trendyol.com:id/primaryButton")
    public MobileElement sepeteEkle;

    @FindBy(id = "trendyol.com:id/buttonContinue")
    public MobileElement devamEt;

    @FindBy(id = "trendyol.com:id/imageViewTooltipClose")
    public MobileElement ekHizmetKabulEtKapat;

    @FindBy(id = "trendyol.com:id/buttonApproveBasket")
    public MobileElement sepetiOnayla;

    @FindBy(id = "trendyol.com:id/textViewWithoutAuthentication")
    public MobileElement uyeOlmadanDevamEt;

    @FindBy(id = "android:id/button1")
    public MobileElement devamEtSondaki;



















}
