package com.livecron;

import com.livecron.modelo.*;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado1 = calculadora.multiplicar(100, 20);
        int resultado2 = calculadora.restar(100, 20);
        int resultado3 = calculadora.sumar(100, 20);
        double resultado4 = calculadora.dividir(100.0, 20.0);
        int resultado5 = calculadora.resto(29931, 2);
        double resultado6 = calculadora.calcularRaizCuadrada(25);
        calculadora.valorAbsoluto(100, "Stirng", 12.4);
        double resultado7 = calculadora.calcular(20.0, 10.0, Calculadora.Operador.SUMA);

        //  40 / 2 = 20    residuo 0
        //  2  /  3 =  0.6 residuo
        System.out.println(" Resultado de la Multiplicacion : " + resultado1);
        System.out.println(" Resultado de la Resta : " + resultado2);
        System.out.println(" Resultado de la Sumar : " + resultado3);
        System.out.println(" Resultado de la Dividir : " + resultado4);
        System.out.println(" Resultado de la Resto : " + resultado5);
        System.out.println(" Resultado de la RaizCuadrada : " + resultado6);
        System.out.println(" Resultado de la Suma : " + resultado7);

	    // write your code here
        System.out.println("Iniciando mi clase de Java");

        // nombre de la clase / nombre de la variable = new /nombre de la clase (parametros);\
        Animal gatoCuki = new Gato("Cuki", 2);
        gatoCuki.saltar(true);
        gatoCuki.setMacho(false);
        gatoCuki.setTamanio(EstaturaDelAniamal.LARGO);

        System.out.println(gatoCuki.toString());

        Animal leon = new Leon("Cuki1", 2);
        leon.setMacho(false);
        leon.setMascota(false);
        leon.setTamanio(EstaturaDelAniamal.LARGO);

        System.out.println(leon.toString());

        Perro tobi = new Perro("Tobi", 20);
        tobi.setEdad(1);
        tobi.setMacho(true);
        tobi.setTamanio(EstaturaDelAniamal.MEDIANO);
        System.out.println(tobi.toString());
    }
}
