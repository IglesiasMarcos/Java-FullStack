package edu.ar.model;

public class Pelicula {

  //atributos de clase
  private int id;
  private String titulo;
  private int anio;
  private String genero;
  private String descripcion;
  private double calificacion;
  private int estrellas;

  //constructores

  public Pelicula(){}

  public Pelicula(int id, String titulo, int anio, String genero, String descripcion, double calificacion,
      int estrellas) {
    this.id = id;
    this.titulo = titulo;
    this.anio = anio;
    this.genero = genero;
    this.descripcion = descripcion;
    this.calificacion = calificacion;
    this.estrellas = estrellas;
  }

  public Pelicula(int id, String titulo, int anio) {
    this.id = id;
    this.titulo = titulo;
    this.anio = anio;
  }

  //métodos getters y setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getCalificacion() {
    return calificacion;
  }

  public void setCalificacion(double calificacion) {
    this.calificacion = calificacion;
  }

  public int getEstrellas() {
    return estrellas;
  }

  public void setEstrellas(int estrellas) {
    this.estrellas = estrellas;
  }

  //métodos personalizados
  @Override
  public String toString() {
    return "Pelicula [id=" + id + ", titulo=" + titulo + ", anio=" + anio + ", genero=" + genero + ", descripcion="
        + descripcion + ", calificacion=" + calificacion + ", estrellas=" + estrellas + "]";
  }
  



  

  
}
