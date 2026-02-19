package operation;

import factoryMethod.AdditionFactoryMethod;
import factoryMethod.OperationFactoryMethod;

public class Multiplication extends Operation {

    OperationFactoryMethod additionFactoryMethod = new AdditionFactoryMethod();
    Operation addition;

    public Multiplication() {
        this.addition = this.additionFactoryMethod.operationFabrication();
    }

    // Multiplication is implemented as repeated addition. It's an operation focused on integers.
    public float operate(float numberA, float numberB) {

        float result = 0;
        while (numberA > 0) {
            result = this.addition.operate(result, numberB);
            numberA--;
        }

        return result;
    }

}