package factoryMethod;

import operation.Addition;
import operation.Operation;

public class AdditionFactoryMethod extends OperationFactoryMethod {

    public Operation operationFabrication() {
        return new Addition();
    }

}