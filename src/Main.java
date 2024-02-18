import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.println("Introduzca la base: ");
    double base = tec.nextDouble();
    System.out.println("Introduzca la altura: ");
    double altura = tec.nextDouble();

    Rectangulo r1 = new Rectangulo(base,altura);
    System.out.println("El area del rectangulo es: "+r1.calcularArea(base,altura)+" m²");
    System.out.println("El perimetro del rectangulo es: "+r1.calcularPerimetro(base,altura)+" m²");
    tec.close();
    }
}