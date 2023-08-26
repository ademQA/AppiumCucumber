package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.VatanPage;
import utils.BrowserDriver;

import javax.swing.*;

public class vatanStepDefinitions {
    VatanPage vatanPage = new VatanPage();
    Actions actions=new Actions(BrowserDriver.getBrowserDriver());

    @Given("Cookisleri kabul eder")
    public void cookisleri_kabul_eder() throws InterruptedException {
        Thread.sleep(1000);
        vatanPage.cookies.click();
        Thread.sleep(1000);
    }

    @Given("Sol ust koseden uc cizgili menuye tiklayiniz")
    public void sol_ust_koseden_uc_cizgili_menuye_tiklayiniz() throws InterruptedException {
        vatanPage.ucCizgiliMenu.click();
        Thread.sleep(1000);
    }

    @Given("Ust menuden hazir sistem butonunu tiklayiniz")
    public void ust_menuden_hazir_sistem_butonunu_tiklayiniz() throws InterruptedException {
        actions.moveToElement(vatanPage.hazirSistem).click().perform();
        Thread.sleep(1000);

    }

    @Given("Fiyat araligini {double}-{int}.{int} seciniz")
    public void fiyat_araligini_seciniz(Double double1, Integer int1, Integer int2) {

    }

    @Given("Ilk cikan urunu seciniz")
    public void ılk_cikan_urunu_seciniz() {

    }

    @Given("Alt bolumden sistem montaji yap secin")
    public void alt_bolumden_sistem_montaji_yap_secin() {

    }

    @Given("Sepete ekleyi seciniz")
    public void sepete_ekleyi_seciniz() {

    }

    @Given("Sepete git seciniz")
    public void sepete_git_seciniz() {

    }

    @Given("Sepeti onayla seciniz")
    public void sepeti_onayla_seciniz() {

    }

    @Given("uye olmadan devam et tiklayiniz")
    public void uye_olmadan_devam_et_tiklayiniz() {

    }

}
