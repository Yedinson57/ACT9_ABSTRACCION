// Definimos la clase FiguraGeometrica, teniendo en cuenta de que ese trata de una clase abstracta
package modelo;

/**
 *
 * @author Yedinson
 */
// Traemos la clase principal y la defino como abstracta
public abstract class FiguraGeometrica {
    
    //Declaramos los atributos
    protected String nombre;

    // Establecemos un constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }
    
    // Creamos el metodo abstracto
    abstract double calcularArea();
    
    // Creamos un atributo para mostrar la información
    public void mostrarInfo(){
        System.out.println("Figura " +nombre);
    }
    
    // Invocamos al metodo principal
    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Circulo
        Circulo Circulo = new Circulo(5, "Circulo");
        
        // Creamos un objeto de la clase Rectangulo
        Rectangulo Rectangulo = new Rectangulo(6, 4,"Rectangulo");
        
        // Creamos un objeto de la clase TrianguloEquilatero
        TrianguloEquilatero Equilatero = new TrianguloEquilatero (5);
        
        // Creamos un objeto de la clase TrianguloIsosceles
        TrianguloIsosceles Isosceles = new TrianguloIsosceles (5,6);
        
        // Creamos un objeto de la clase TrianguloEscaleno
        TrianguloEscaleno Escaleno = new TrianguloEscaleno (7,6,5);

        // Mostramos la informacion en consola
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
