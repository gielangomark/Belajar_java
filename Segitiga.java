import java.util.Scanner;
public class Segitiga {
 public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        double alas = 0;
        double tinggi = 0;
        double luas = 0;

        System.out.print("Masukkan Alas : ");
        alas = in.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        tinggi = in.nextDouble();

        luas = 0.5 * alas * tinggi;
        

        System.out.println("Luas Segitiga Adalah " + luas);
        in.close();
    }
}
