import  java.util.Scanner;
public class Days2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Masukan angka anda (1 - 12) ");
        int angkaBulan = in.nextInt();

        if (angkaBulan == 1 || angkaBulan == 3 || angkaBulan == 5 || angkaBulan == 7 || angkaBulan == 8 || angkaBulan == 10 
            || angkaBulan == 12)
            {
                System.out.println("31 Hari");
            }
        else if (angkaBulan == 4 || angkaBulan == 6 || angkaBulan == 9 || angkaBulan == 11)
        {
            System.out.println("30 Hari");
        }
        else if (angkaBulan == 2)
        {
            System.out.println("28 Hari");
        }
        else {
            System.out.println("Error");
        }
         
    }
}
