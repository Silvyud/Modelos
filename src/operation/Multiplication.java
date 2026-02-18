package operation;

import factoryMethod.AdditionFactoryMethod;
import factoryMethod.OperationFactoryMethod;

public class Multiplication extends Operation {

    float numberA;
    float numberB;
    OperationFactoryMethod additionFactoryMethod = new AdditionFactoryMethod();
    Operation addition;

    public Multiplication() {
        this.addition = this.additionFactoryMethod.operationFabrication();
    }

    public float operate(float numberA, float numberB) {
        this.numberA = numberA;
        this.numberB = numberB;

        float result;
        for(result = 0.0F; this.numberB > 0.0F; --this.numberB) {
            result = this.addition.operate(result, this.numberA);
        }

        return result;
    }

}