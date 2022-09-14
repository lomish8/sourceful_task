package StepObject;

import PageObject.ContactPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class ContactStep extends ContactPage {
    @Step
    public ContactStep fillName(String name){
        yourName.sendKeys(name);
        return this;
    }
    @Step
    public ContactStep fillEmail(String email){
        yourEmail.sendKeys(email);
        return this;
    }
    @Step
    public ContactStep fillSubject(String subject){
        yourSubject.sendKeys(subject);
        return this;
    }
    @Step
    public ContactStep fillMessage(String message){
        yourMessage.sendKeys(message);
        return this;
    }
    @Step
    public ContactStep clickSubmit(){
        submit.click();
        return this;
    }
    @Step
    public ContactStep checkNameErrorText(){
        emptyError.shouldBe(visible);
        allError.shouldBe(visible);
        return this;
    }
    @Step
    public ContactStep checkIncorrectEmail(){
        incorrectEmail.shouldBe(visible);
        allError.shouldBe(visible);
        return this;
    }
    @Step
    public ContactStep checkSendMessage(){
        sentText.shouldBe(visible);
        return this;
    }
}
