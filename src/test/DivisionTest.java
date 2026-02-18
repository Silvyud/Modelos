package test;

import factoryMethod.DivisionFactoryMethod;

public class DivisionTest {

    public void test(float num1, float num2) {
        DivisionFactoryMethod divisionFactoryMethod = new DivisionFactoryMethod();
        float result = divisionFactoryMethod.operationFabrication().operate(num1, num2);
        System.out.println("La división es: " + result);
    }

}