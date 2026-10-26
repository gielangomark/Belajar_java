import java.util.Scanner;
public class Balok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 0;
        int l = 0;
        int t = 0;
        int volume = 0;
        int Lp = 0;
        System.out.print("Masukkan Panjang Balok : ");
        p = in.nextInt();

        System.out.print("Masukkan Lebar Balok : ");
        l = in.nextInt();

        System.out.print("Masukkan Tinggi Balok : ");
        t = in.nextInt();

        volume = p * l * t;
        Lp = 2 * (p * l) + 2 * (p * t) + 2 * (l * t);
        // atau bisa juga pake 2 * (p * l + p * t + l * t);
        // agar lebih gampang pengerjaannya

        System.out.println("Volume Baloknya adalah = " + volume);
        System.out.println("Luas Permukaan Baloknya adalah = " + Lp);
        in.close();
    }
}
