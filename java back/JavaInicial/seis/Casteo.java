package seis;

public class Casteo {

  public static void main(String[] args) {
    
    int i = 100;
    long enteroLong = i;

    long nroGrande = 2147483648L;
    int x = (int)nroGrande;

    System.out.println("Equis: " + x);

    double nroDouble = 100.5;

    int y = (int)nroDouble;

    System.out.println("Valor Y : " + y);


    String nroFormulario = "33";

    int nroParseado = Integer.parseInt(nroFormulario);

    int total = nroParseado + 4;

    System.out.println(total);

    int nroEntero = 3;

    String nroString = String.valueOf(nroEntero);

    System.out.println(nroString);

  }

}
