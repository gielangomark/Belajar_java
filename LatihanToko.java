import java.util.Scanner;;
public class LatihanToko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalBelanja = 0;
        double totalDiskon = 0;
        double totalBayar = 0;
        String jenisPelanggan = null;

        if (jenisPelanggan == null) {
            System.out.println("Jenis pelanggan tidak boleh kosong");
        }

        System.out.println("masukan jenis pelanggan");
        jenisPelanggan = in.nextLine();

        if (jenisPelanggan == null || jenisPelanggan.isEmpty()) {
            System.out.println("Data tidak valid");
        }
        else
        {
            System.out.println(" Masukan total belanjanya");
            totalBelanja = in.nextDouble();
        }
        
        if (jenisPelanggan.equalsIgnoreCase("Member") && totalBelanja > 500000) {
            totalDiskon = totalBelanja- (totalBelanja * 0.10);
            System.out.println("Total belanja nya adalah = " + totalDiskon);
        }
        else if (jenisPelanggan.equalsIgnoreCase("VIP") && totalBelanja > 300000){
            totalDiskon = totalBelanja - (totalBelanja * 0.15);
            System.out.println("Total belanja adalah = " + totalDiskon);
        }
        else if (jenisPelanggan.equalsIgnoreCase("Guest") && totalBelanja < 100000) {
            System.out.println("Total belanja anda adalah " + totalBelanja);
        }
        else {
            System.out.println("Tidak valid");
        }
    }
}
