/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.biblioteca.interfaces.Libro;
/**
 *
 * @author Ing. en C. David
 */
public class LibroDTO implements Libro{
    private int id;
    private String titulo;
    private String descripcion;
    private int unidadesDisponibles;
    
    @Override
    public String getInformacion() {
        return "\""+this.titulo+"("+this.descripcion+")-"+this.unidadesDisponibles+" unidades disponibles."+"("+this.id+")\"";
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
}
