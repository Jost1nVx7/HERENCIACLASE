/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.clases;

/**
 *
 * @author SO-LAB-PC6
 */
public class Profesor extends Persona{
    private String id;
    private String titulo;

    public Profesor(String id, String titulo, String nombre, String apellido, String cedula, int edad, String genero) {
        super(nombre, apellido, cedula, edad, genero);
        this.id = id;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Profesor{" + "id=" + id + ", titulo=" + titulo + '}';
    }


    
}
