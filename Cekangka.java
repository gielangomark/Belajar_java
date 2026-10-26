import java.util.Scanner;
public class Cekangka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukan angka yang anda inginkan");
        int angka = in.nextInt();

        if(angka == 0)
        {
            System.out.println("angka adalah 0");
        }
        else if (angka > 0)
        {
            System.out.println("Angka adalah bilangan positif");
        }
        else 
        {
            System.out.println("Angka adalah bilangan negatif");
        }

        in.close();
    }
}
