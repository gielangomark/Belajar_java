import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan angka anda (1 - 12) ");
        int angkaBulan = in.nextInt();

        if (angkaBulan == 1)
        {
            System.out.println("31 hari");
        }
        else if ( angkaBulan == 2)
        {
            System.out.println("28 Hari");
        }
        else if ( angkaBulan == 3)
        {
            System.out.println("31 Hari");
        }
        else if ( angkaBulan == 4)
        {
            System.out.println("30 Hari");
        }
        else if ( angkaBulan == 5)
        {
            System.out.println("31 Hari");
        }
        else if ( angkaBulan == 6)
        {
            System.out.println("30 Hari");
        }
        else if ( angkaBulan == 7)
        {
            System.out.println("31 Hari");
        }
        else if ( angkaBulan == 8)
        {
            System.out.println("31 Hari");
        }
        else if ( angkaBulan == 9)
        {
            System.out.println("30 Hari");
        }
        else if ( angkaBulan == 10)
        {
            System.out.println("31 Hari");
        }
        else if ( angkaBulan == 11)
        {
            System.out.println("30 Hari");
        }
        else if ( angkaBulan == 12)
        {
            System.out.println("31 Hari");
        }
        else {
            System.out.println("Angka Tidak Valid");
        }

        in.close();
    }
}
