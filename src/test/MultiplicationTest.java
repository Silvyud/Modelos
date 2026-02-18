package test;

import factoryMethod.MultiplicationFactoryMethod;

public class MultiplicationTest {

    public void test(float num1, float num2) {
        MultiplicationFactoryMethod multiplicationFactoryMethod = new MultiplicationFactoryMethod();
        float result = multiplicationFactoryMethod.operationFabrication().operate(num1, num2);
        System.out.println("La multiplicación es: " + result);
    }

}