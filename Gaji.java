import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = "";
        String perusahaan = "Gamestudio";
        int hariKerja = 0;
        int jamLembur = 0;
        int tarifGaji = 0;
        int tarifLembur = 0;
        int totalGaji = 0;
        System.out.print("Masukkan Nama Karyawan : ");
        nama = in.nextLine();
        System.out.print("Masukkan Jumlah Hari Kerja : ");
        hariKerja = in.nextInt();
        System.out.print("Masukkan Jumlah Jam Lembur : ");
        jamLembur = in.nextInt();
        in.close();
        tarifGaji = 300000 *hariKerja;
        tarifLembur = 50000 * jamLembur;
    

        totalGaji = tarifGaji + tarifLembur;

        System.out.println("========= Slip Gaji Karyawan =========");
        System.out.println("============= Data Karyawan =============");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Perusahaan : " + perusahaan);
        System.out.println("\n");
        System.out.println("========== jumlah hari kerja dan jam lembur ==========");
        System.out.println("Hari Kerja : " + hariKerja);
        System.out.println("Jam Lembur : " + jamLembur);
        System.out.println("\n");
        System.out.println("========== Rincian Gaji Karyawan ==========");
        System.out.println("Gaji Pokok : " + tarifGaji);
        System.out.println("Gaji Lembur : " + tarifLembur);
        System.out.println("\n");
        System.out.println("========== Total Gaji Karyawan ==========");
        System.out.println("Total Gaji : " + totalGaji);
        System.out.println("\n");
        System.out.println("=======Terima Kasih========");

    }
}