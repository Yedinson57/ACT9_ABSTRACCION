// Esta sera la clase bus en la que calcularemos el costo de mantenimiento de este vehiculo
package Modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase VehiculoMotorizado
public class Bus extends VehiculoMotorizado {
    
    // Definimos los atributos
    private int capacidadPasajeros;

    // Establecemos un constructor
    public Bus(String nombreVehiculo, int capacidadPasajeros, int cilindraje, String marca, String modelo, int año) {
        super(cilindraje, nombreVehiculo, marca, modelo, año);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    /* Realizamos la operacion teniendo en cuenta la siguiente formula
    Representamos un costo proporcional a la capacidad de pasajeros, entre mas pasajeros
    mayor responsabilidad y mantenimiento, representaremos como ejemplo que
    el costo por pasajero es de 10000, luego lo sumaremos con la multiplicacion
    para calcular la parte del cilindraje
    */
    @Override
    double calcularMantinimiento() {
        double costo = (capacidadPasajeros * 10000) + (cilindraje * 0.5);
        
        //El metodo devuelve el valor 
        return costo;
    }
    
    // Usamos el atributo mostrarInfo() para mostrar la información del vehiculo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Capacidad de Pasajeros: "+capacidadPasajeros );
    }
}
