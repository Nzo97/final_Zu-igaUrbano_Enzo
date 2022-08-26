
package datos;

import modelo.AerolineaArreglo;
import modelo.PaisArreglo;
import modelo.AeropuertoArreglo;
import modelo.PasajeroArreglo;
public class Repositorio {
    public static PaisArreglo paises = new PaisArreglo(10);
    public static AeropuertoArreglo aeropuertos = new AeropuertoArreglo(10);
    public static PasajeroArreglo pasajeros = new PasajeroArreglo(100);
    public static AerolineaArreglo aerolineas = new AerolineaArreglo(10);
}
