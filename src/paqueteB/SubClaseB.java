package paqueteB;

import paqueteA.ClaseA;

public class SubClaseB extends ClaseA {
    public void metodoPublico() {
        this.aPublico = 11;
        this.aProtected = 22;
    }
}
