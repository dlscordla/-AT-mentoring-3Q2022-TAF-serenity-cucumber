package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.inventorygrid.InventoryGrid;
import starter.login.LoginAs;
import starter.navigation.NavigateTo;

import static org.assertj.core.api.Assertions.*;

public class LoginStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    LoginAs loginAs;

    @Steps
    InventoryGrid inventoryGrid;

    @Given("user wants to login as standard user")
    public void userWantsToLoginAsStandardUser() {
        navigateTo.theLoginPage();
    }

    @When("user fills in {string} and {string} fields")
    public void userFillsInAndFields(String username, String password) {
        loginAs.fillInCredentialFields("standard_user", "secret_sauce");
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {
        loginAs.clickLoginButton();
    }

    @Then("user proceeds to Inventory page")
    public void userProceedsToInventoryPage() {
        assertThat(inventoryGrid.displayed()).containsIgnoringCase("products");
    }
}
