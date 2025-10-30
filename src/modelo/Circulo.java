// Esta sera la clase circulo en la que calcularemos el area de esta figura geometrica
package modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase FiguraGeometrica
public class Circulo extends FiguraGeometrica {
    
    // Definimos los atributos
    private double radio;

    // Establecemos un constructor
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Realizamos la operacion para calcular el Area del circulo
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
