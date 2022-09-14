package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ContactPage {
    protected static SelenideElement yourName = $x("//input[@name='your-name']");
    protected static SelenideElement yourEmail = $x("//input[@name='your-email']");
    protected static SelenideElement yourSubject = $x("//input[@name='your-subject']");
    protected static SelenideElement yourMessage = $x("//textarea[@name='your-message']");
    protected static SelenideElement submit = $x("//input[@type='submit']");
    protected static SelenideElement allError = $x("//div[text()='One or more fields have an error. Please check and try again.']");
    protected static SelenideElement emptyError = $x("//span[text()='The field is required.']");
    protected static SelenideElement incorrectEmail = $x("//span[text()='The e-mail address entered is invalid.']");
    protected static SelenideElement sentText = $x("//div[text()='Thank you for your message. It has been sent.']");
}
