package factoryMethod;

import operation.Operation;
import operation.Subtraction;

public class SubtractionFactoryMethod extends OperationFactoryMethod {

    public Operation operationFabrication() {
        return new Subtraction();
    }

}