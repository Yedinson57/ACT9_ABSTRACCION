//Definimos la clase Vehiculo, teniendo en cuenta de que ese trata de una clase abstracta
package Modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase Vehiculo
public abstract class VehiculoMotorizado extends Vehiculo {
    
    // Declaramos los atributos
    protected int cilindraje;

    // Establecemos un constructor
    public VehiculoMotorizado(int cilindraje, String nombreVehiculo, String marca, String modelo, int año) {
        super(nombreVehiculo, marca, modelo, año);
        this.cilindraje = cilindraje;
    }

    // Getter y Setter
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}
