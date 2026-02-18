package factoryMethod;

import operation.Division;
import operation.Operation;

public class DivisionFactoryMethod extends OperationFactoryMethod {

    public Operation operationFabrication() {
        return new Division();
    }

}