package test;

import factoryMethod.SubtractionFactoryMethod;

public class SubtractionTest {

    public void test(float num1, float num2) {
        SubtractionFactoryMethod subtractionFactoryMethod = new SubtractionFactoryMethod();
        float result = subtractionFactoryMethod.operationFabrication().operate(num1, num2);
        System.out.println("La resta es: " + result);
    }

}