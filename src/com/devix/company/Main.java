package com.devix.company;

public class Main {

    public static void main(String[] args) {
        Regular primero = new Regular();
        primero.setNombre("Carlos");
        primero.setClases("Programacion");
        primero.setGrado("1");
        primero.setGrupo("A");
        primero.ir_clase();

        Intercambio segundo = new Intercambio("Jose", "Español", "1", "B");
        segundo.ir_clase();
        segundo.estudiar();
        segundo.matricularsez();

    }
}
