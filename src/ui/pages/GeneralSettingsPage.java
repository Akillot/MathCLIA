package ui.pages;

import ui.layout.AdditionalFunctions;

import java.util.HashMap;

import static ui.layout.AdditionalFunctions.displayTip;
import static ui.layout.AdditionalFunctions.scanner;
import static ui.layout.BorderWork.*;
import static ui.layout.ColorWork.displayColorCommand;
import static ui.layout.TextWork.*;
import static ui.pages.MenuPage.nameOfFunction;

public class GeneralSettingsPage {

    public static void displayGeneralSettings() {
        HashMap<String, Runnable> listOfSettings = new HashMap<>();

        listOfSettings.put("commands", AdditionalFunctions::displayListOfSettings);
        listOfSettings.put("settings value", AdditionalFunctions::displayListOfMenuCommands);
        listOfSettings.put("logo", LogoSwitcherPage::logoSwitcherUi);
        listOfSettings.put("border", LogoSwitcherPage::logoSwitcherUi); //In progress
        listOfSettings.put("delay", LogoSwitcherPage::logoSwitcherUi); //In progress
        listOfSettings.put("exit", AdditionalFunctions::exitBlock);

        displaySlowMotionText(100, 8, false, "Settings\n", "");

        drawHorizontalBorder(numberOfSymbols);
        displayTip("Enter 'commands'\n"
                + contentAlignment(18) + "to show list of\n"
                + contentAlignment(18) + "commands");

        displaySlowMotionText(100, 18, true, "Search", ": ");

        nameOfFunction = scanner.nextLine().toLowerCase();
        wrapText(nameOfFunction, borderWidth - 2); //Wrapping the command from user
        drawHorizontalBorder(numberOfSymbols);

        if (listOfSettings.containsKey(nameOfFunction)) {
            listOfSettings.get(nameOfFunction).run();
        } else {
            drawHorizontalBorder(numberOfSymbols);
            displayColorCommand("Command not found", "red", (byte) 0);
            drawHorizontalBorder(numberOfSymbols);
        }
    }
}
