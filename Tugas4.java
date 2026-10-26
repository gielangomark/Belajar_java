import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hargaPulpen = 20000;
        int hargaKertas = 30000;
        int hargaAmplop = 17500;
        int jumlahPulpen = 0;
        int jumlahKertas = 0;
        int jumlahAmplop = 0;
        int totalPulpen = 0;
        int totalKertas = 0;
        int totalAmplop = 0;
        int totalHarga = 0;
        int uangTunai = 0;
        int uangKembali = 0;

        System.out.println("Masukan nomor Nota : ");
        int nomorNota = in.nextInt();
        System.out.print("Masukkan Jumlah Pulpen (box) : ");
        jumlahPulpen = in.nextInt();
        System.out.print("Masukkan Jumlah Kertas (rim) : ");
        jumlahKertas = in.nextInt();
        System.out.print("Masukkan Jumlah Amplop (box) : ");
        jumlahAmplop = in.nextInt();
        System.out.println("\n");

        totalPulpen = hargaPulpen * jumlahPulpen;
        totalKertas = hargaKertas * jumlahKertas;
        totalAmplop = hargaAmplop * jumlahAmplop;
        totalHarga = totalPulpen + totalKertas + totalAmplop;

        System.out.println("============= Nota Pembelian =================");
        System.out.println("Nomor Nota : " + nomorNota);
        System.out.println("+-----------------------------------------+");
        System.out.println("| Barang | Jumlah | Harga Satuan | Total |");
        System.out.println("+-----------------------------------------+");
        System.out.println("| Pulpen | " + jumlahPulpen + "      | " + hargaPulpen + "       | " + totalPulpen + "   |");
        System.out.println("| Kertas | " + jumlahKertas + "      | " + hargaKertas + "       | " + totalKertas + "   |");
        System.out.println("| Amplop | " + jumlahAmplop + "      | " + hargaAmplop + "       | " + totalAmplop + "   |");
        System.out.println("+-----------------------------------------+");
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("===============================================");
        System.out.print("Masukkan Uang Tunai : ");
        uangTunai = in.nextInt();
        uangKembali = uangTunai - totalHarga;
        System.out.println("Uang Kembali : " + uangKembali);
        System.out.println("Terima kasih telah berbelanja di toko kami!");
        in.close();
    }
}
