package test;

import java.util.Scanner;

public class OperationsTest {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Este programa realiza operaciones matemáticas básicas: suma, resta, multiplicación y división.");
        menu();
        int operacion = scn.nextInt();
        System.out.print("\nIngrese el primer número: ");
        float num1 = scn.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        float num2 = scn.nextFloat();

        switch (operacion) {
            case 1:
                AdditionTest sumTest = new AdditionTest();
                sumTest.test(num1, num2);
                break;
            case 2:
                SubtractionTest subtractionTest = new SubtractionTest();
                subtractionTest.test(num1, num2);
                break;
            case 3:
                MultiplicationTest multiplicationTest = new MultiplicationTest();
                multiplicationTest.test(num1, num2);
                break;
            case 4:
                DivisionTest divisionTest = new DivisionTest();
                divisionTest.test(num1, num2);
        }

    }

    public static void menu() {
        System.out.println("\t~~~~~~~~~~ Menú ~~~~~~~~~~");
        System.out.println("1. Suma  2. Resta  3. Multiplicación  4. División");
        System.out.print("Seleccione la operación que desea realizar: ");
    }

}