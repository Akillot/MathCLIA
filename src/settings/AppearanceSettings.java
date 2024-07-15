package settings;

import layout.LayoutSettings;

import java.util.Random;
import java.util.Scanner;

public class AppearanceSettings {

    public static final String WHITE = "\033[0;38m";
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String GRAY = "\033[0;37m";

    static Scanner scanner = new Scanner(System.in);

    //Method which contains styles of border
    static void changeBorder() {
        System.out.println(" ");
        String[] tableStyleArray = {"+++++++++++++++++", "=================",
                "~+~+~+~+~+~+~+~+~", "~-~-~-~-~-~-~-~-~", "+-+-+-+-+-+-+-+-+",
                "~~~~~~~~~~~~~~~~~", ".................", "*****************",
                "_-_-_-_-_-_-_-_-_", "·················"};
        Random rand = new Random();
        LayoutSettings.fullBorder = tableStyleArray[rand.nextInt(tableStyleArray.length)];
    }

    // 4. Method for changing color of border
    static void changeBorderColor(String choiceColor) {
        switch (choiceColor) {
            case "red":
            case "1":
                LayoutSettings.fullBorder = RED + LayoutSettings.fullBorder + RESET;
                break;
            case "green":
            case "2":
                LayoutSettings.fullBorder = GREEN + LayoutSettings.fullBorder + RESET;
                break;
            case "yellow":
            case "3":
                LayoutSettings.fullBorder = YELLOW + LayoutSettings.fullBorder + RESET;
                break;
            case "blue":
            case "4":
                LayoutSettings.fullBorder = BLUE + LayoutSettings.fullBorder + RESET;
                break;
            case "purple":
            case "5":
                LayoutSettings.fullBorder = PURPLE + LayoutSettings.fullBorder + RESET;
                break;
            case "cyan":
            case "6":
                LayoutSettings.fullBorder = CYAN + LayoutSettings.fullBorder + RESET;
                break;
            case "gray":
            case "7":
                LayoutSettings.fullBorder = GRAY + LayoutSettings.fullBorder + RESET;
                break;
            case "white":
            case "8":
                LayoutSettings.fullBorder = WHITE + LayoutSettings.fullBorder + RESET;
                break;
            case "x":
            case "exit":
            case "9":
                System.out.println("Exiting...");
                break;
        }
    }

    // 3. Method for changing text color
    static void changeTextColor(String choiceColor) {
        switch (choiceColor) {
            case "red":
                System.out.print(RED);
                break;
            case "green":
                System.out.print(GREEN);
                break;
            case "yellow":
                System.out.print(YELLOW);
                break;
            case "blue":
                System.out.print(BLUE);
                break;
            case "purple":
                System.out.print(PURPLE);
                break;
            case "cyan":
                System.out.print(CYAN);
                break;
            case "gray":
                System.out.print(GRAY);
                break;
            case "white":
                System.out.print(WHITE);
                break;
            case "x":
            case "exit":
                System.out.println("Exiting...");
                break;
        }
    }

    // 5. Method to show a list of colors
    static void listOfColors() {
        System.out.print("To which color\ndo you want to change: " +
                RED + "\n1. Red" + RESET + GREEN + "\n2. Green" + RESET +
                YELLOW + "\n3. Yellow" + RESET + BLUE + "\n4. Blue" + RESET +
                PURPLE + "\n5. Purple" + RESET + CYAN + "\n6. Cyan" + RESET +
                GRAY + "\n7. Gray" + RESET + WHITE + "\n8. White" + "\n9. Exit[x]" + RESET + "\n" + LayoutSettings.border + " \nYour choice is: ");
    }

    // 2. Method for changing color of border or text
    static void changeColor() {
        System.out.println("Pick the color of \nwhat you want to change.\n" + LayoutSettings.border);
        System.out.println("1. Text[_]\n2. Border[-]\n3. Exit[x]\n" + LayoutSettings.border + " \nYour choice is: ");

        String partColorChoice = scanner.nextLine().toLowerCase();
        System.out.println(LayoutSettings.border);
        String choiceColor;

        switch (partColorChoice) {
            case "1":
            case "_":
            case "text":
            listOfColors();
            choiceColor = scanner.nextLine().toLowerCase();
                System.out.println(LayoutSettings.border);
            changeTextColor(choiceColor);
                break;

            case "2":
            case "-":
            case "border":
            listOfColors();
            choiceColor = scanner.nextLine().toLowerCase();
                System.out.println(LayoutSettings.border);
            changeBorderColor(choiceColor);
                break;

            case "3":
            case "exit":
            case "x":
            System.out.println("Exiting...\n");
                break;
        }
    }

    // 1. Method for choosing basic changes of color or border
    public static void basicChanges() {
        System.out.println("Choose what you\nwant to change.\n" + LayoutSettings.fullBorder);
        System.out.println("1. Color[~]\n2. Border[-]\n3. Exit[x]\n" + LayoutSettings.fullBorder + " \nYour choice is: ");
        String basicChangesChoice = scanner.nextLine().toLowerCase();
        System.out.println(LayoutSettings.fullBorder);
        if (basicChangesChoice.equals("1") || basicChangesChoice.equals("~") ||
                basicChangesChoice.equalsIgnoreCase("color")) {
            changeColor();
        } else if (basicChangesChoice.equals("2") || basicChangesChoice.equals("-") ||
                basicChangesChoice.equalsIgnoreCase("border")) {
            changeBorder();
        } else if (basicChangesChoice.equals("3") || basicChangesChoice.equalsIgnoreCase("x") ||
                basicChangesChoice.equalsIgnoreCase("exit")) {
            System.out.println("Exiting...\n");
        }
    }

}
