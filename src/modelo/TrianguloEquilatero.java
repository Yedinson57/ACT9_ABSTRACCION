// Esta sera la clase Triangulo Equilatero en la que calcularemos el area de esta figura geometrica
package modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase Triangulo
public class TrianguloEquilatero extends Triangulo {
    
    // Definimos los atributos
    private double lado;

    // Establecemos un constructor y definimos la medida de sus lados
    public TrianguloEquilatero(double lado){
        super((Math.sqrt(3)/2)*lado,lado,"Triangulo Equilatero");
        this.lado = lado;
    }
    
    // Realizamos la operacion para calcular el Area del Triangulo Equilatero
    @Override
    public double calcularArea(){
        return (Math.sqrt(3)/4)*Math.pow(lado, 2);
    }
}
