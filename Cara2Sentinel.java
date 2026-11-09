import java.util.Scanner;
public class Cara2Sentinel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai;
        boolean stop = false;

        while (stop == false) {
            System.out.println("Masukan nilai (Ketik -1 untuk selesai) : ");
            nilai = in.nextInt();

            if (nilai == -1) {
                stop = true;
            }
            else{
                System.out.println("Nilai mahasiswa: " + nilai);
            }
        }

        System.out.println("Program selesai");
        in.close();
    }
}
