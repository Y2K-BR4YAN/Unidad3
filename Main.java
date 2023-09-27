import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
        
        scanner.close(); // Cerrar el scanner al final
    }
}
