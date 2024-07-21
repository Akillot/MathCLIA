package calculator;

import static layout.UserInterface.*;

public class CalculatorFunctions {
    static double result;

    // Summation
    public static void sum(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        result = 0;
        for (String num : nums) {
            try {
                double numDouble = Double.parseDouble(num);
                result += numDouble;
            } catch (NumberFormatException e) {
                displayColorfulCommands(num + " is not a number", "red");
                return;
            }
        }
        showAnswer(result);
    }

    // Subtraction
    public static void sub(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {

            drawHorizontalBorder(numberOfSymbols);
            displayColorfulCommands("No numbers to subtract", "red");
            return;
        }
        result = 0;
        try {
            result = Double.parseDouble(nums[0]);
        } catch (NumberFormatException e) {
            displayColorfulCommands(nums[0] + " is not a number", "red");
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            try {
                double numDouble = Double.parseDouble(nums[i]);
                result -= numDouble;
            } catch (NumberFormatException e) {
                displayColorfulCommands(nums[i] + " is not a number", "red");
            }
        }
        showAnswer(result);
    }

    // Multiplication
    public static void multi(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {
            displayColorfulCommands("No numbers to multiply", "red");
            return;
        }
        result = 1;
        for (String num : nums) {
            try {
                double numDouble = Double.parseDouble(num);
                result *= numDouble;
            } catch (NumberFormatException e) {
                displayColorfulCommands(num + " is not a number", "red");
                return;
            }
        }
        showAnswer(result);
    }

    // Division
    public static void divide(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {
            displayColorfulCommands("No numbers to divide", "red");
            return;
        }
        result = 1;
        try {
            result = Double.parseDouble(nums[0]);
        } catch (NumberFormatException e) {
            displayColorfulCommands(nums[0] + " is not a number", "red");
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            try {
                double numDouble = Double.parseDouble(nums[i]);
                if (numDouble == 0) {
                    displayColorfulCommands("Division by zero detected.\nAborting operation", "red");
                    return;
                }
                result /= numDouble;
            } catch (NumberFormatException e) {
                displayColorfulCommands(nums[i] + " is not a number", "red");
                return;
            }
        }
        showAnswer(result);
    }

    // Power
    public static void pow(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {
            displayColorfulCommands("No numbers to process", "red");
            return;
        }
        result = 1;
        try {
            result = Double.parseDouble(nums[0]);
        } catch (NumberFormatException e) {
            displayColorfulCommands(nums[0] + " is not a number", "red");
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            try {
                double numDouble = Double.parseDouble(nums[i]);
                result = Math.pow(result, numDouble);
            } catch (NumberFormatException e) {
                displayColorfulCommands(nums[i] + " is not a number", "red");
                return;
            }
        }
        showAnswer(result);
    }

    public static void showAnswer(double answer) {
        drawHorizontalBorder(numberOfSymbols);
        System.out.println(contentAlignment(18) + "Answer: " + answer);
        drawHorizontalBorder(numberOfSymbols);
    }

    //GRAPHIC
    //Show list of operations in calculator
    public static void displayCalculatorOperationsList() {
        transitionBorder();
        drawHorizontalBorder(numberOfSymbols);
        System.out.println(contentAlignment(10) + "Operations:");
        drawHorizontalBorder(numberOfSymbols);
        System.out.println("1. sum[+]" + contentAlignment(10) + "2. sub[-]" +
                "\n3. multi[*]" + contentAlignment(14) + "4. div[/]" +
                "\n5. pow[^]" + contentAlignment(10) + "6. exit[x]");
        drawHorizontalBorder(numberOfSymbols);
    }
}