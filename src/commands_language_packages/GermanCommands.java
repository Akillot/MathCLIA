package commands_language_packages;

import additional_packages.calculator.Calculator;
import ui.layout.BasicFunctions;
import ui.pages.GeneralSettingsPage;
import ui.pages.InfoPage;
import ui.pages.TimePage;

import java.util.Map;

public class GermanCommands {
    public static void registerCommands(Map<String, Runnable> commandMap) {
        commandMap.put("rechner", Calculator::calculator);
        commandMap.put("rech", Calculator::calculator);
        commandMap.put("rfxnher", Calculator::calculator); // 'rechner' typed in English layout
        commandMap.put("rfxh", Calculator::calculator); // 'rech' typed in English layout

        commandMap.put("einstellungen", GeneralSettingsPage::displayGeneralSettings);
        commandMap.put("ein", GeneralSettingsPage::displayGeneralSettings);
        commandMap.put("dpfmdmbhfyftufohfo", GeneralSettingsPage::displayGeneralSettings); // 'einstellungen' typed in English layout

        commandMap.put("befehle", BasicFunctions::displayListOfMenuCommands);
        commandMap.put("bef", BasicFunctions::displayListOfMenuCommands);
        commandMap.put("whfidh", BasicFunctions::displayListOfMenuCommands); // 'befehle' typed in English layout

        commandMap.put("zeit", TimePage::displayCurrentTime);
        commandMap.put("ze", TimePage::displayCurrentTime);
        commandMap.put("tdbv", TimePage::displayCurrentTime); // 'zeit' typed in English layout

        commandMap.put("informationen", InfoPage::displayInfo);
        commandMap.put("info", InfoPage::displayInfo);
        commandMap.put("hofpsnbujpofo", InfoPage::displayInfo); // 'info' typed in English layout

        commandMap.put("ausgang", BasicFunctions::exitProgram);
        commandMap.put("aus", BasicFunctions::exitProgram);
        commandMap.put("tbgboh", BasicFunctions::exitProgram); // 'ausgang' typed in English layout
    }
}