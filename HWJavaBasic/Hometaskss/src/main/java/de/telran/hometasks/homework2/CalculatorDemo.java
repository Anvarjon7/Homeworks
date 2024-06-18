package Hometaskss.src.main.java.de.telran.hometasks.homework2;


import Hometaskss.src.main.java.de.telran.hometasks.userinterface.UserInput;
import Hometaskss.src.main.java.de.telran.hometasks.userinterface.UserOutput;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        UserInput input = new UserInput();
        UserOutput output = new UserOutput();

        System.out.println("Enter first number: ");
        double num1 = input.userDouble();
        System.out.println("Enter second number: ");
        double num2 = input.userDouble();

        output.printdata(
                "resultOfAdd " + num1 + " + " + num2 + " = ", +calc.add(num1, num2));
        output.printdata(
                "resultOfSub " + num1 + " - " + num2 + " = ", +calc.sub(num1, num2));
        output.printdata(
                "resultOfMult " + num1 + " * " + num2 + " = ", +calc.mult(num1, num2));
        output.printdata(
                "resultOfDiv " + num1 + " / " + num2 + " = ", +calc.div(num1, num2));
    }
}




