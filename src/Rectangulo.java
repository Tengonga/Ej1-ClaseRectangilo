public class Rectangulo {
    // Atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public double calcularArea(double base, double altura){
        return base*altura;
    }
    public double calcularPerimetro(double base, double altura){
        return 2*(base + altura);
    }

}
