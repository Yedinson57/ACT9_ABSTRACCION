//
package modelo;

/**
 *
 * @author Yedinson
 */
public abstract class FiguraGeometrica {
    
    //Declaramos los atributos
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    abstract double calcularArea();
    
    public void mostrarInfo(){
        System.out.println("Figura " +nombre);
    }
    
    public static void main(String[] args) {
        
        FiguraGeometrica Circulo = new Circulo(5, "Circulo");
        FiguraGeometrica Rectangulo = new Rectangulo(6, 4,"Rectangulo");
        FiguraGeometrica Equilatero = new TrianguloEquilatero (5);
        FiguraGeometrica Isosceles = new TrianguloIsosceles (5,6);
        FiguraGeometrica Escaleno = new TrianguloEscaleno (7,6,5);

        Circulo.mostrarInfo();
        System.out.println("Area: " + Circulo.calcularArea());
        System.out.println();

        Rectangulo.mostrarInfo();
        System.out.println("Area: " + Rectangulo.calcularArea());
        System.out.println();

        Equilatero.mostrarInfo();
        System.out.println("Area: " + Equilatero.calcularArea());
        System.out.println();
        
        Isosceles.mostrarInfo();
        System.out.println("Area: " + Isosceles.calcularArea());
        System.out.println();
        
        Escaleno.mostrarInfo();
        System.out.println("Area: " + Escaleno.calcularArea());
        System.out.println();
    }
            
}
