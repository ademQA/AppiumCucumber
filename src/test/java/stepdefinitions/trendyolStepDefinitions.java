package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import pages.TrendyolPage;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class trendyolStepDefinitions {
    TrendyolPage trendyolPage = new TrendyolPage();


    @Given("ilk ekran ayarlarını yapıp cinsiyet secin")
    public void ilk_ekran_ayarlarını_yapıp_cinsiyet_secin() throws InterruptedException {
        trendyolPage.ulke.click();
        trendyolPage.cinsiyet.click();
        Thread.sleep(1000);
        ReusableMethods.koordinatTiklama(967, 462, 1000);
    }

    @Given("üstten ekranı sola kaydırarak elektronik bolumunu secin")
    public void üstten_ekranı_sola_kaydırarak_elektronik_bolumunu_secin() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            ReusableMethods.screenScroll(946, 297, 1000, 90, 297);
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
        trendyolPage.elektronik.click();
        Thread.sleep(1000);

    }

    @Given("cep telenu butonunu tıkladıktan sonra cok satanlar butonuna tıklayınız")
    public void cep_telenu_butonunu_tıkladıktan_sonra_cok_satanlar_butonuna_tıklayınız() throws InterruptedException {
        // ReusableMethods.scrollWithUiScrollableAndClick("Cep Telefonu");
        ReusableMethods.koordinatTiklama(937, 1155, 1000);
        Thread.sleep(1000);
        trendyolPage.cokSatanlar.click();
        Thread.sleep(3000);
    }

    @Given("karsimiza gelen altinci urunu seciniz")
    public void karsimiza_gelen_altinci_urunu_seciniz() throws InterruptedException {
        //ReusableMethods.scrollWithUiScrollableAndClick("iPhone 13 128 GB Mavi Cep Telefonu (Apple Türkiye Garantili)");
        Thread.sleep(2000);

        ReusableMethods.screenScroll(475, 1700, 450, 475, 630);

        /*
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(475,1600))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(475,700)).release().perform();

         */

        Thread.sleep(1000);
        trendyolPage.iphone13.click();

    }

    @Given("sepete ekle dedikten sonra devam et butonuna tiklayiniz")
    public void sepete_ekle_dedikten_sonra_devam_et_butonuna_tiklayiniz() throws InterruptedException {
        trendyolPage.sepeteEkle.click();
        Thread.sleep(1000);
        trendyolPage.devamEt.click();
        Thread.sleep(1000);
        trendyolPage.ekHizmetKabulEtKapat.click();
        Thread.sleep(1000);

    }

    @Given("sepeti onayla dedikten sonra uye olmadan devam et butonuna tiklayiniz")
    public void sepeti_onayla_dedikten_sonra_uye_olmadan_devam_et_butonuna_tiklayiniz() throws InterruptedException {
        trendyolPage.sepetiOnayla.click();
        Thread.sleep(1000);
        trendyolPage.uyeOlmadanDevamEt.click();
        Thread.sleep(1000);
    }

    @Given("devam et butonuna tekrar tiklayinca enbasa dondugunuzu fark edeceksiniz")
    public void devam_et_butonuna_tekrar_tiklayinca_enbasa_dondugunuzu_fark_edeceksiniz() {
        trendyolPage.devamEtSondaki.click();
        Driver.getAndroidDriver().sendSMS("5555555555","malesef başa döndünüz");
    }


}
