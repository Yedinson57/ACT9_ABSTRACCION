//
package modelo;

/**
 *
 * @author Yedinson
 */
public class TrianguloIsosceles extends Triangulo {
    
    public TrianguloIsosceles(double base, double altura) {
        super(base, altura, "Triangulo Isosceles");
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}
