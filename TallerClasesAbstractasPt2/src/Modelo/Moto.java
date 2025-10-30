// Esta sera la clase moto en la que calcularemos el costo de mantenimiento de este vehiculo
package Modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase VehiculoMotorizado
public class Moto extends VehiculoMotorizado {
    
    // Definimos los atributos
    private String tipoMoto;

    // Establecemos un constructor
    public Moto(String nombreVehiculo, String tipoMoto, int cilindraje, String marca, String modelo, int año) {
        super(cilindraje, nombreVehiculo, marca, modelo, año);
        this.tipoMoto = tipoMoto;
    }

    // Getter y Setter
    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    /* Realizamos la operacion teniendo en cuenta la siguiente formula
    en la que mientras mayor sea el cilindraje, mas costoso será el mantenimiento.
    se multiplica el cilindraje por 0.5, como factor proporcional al desgaste del 
    motor y bse suma un costo base fijo, en este caso 200000
    */
    @Override
    double calcularMantinimiento() {
        double costo=(cilindraje*0.5)+200000;
        
        //El metodo devuelve el valor 
        return costo;
    }
    
    // Usamos el atributo mostrarInfo() para mostrar la información del vehiculo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Tipo de Moto: " + tipoMoto);
    }
}
