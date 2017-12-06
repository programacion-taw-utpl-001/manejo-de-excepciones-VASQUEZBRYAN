/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author Salas
 */
public class Estudiante {
    // creamos las variables 
    private String nombre;
    private String apellido;

   // creamos el constructor 
    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // creamos los metodos set y get 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
// creamos el tuString 
    @Override
    public String toString() {
        return String.format("%s %s", this.getNombre(), this.getApellido());
    }
}