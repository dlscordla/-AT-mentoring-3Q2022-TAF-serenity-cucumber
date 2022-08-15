package starter.login;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static starter.login.LoginFormElements.*;

public class LoginAs extends UIInteractionSteps {

    @Step("Type in username and password")
    public void fillInCredentialFields(String username, String password) {
        $(USERNAME_FIELD).sendKeys(username);
        $(PASSWORD_FIELD).sendKeys(password);
    }

    @Step("Click LOGIN button")
    public void clickLoginButton() {
        $(LOGIN_BUTTON).click();
    }
}
