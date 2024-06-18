package tres;

public class Condicional {

  public static void main(String[] args) {
    System.out.println("******************");
    System.out.println(validarFichaje());
    //System.out.println(calificar(10));
    //System.out.println("Es Estreno ? : " +  isEstreno(2023) );
    System.out.println("******************");
  }

  public static String calificar(int nota) {

    String calificacion = "";

    if(nota < 5) {
      calificacion = "Suspenso";
    }
    else if( nota == 5) {
      calificacion = "Aprobado";
    }
    else if( nota == 6) {
      calificacion = "Bien";
    }
    else if( nota == 7 || nota == 8) {
      calificacion = "Notable";
    }
    else if( nota == 9) {
      calificacion = "Sobresaliente";
    }
    else if (nota == 10) {
      calificacion = "Matrícula de Honor";
    }
    else {
      calificacion = "Ingrese una nota válida";
    }
    return calificacion;
  }

  //Crea una estructura del tipo Switch para hacer el mismo ejercicio.

  //Operador ternario;
  public static String esMayor() {
    int edad = 17;
    String chequearEdad = (edad > 17) ? "Es Mayor" : "Es Menor";
    return chequearEdad;
  }
  //Cambiar el seteo de la edad por parametros

  public String isMayor2() {
    int edad = 18;
    String msj = "";
    if( edad > 17 ) {
      msj = "Es Mayor";
    } else {
      msj = "Es Menor";
    }
    return msj;
  }

  public static String isEstreno(int anio) {
    String msj ="";
    if(anio != 2024) {
      msj = "No es Estreno";
    } else {
      msj = "Es Estreno";
    }
    return msj;
  }

  //Validar fichaje delantero 
  public static String validarFichaje() {
    int altura = 181;
    int edad = 18;
    String msj ="";

    if(altura >= 180 && edad > 17 ) {
      msj = "Esta contratado";
    }
    else {
      msj = "Queda en lista de espera";
    }
    return msj;
  }

  

}
