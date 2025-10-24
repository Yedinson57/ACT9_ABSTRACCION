//
package modelo;

/**
 *
 * @author Yedinson
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
