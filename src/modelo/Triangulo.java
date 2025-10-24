//
package modelo;

/**
 *
 * @author Yedinson
 */
public abstract class Triangulo extends FiguraGeometrica {
    
    public double base;
    public double altura;

    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    } 
    @Override
    public abstract double calcularArea();
}

