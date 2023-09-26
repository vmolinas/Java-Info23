package ProgImperativa.Iniciado;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int resultado = num1 + num2;
        String paridad = "impar";
        if (resultado%2 == 0) {
            paridad = "par";
        }
        System.out.println("El resultado es " + resultado + " y es " + paridad);
    }
}