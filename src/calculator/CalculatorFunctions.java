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
                displayRedCommands(num + " is not a number");
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
            displayRedCommands("No numbers to subtract");
            return;
        }
        result = 0;
        try {
            result = Double.parseDouble(nums[0]);
        } catch (NumberFormatException e) {
            displayRedCommands(nums[0] + " is not a number");
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            try {
                double numDouble = Double.parseDouble(nums[i]);
                result -= numDouble;
            } catch (NumberFormatException e) {
                displayRedCommands(nums[i] + " is not a number");
            }
        }
        showAnswer(result);
    }

    // Multiplication
    public static void multi(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {
            displayRedCommands("No numbers to multiply");
            return;
        }
        result = 1;
        for (String num : nums) {
            try {
                double numDouble = Double.parseDouble(num);
                result *= numDouble;
            } catch (NumberFormatException e) {
                displayRedCommands(num + " is not a number");
                return;
            }
        }
        showAnswer(result);
    }

    // Division
    public static void divide(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {
            displayRedCommands("No numbers to divide");
            return;
        }
        result = 1;
        try {
            result = Double.parseDouble(nums[0]);
        } catch (NumberFormatException e) {
            displayRedCommands(nums[0] + " is not a number");
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            try {
                double numDouble = Double.parseDouble(nums[i]);
                if (numDouble == 0) {
                    displayRedCommands("Division by zero detected.\nAborting operation");
                    return;
                }
                result /= numDouble;
            } catch (NumberFormatException e) {
                displayRedCommands(nums[i] + " is not a number");
                return;
            }
        }
        showAnswer(result);
    }

    // Power
    public static void pow(String mathStatement) {
        String[] nums = mathStatement.trim().split("\\s+");
        if (nums.length == 0) {
            displayRedCommands("No numbers to process");
            return;
        }
        result = 1;
        try {
            result = Double.parseDouble(nums[0]);
        } catch (NumberFormatException e) {
            displayRedCommands(nums[0] + " is not a number");
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            try {
                double numDouble = Double.parseDouble(nums[i]);
                result = Math.pow(result, numDouble);
            } catch (NumberFormatException e) {
                displayRedCommands(nums[i] + " is not a number");
                return;
            }
        }
        showAnswer(result);
    }

    public static void showAnswer(double answer) {
        drawHorizontalBorder(numberOfSymbols);
        System.out.println(centeringFunction(18) + "Answer: " + answer);
        drawHorizontalBorder(numberOfSymbols);
    }

    //GRAPHIC
    //Show list of operations in calculator
    public static void displayCalculatorOperationsList() {
        transitionBorder();
        drawHorizontalBorder(numberOfSymbols);
        System.out.println(centeringFunction(10) + "Operations:");
        drawHorizontalBorder(numberOfSymbols);
        System.out.println("1. sum[+]" + centeringFunction(10) + "2. sub[-]" +
                "\n3. multi[*]" + centeringFunction(14) + "4. div[/]" +
                "\n5. pow[^]" + centeringFunction(10) + "6. exit[x]");
        drawHorizontalBorder(numberOfSymbols);
    }
}