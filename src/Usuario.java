import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public String apellidos;
    public String dni;
    public ArrayList<Libro> libros_prestados;

    public Usuario(String nombre, String apellidos, String dni, String libros_prestados){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.libros_prestados = new ArrayList<Libro>();
    }

    public void pedirLibro(){

    }

    public void devolverLibro(){

    }
}

