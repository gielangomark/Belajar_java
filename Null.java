import java.util.Scanner;
public class Null {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = null;

        if (nama == null) {
            System.out.println("Nama  masih null");
        }

        System.out.println("Masukan nama anda");
        nama = in.nextLine();

        if (nama == null || nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong");
        }
        else
        {
            System.out.println("Selamat datang " + nama);
        }
    }
}
