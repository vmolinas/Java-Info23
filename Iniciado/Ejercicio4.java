package ProgImperativa.Iniciado;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 11;
        int suma = num1 + num2;
        String divisible = "no es divisible";
        if (num1%num2==0){
            divisible = "es divisible";
        }
        System.out.println("La suma es " + suma + " y el primer numero " + divisible + " por el segundo.");
    }
}