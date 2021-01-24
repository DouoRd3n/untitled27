import java.util.ArrayList;
import java.util.List;

public class Vektor {
    private double x;
    private double y;
    private double z;


    public Vektor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

//    длина вектора

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }


// скалярное произведение:

    public static double scalarProduct(Vektor vektor1, Vektor vektor2) {
        double x = vektor1.getX() * vektor2.getX();
        double y = vektor1.getY() * vektor2.getY();
        double z = vektor1.getZ() * vektor2.getZ();

        return x + y + z;
    }

    @Override
    public String toString() {
        return "Vektor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    // векторное произведение с другим вектором:
    public static Vektor crossProductOfVectors(Vektor vektor1, Vektor vektor2) {
        double x = vektor1.getY() * vektor2.getZ() - vektor1.getZ() * vektor2.getY();
        double y = vektor1.getZ() * vektor2.getX() - vektor1.getX() * vektor2.getZ();
        double z = vektor1.getX() * vektor2.getY() - vektor1.getY() * vektor2.getX();
        return new Vektor(x, y, z);
    }


// угол между векторами
    public static double angleBetwenVectors(Vektor vektor1, Vektor vektor2) {

//    длина вектора 1
        double a = vektor1.vectorLength();

//    длина вектора 2
        double b = vektor2.vectorLength();

// скалярное произведение vektor1 i vektor2:
        double c = scalarProduct(vektor1, vektor2);
        return c / (a * b);
    }

// Сумма векторов
    public static Vektor sumVectors(Vektor vektor1, Vektor vektor2 ){
        return new Vektor(vektor1.getX()+vektor2.getX(), vektor1.getY()+vektor2.getY(), vektor1.getZ()+vektor2.getZ());
    }
    public static Vektor differenceVectors(Vektor vektor1, Vektor vektor2 ){
        return new Vektor(vektor1.getX()-vektor2.getX(), vektor1.getY()-vektor2.getY(), vektor1.getZ()-vektor2.getZ());
    }

    public static List<Vektor> vektorList(int N){
        List<Vektor> list = new ArrayList<>();
        for (int i = 0; i <N ; i++) {
            double x = Math.random()*100;
            double y = Math.random()*100;
            double z = Math.random()*100;
            list.add(new Vektor(x,y,z));

        } return list;
    }

}
