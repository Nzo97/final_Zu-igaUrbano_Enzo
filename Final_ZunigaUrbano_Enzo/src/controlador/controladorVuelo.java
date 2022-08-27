package controlador;

import modelo.*;
import vista.*;

/**
 *
 * @author enzol
 */

public class controladorVuelo {
    private frmVuelo vista;
    private Vuelo modelo;
    
    public controladorVuelo(Vuelo modelo, frmVuelo vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
}
