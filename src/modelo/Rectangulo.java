// Esta sera la clase Rectangulo en la que calcularemos el area de esta figura geometrica
package modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase FiguraGeometrica
public class Rectangulo extends FiguraGeometrica {
    
    // Definimos los atributos
    private double base;
    private double altura;

    // Establecemos un constructor
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Realizamos la operacion para calcular el Area del Rectangulo
    @Override
    public double calcularArea(){
        return base*altura;
    }
}
