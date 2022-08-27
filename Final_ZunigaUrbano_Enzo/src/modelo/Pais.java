/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author enzol
 */
public class Pais {
    private String codigo;
    private String nombre;
    
    private Ciudad[] ciudades;

    public Pais(String codigo, String nombre, Ciudad[] ciudades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudades = ciudades;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
}
