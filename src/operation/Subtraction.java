package operation;

public class Subtraction extends Operation {

    float numberA;
    float numberB;

    public float operate(float numberA, float numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
        return this.numberA - this.numberB;
    }

}