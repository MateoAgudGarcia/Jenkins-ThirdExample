package com.repeticion.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //Ask how i can close the scanner
            System.out.println("Tab 1 for two numbers or 2 for three numbers");
            int selector = 1;
            System.out.println(selector);
            switch (selector) {
                case 1:
                    System.out.println("Input 2 numbers");
                    double first = 80;
                    System.out.println(first);
                    double second = 5;
                    System.out.println(second);
                    Calculator cal2 = new Calculator(first, second);

                    System.out.println("Enter an operator (+,-,*,/): ");
                    char operator = '/';
                    System.out.println(operator);

                    switch (operator) {
                        case '+':
                            cal2.sum();
                            break;
                        case '-':
                            cal2.subtract();
                            break;

                        case '*':
                            cal2.multiply();
                            break;
                        case '/':
                            cal2.divide();
                            break;
                        default:
                            System.out.println("Error!! The operator is wrong");
                            return;
                    }
                    break;

                case 2:
                    System.out.println("Input 3 numbers");
                    double firstn = 6;
                    System.out.println(firstn);
                    double secondn = 3;
                    System.out.println(secondn);
                    double thirdn = 9;
                    System.out.println(thirdn);
                    Calculator cal3 = new Calculator(firstn, secondn, thirdn);

                    System.out.println("Enter an operator (+,-,*): ");
                    char operator3 = '*';
                    System.out.println(operator3);

                    switch (operator3) {

                        case '+':
                            cal3.sum();
                            break;
                        case '-':
                            cal3.subtract();
                            break;
                        case '*':
                            cal3.multiply();
                            break;
                        default:
                            System.out.println("Error!! The operator is wrong");
                            return;

                    }
                    break;
                default:
                    System.out.println("You need change the number of selector");
                    break;

            }


    }
}

