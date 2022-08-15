package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    SauceDemoLoginPage sauceDemoLoginPage;

    @Step("Open the Sauce Demo login page")
    public void theLoginPage() {
        sauceDemoLoginPage.open();
    }
}