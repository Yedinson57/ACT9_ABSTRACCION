//
package modelo;

/**
 *
 * @author Yedinson
 */
public abstract class FiguraGeometrica {
    
    //Declaramos los atributos
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
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
        FiguraGeometrica Triangulo = new Triangulo(5, 3, "Triangulo");

        Circulo.mostrarInfo();
        System.out.println("Area: " + Circulo.calcularArea());
        System.out.println();

        Rectangulo.mostrarInfo();
        System.out.println("Area: " + Rectangulo.calcularArea());
        System.out.println();

        Triangulo.mostrarInfo();
        System.out.println("Area: " + Triangulo.calcularArea());
    }
            
}
