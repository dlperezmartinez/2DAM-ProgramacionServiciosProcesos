package UD1.EjercicioPropuesto3;

import java.util.ArrayList;

public class Usuarios
{
    //ATRIBUTOS
    String nombre, apellido1, apellido2, DNI, telefono;
    int codigo;
    ArrayList<Libros> librosPrestados;

    //CONSTRUCTOR
    public Usuarios(String nombre, String apellido1, String apellido2, String DNI, String telefono, int codigo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
        this.telefono = telefono;
        this.codigo = codigo;
        this.librosPrestados = null;
    }

    //Constructor copia
    public Usuarios(Usuarios user) {
        this.nombre = user.nombre;
        this.apellido1 = user.apellido1;
        this.apellido2 = user.apellido2;
        this.DNI = user.DNI;
        this.telefono = user.telefono;
        this.codigo = user.codigo;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //METODOS
    public void prestarLibros(Libros libro)
    {
        librosPrestados.add(libro);
    }

    //PRINT
    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", DNI='" + DNI + '\'' +
                ", telefono='" + telefono + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
