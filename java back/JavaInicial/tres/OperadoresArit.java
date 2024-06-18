package tres;

public class OperadoresArit {


  public static void main(String[] args) {
    
    int nroUno = 9;
    int nroDos = 6;

    int total = 0;

    //Suma
    System.out.println("");
    System.out.println("Suma : " + ( nroUno + nroDos ) );
    System.out.println("Resta : " + (nroUno - nroDos));
    System.out.println("Multi : " + (nroUno * nroDos));
    System.out.println("Div : " + (nroUno / nroDos));
    System.out.println("Modulo : " + (nroUno % nroDos));
    System.out.println("Exp : " + Math.pow(nroUno, nroDos));

    int a = 5;

    //a += 5;
    //a = a + 5;

    //a -= 3;
    //a /= 5;
    //a *= 5;

    //a++;
    ++a;
    //--a;
    //a--;
    System.out.println("Valor A : " + a);

    Integer n1 = 2;
    Integer n2 = 2;

    System.out.println("Son iguales : " + n1.equals(n2));

    //Chequear igualdad entre Strings
  }

}
