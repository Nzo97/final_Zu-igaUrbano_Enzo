/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import modelo.PasajeroArreglo;


/**
 *
 * @author enzol
 */
public class Vuelo {
    private String codigo;
    private String fecha;
    private String hora;
    private int puertaEmbarque;
    private boolean activo;
    
    private String ciudadsal;
    private String ciudadlle;
    private String aeropuertosal;
    private String aeropuertolle;
    
    private PasajeroArreglo[] pasajeros;

    public String getCiudadsal() {
        return ciudadsal;
    }

    public String getCiudadlle() {
        return ciudadlle;
    }

    public String getAeropuertosal() {
        return aeropuertosal;
    }

    public String getAeropuertolle() {
        return aeropuertolle;
    }

    public PasajeroArreglo[] getPasajeros() {
        return pasajeros;
    }
    
    
   
    
    
}
