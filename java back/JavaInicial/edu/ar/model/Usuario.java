package edu.ar.model;

public class Usuario {

  //definimos atributos
  public String nombre;
  public String email;
  public int edad;

  //Constructor
  public Usuario(){
  }

  //Definimos Constructor
  public Usuario(String no, String em, int ed) {
    this.nombre = no;
    this.email = em;
    this.edad = ed;
  }

  //Ingresar una pelicula
  public boolean ingresarPelicula() {
    return true;
  }

  @Override
  public String toString() {
    return "Usuario [nombre=" + nombre + ", email=" + email + ", edad=" + edad + "]";
  }

  

}
