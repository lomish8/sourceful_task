package StepObject;

import PageObject.MainPage;
import io.qameta.allure.Step;

public class MainStep extends MainPage {
    @Step("click the contact button on he header menu")
    public MainStep clickContactBtn(){
        contactBtn.click();
        return this;
    }

}
