//
package modelo;

/**
 *
 * @author Yedinson
 */
public class TrianguloEscaleno extends Triangulo{
    
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public TrianguloEscaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoB, ladoA, "Triangulo Escaleno");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea(){
        
        double s = (ladoA + ladoB + ladoC)/2;
        
        return Math.sqrt(s * (s-ladoA)*(s-ladoB)*(s-ladoC));
    }
}
