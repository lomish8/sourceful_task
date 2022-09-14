import StepObject.ContactStep;
import StepObject.MainStep;
import StepObject.StepUtility.SetupChrome;
import com.codeborne.selenide.Configuration;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ContactTest extends SetupChrome {

    MainStep mainStep = new MainStep();
    ContactStep contactStep = new ContactStep();

    @Test(description = "submit without name")
    public void CheckSubmitWithoutName(){
        super.goToSite();
        mainStep.clickContactBtn();
        contactStep.fillEmail("test@gmail.com").fillSubject("sub").fillMessage("mes").clickSubmit()
                .checkNameErrorText();
    }
    @Test(description = "submit without email")
    public void CheckSubmitWithoutEmail(){
        super.goToSite();
        mainStep.clickContactBtn();
        contactStep.fillName("test").fillSubject("sub").fillMessage("mes").clickSubmit()
                .checkNameErrorText();
    }
    @Test(description = "submit with incorrect email")
    public void CheckIncorrectEmail(){
        super.goToSite();
        mainStep.clickContactBtn();
        contactStep.fillName("test").fillEmail("test.example@com").fillSubject("sub").fillMessage("mes").clickSubmit()
                .checkIncorrectEmail();
    }
    @Test(description = "submit and check if message sent")
    public void CheckSendMessage(){
        super.goToSite();
        mainStep.clickContactBtn();
        contactStep.fillName("a").fillEmail("a@gmail.com").fillSubject("").fillMessage("").clickSubmit()
                .checkSendMessage();
    }
}
