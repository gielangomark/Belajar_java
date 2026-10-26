import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = "";
       double asasment = 0;
       double uas = 0;
       double tugas = 0;
       double nilaiAkhir = 0;
       String Keterangan;

       System.out.print("Masukkan Nama : ");
       nama = in.nextLine();
       System.out.print("Masukkan Nilai Asasment : ");
       asasment = in.nextDouble();
         System.out.print("Masukkan Nilai UAS : ");
       uas = in.nextDouble();
         System.out.print("Masukkan Nilai Tugas : ");
       tugas = in.nextDouble();

       Keterangan = nilaiAkhir >= 60 ? "Tidak lulus" : "Lulus";

        nilaiAkhir = (asasment * 0.3) + (uas * 0.5) + (tugas * 0.2);

         System.out.println("========= Nilai Mahasiswa =========");
         System.out.println("Nama : " + nama); 
         System.out.println("Asasment : " + asasment);
         System.out.println("UAS : " + uas);
         System.out.println("Tugas : " + tugas);
         System.out.println("==========================");
         System.out.println("Nilai Akhir : " + nilaiAkhir);
         System.out.println("Keterangan : " + Keterangan);
         
        in.close();
    }
}
