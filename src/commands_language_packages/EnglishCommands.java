package commands_language_packages;

import additional_packages.calculator.Calculator;
import ui.layout.BasicFunctions;
import ui.pages.GeneralSettingsPage;
import ui.pages.InfoPage;
import ui.pages.TimePage;

import java.util.Map;

public class EnglishCommands {
    public static void registerCommands(Map<String, Runnable> commandMap) {
        commandMap.put("calculator", Calculator::calculator);
        commandMap.put("cal", Calculator::calculator);

        commandMap.put("settings", GeneralSettingsPage::displayGeneralSettings);
        commandMap.put("set", GeneralSettingsPage::displayGeneralSettings);

        commandMap.put("commands", BasicFunctions::displayListOfMenuCommands);
        commandMap.put("com", BasicFunctions::displayListOfMenuCommands);

        commandMap.put("time", TimePage::displayCurrentTime);

        commandMap.put("info", InfoPage::displayInfo);

        commandMap.put("exit", BasicFunctions::exitProgram);
    }
}
