package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        double currentlyDisplayed;
        boolean isRunning = true;

        Console.println("Welcome to my calculator!");

        currentlyDisplayed = Console.getDoubleInput("Please enter your first number or enter \"Memory\" for your stored value");

        Calculator myCalc = new Calculator();

        myCalc.drawScreen(currentlyDisplayed);

        while(isRunning) {

            String op = Console.getStringInput("Please enter the operation you would like to perform:");
            if (op.equalsIgnoreCase("clear")) {
                currentlyDisplayed = 0;
            }
            else if (op.equalsIgnoreCase("add") || op.equalsIgnoreCase("subtract") || op.equalsIgnoreCase("multiply") || op.equalsIgnoreCase("divide") || op.equalsIgnoreCase("exponential")) {
                double secondNum = Console.getDoubleInput("Please enter your second number or enter \"Memory\" for your stored value");
                currentlyDisplayed = myCalc.performOperation(op, currentlyDisplayed, secondNum);
            }
            else {
                currentlyDisplayed = myCalc.performOperation(op, currentlyDisplayed);
            }

            myCalc.drawScreen(currentlyDisplayed);

        }




    }
}
