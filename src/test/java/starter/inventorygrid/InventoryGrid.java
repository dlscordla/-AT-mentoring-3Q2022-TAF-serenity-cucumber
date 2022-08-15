package starter.inventorygrid;

import net.serenitybdd.core.steps.UIInteractionSteps;

import static starter.inventorygrid.InventoryGridElements.INVENTORY_TITLE;

public class InventoryGrid  extends UIInteractionSteps {

    public String displayed() {
        return find(INVENTORY_TITLE).getText();
    }
}
