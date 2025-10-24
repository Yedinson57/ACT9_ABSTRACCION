//
package modelo;

/**
 *
 * @author Yedinson
 */
public class TrianguloEquilatero extends Triangulo {
    
    private double lado;

    public TrianguloEquilatero(double lado){
        super((Math.sqrt(3)/2)*lado,lado,"Triangulo Equilatero");
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return (Math.sqrt(3)/4)*Math.pow(lado, 2);
    }
}
