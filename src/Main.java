import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vektor vektor = new Vektor(12,15,18);

        System.out.println(vektor.vectorLength());
        System.out.println(Vektor.crossProductOfVectors(new Vektor(3,5,7 ), new Vektor(5,7,3)));
        System.out.println(Vektor.scalarProduct(new Vektor(3,5,7), new Vektor(7,3,5)));
        System.out.println(Vektor.angleBetwenVectors(new Vektor(3,5,7 ), new Vektor(5,7,3)));
        System.out.println(Vektor.sumVectors(new Vektor(3,5,7), new Vektor(7,3,5)));
        System.out.println(Vektor.differenceVectors(new Vektor(3,5,7), new Vektor(7,3,5)));
        System.out.println(Vektor.vektorList(5).toString());
    }
}
