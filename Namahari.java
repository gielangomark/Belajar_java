import  java.util.Scanner;
public class Namahari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan angka anda");
        int angkaHari = in.nextInt();

        if(angkaHari == 1)
        {
            System.out.println("Senin");
        }
        else if (angkaHari == 2)
        {
            System.out.println("Selasa");
        }
        else if (angkaHari == 3)
        {
            System.out.println("Rabu");
        }
        else if (angkaHari == 4)
        {
            System.out.println("Kamis");
        }
        else if (angkaHari == 5)
        {
            System.out.println("Jumat");
        }
        else if (angkaHari == 6)
        {
            System.out.println("Sabtu");
        }
        else if (angkaHari == 7)
        {
            System.out.println("Minggu");
        }
        else 
        {
            System.out.println("Angka Tidak valid");
        }
        in.close();
    }
}
