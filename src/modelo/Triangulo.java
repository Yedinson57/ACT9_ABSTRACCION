//
package modelo;

/**
 *
 * @author Yedinson
 */
public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}
