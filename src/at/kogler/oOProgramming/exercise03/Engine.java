package at.kogler.oOProgramming.exercise03;

import java.lang.reflect.Type;

public class Engine{

    public enum TYPE {PETROL, DIESEL};
    private Type type;
    private int pOWER;

    public Engine(int pOWER, TYPE type) {
        this.pOWER = pOWER;
        this.type = type;
        }
}