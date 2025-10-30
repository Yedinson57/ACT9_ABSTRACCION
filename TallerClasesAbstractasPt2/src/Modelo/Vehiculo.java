//Definimos la clase Vehiculo, teniendo en cuenta de que ese trata de una clase abstracta
package Modelo;

/**
 *
 * @author Yedinson 
 */
// Traemos la clase principal y la defino como abstracta
public abstract class Vehiculo {
    
    // Declaramos los atributos
    protected String nombreVehiculo;
    private String marca;
    private String modelo;
    private int año;

    // Insertamos un constructor
    public Vehiculo(String nombreVehiculo, String marca, String modelo, int año) {
        this.nombreVehiculo = nombreVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Getter y Setter
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }
    
    // Declaramos el metodo abstracto
    // Era mantenimiento pero si lo cambio de nombre no me funciona el proyecto :[
    abstract double calcularMantinimiento();
    
    // Creamos un atributo para mostrar la informacion
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombreVehiculo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Anio: "+ año);
    }
    
    // Invocamos al metodo principal
    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Carro
        Carro carro = new Carro("Carro ", "GASOLINA", 1800, "Toyota", "Corolla", 2022);
        
        // Creamos un objeto de la clase Moto
        Moto moto = new Moto("Moto ","Deportiva", 150, "Yamaha", "Fz", 2021);
        
        // Creamos un objeto de la clase Bus
        Bus bus = new Bus("Bus ",19,3000, "Mercedes", "Sprinter",2019);
        
        //Mostramos la información en consola
        carro.mostrarInfo();
        System.out.println("Costo del Mantenimiento: " + carro.calcularMantinimiento());
        System.out.println();
        
        moto.mostrarInfo();
        System.out.println("Costo del Mantenimiento: " + moto.calcularMantinimiento());
        System.out.println();
        
        bus.mostrarInfo();
        System.out.println("Costo del Mantenimiento: " + bus.calcularMantinimiento());
        System.out.println();
    }
}
