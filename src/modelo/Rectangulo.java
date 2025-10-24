//
package modelo;

/**
 *
 * @author Yedinson
 */
public class Rectangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return base*altura;
    }
}
