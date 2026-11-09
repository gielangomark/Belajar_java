import java.util.Scanner;
public class Cara1Sentinel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai;

        System.out.println("Masukan nilai (-1 untuk berhenti) :");
        nilai = in.nextInt();

        while (nilai != -1) {
            System.out.println("Nilai mahasiswa " + nilai);
            System.out.println("Masukan nilai (-1 untuk berhenti) :");
            nilai = in.nextInt();
        }
        System.out.println("Program Selesai");
        in.close();
    }
}
