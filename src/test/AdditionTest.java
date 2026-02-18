package test;

import factoryMethod.AdditionFactoryMethod;

public class AdditionTest {

    public void test(float num1, float num2) {
        AdditionFactoryMethod additionFactoryMethod = new AdditionFactoryMethod();
        float result = additionFactoryMethod.operationFabrication().operate(num1, num2);
        System.out.println("La suma es: " + result);
    }

}
