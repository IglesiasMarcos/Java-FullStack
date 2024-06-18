package edu.ar.model;

public class TestUsuario {

  public static void main(String[] args) {
    //Creamos una instancia / copia de Usuario.java
    Usuario miUsuario = new Usuario("Julio", "iglesias@gmail.com", 80);
    Usuario miUsuario2 = new Usuario();

    System.out.println(miUsuario);
  }


}
