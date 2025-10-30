// Definimos la clase Triangulo, teniendo en cuenta de que ese trata de una clase abstracta
package modelo;

/**
 *
 * @author Yedinson
 */
// Defino la clase Triangulo como abstracta y hago extensible de la clase FiguraGeometrica
public abstract class Triangulo extends FiguraGeometrica {
    
    // Definimos los atributos
    public double base;
    public double altura;

    // Establecemos un constructor
    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    } 
    
    // Creamos el metodo abstracto
    @Override
    public abstract double calcularArea();
}

