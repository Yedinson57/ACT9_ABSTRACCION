// Esta sera la clase Triangulo Isosceles en la que calcularemos el area de esta figura geometrica
package modelo;

/**
 *
 * @author Yedinson
 */
// Hago extensible de la clase Triangulo
public class TrianguloEscaleno extends Triangulo{
    
    // Definimos los atributos
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Establecemos un constructor y definimos la medida de sus lados
    public TrianguloEscaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoB, ladoA, "Triangulo Escaleno");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Realizamos la operacion para calcular el Area del Triangulo Equilatero
    @Override
    public double calcularArea(){
        
        double s = (ladoA + ladoB + ladoC)/2;
        
        return Math.sqrt(s * (s-ladoA)*(s-ladoB)*(s-ladoC));
    }
}
