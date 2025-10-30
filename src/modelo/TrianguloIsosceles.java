// Esta sera la clase Triangulo Isosceles en la que calcularemos el area de esta figura geometrica
package modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase Triangulo
public class TrianguloIsosceles extends Triangulo {
    
    // Esta subclase hereda los atributos de clase Triangulo (base, altura)
    
    // Establecemos un constructor
    public TrianguloIsosceles(double base, double altura) {
        super(base, altura, "Triangulo Isosceles");
    }
    
    // Realizamos la operacion para calcular el Area del Triangulo Isosceles
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}
