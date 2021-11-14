package com.microservices.book.domain;

public class Multiplication {

    private int factorA;
    private int factorB;
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    public String toString() {
        return "Multipication{" 
                + "factorA=" + factorA 
                + ", factorB=" + factorB 
                + ", result(A + B)=" + result 
                + "}";
    }
}
