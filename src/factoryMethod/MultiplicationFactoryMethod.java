package factoryMethod;

import operation.Multiplication;
import operation.Operation;

public class MultiplicationFactoryMethod extends OperationFactoryMethod {

    public Operation operationFabrication() {
        return new Multiplication();
    }

}