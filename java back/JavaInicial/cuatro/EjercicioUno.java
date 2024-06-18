package cuatro;

import java.util.Scanner;

public class EjercicioUno {

  public static void main(String[] args) {
    
    Scanner sc;
    sc = new Scanner(System.in);

    System.out.println("Ingrese Nombre y dos números");

    String nombre = sc.nextLine();
    int nro1 = sc.nextInt();
    int nro2 = sc.nextInt();

    System.out.println("Calcular: " + calcular(nro1, nro2));
    System.out.println("Hola " + nombre);
    System.out.println("La suma de los nros es de : " + (nro1 + nro2) );
  }

  public static int calcular(int a , int b) {
    return a + b;
  }

}
