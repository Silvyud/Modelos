package test;

import java.util.Scanner;

// Este programa se enfoca en la implementación del factory method trabajando con operaciones
//Las entradas y salida se manejan de manera sencilla por consola.
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

        // Se ejecuta el test correspondiente a la operación seleccionada por el usuario. Se le da un test
        // específico a cada operación para que se pueda probar cada una de forma independiente (util en caso
        // de algún error).
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