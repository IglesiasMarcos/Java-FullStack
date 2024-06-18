package cuatro;
import java.util.Scanner;

public class Entrada {

  public static void main(String[] args) {
    
    //Creamos una instancia de Scanner
    Scanner miTeclado;
    miTeclado = new Scanner(System.in);

    //Mensaje para comunicarse con el usuario
    System.out.println("Ingrese Nombre, edad y salario");

    //Guardar los datos que ingresa el usr en variables
    String userName = miTeclado.nextLine();
    int age = miTeclado.nextInt();
    double salary = miTeclado.nextDouble();


    //Por último el sistema muestra los datos que fuimos ingresando
    System.out.println("El nombre de usuario es : " + userName);
    System.out.println("La edad es : " + age);
    System.out.println("El sueldo es de : $" + salary);
  }




}
