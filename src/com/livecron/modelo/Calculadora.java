package com.livecron.modelo;

public class Calculadora {

    public int multiplicar (int x, int y) {
        return x * y;
    }

    public int restar(int x , int y) {
        return x - y;
    }

    public double dividir(double x , double y) {
        return x / y;
    }

    public int sumar(int x, int y) {
        return x + y;
    }

    public int resto(int v, int v1) {
        return v % v1;
    }

    public double calcularRaizCuadrada(double numero) {
        // Square root - > sqrt
        return Math.sqrt(numero);
    }

    public double calcular(double num1, double num2, Operador operador) {
        switch (operador.getOperador()) {
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '-':
                return num1 - num2;
            case '+':
                return num1 + num2;
            default:
                return -1.0;
        }
    }

    public void valorAbsoluto(int i, String stirng, double v) {

    }

    public enum Operador {
        SUMA('+'),
        RESTA('-'),
        MULTIPLICACION('*'),
        DIVISION('/');

        private char operador;

        Operador(char operador) {
            this.operador = operador;
        }
        public char getOperador() {
            return operador;
        }
    }
}
