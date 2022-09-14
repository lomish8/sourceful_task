package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    protected static SelenideElement contactBtn = $x("//ul[@id='menu-main-menu']/li/a[@title='Contact']");
}
