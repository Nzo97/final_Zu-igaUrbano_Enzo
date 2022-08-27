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
public class Asiento {
    private int nroasiento;
    private char fila;
    private String estado;
    
    public Asiento(int nroasiento, char fila, String estado){
        this.nroasiento = nroasiento;
        this.fila = fila;
        this.estado= estado;
    }

    public int getNroasiento() {
        return nroasiento;
    }

    public void setNroasiento(int nroasiento) {
        this.nroasiento = nroasiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
