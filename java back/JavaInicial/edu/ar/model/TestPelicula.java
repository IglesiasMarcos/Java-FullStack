package edu.ar.model;

public class TestPelicula {

  public static void main(String[] args) {
    
    Pelicula peliUno = new Pelicula();
    Pelicula peli = new Pelicula(1, "La comunidad del anillo", 2001);

    System.out.println(peli);
    System.out.println(peli.getAnio());
    peli.setAnio(2002);
    System.out.println(peli.getAnio());

    

  }

}
