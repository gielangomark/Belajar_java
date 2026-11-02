import java.util.Scanner;
public class RM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahAyamBakar = 0;
        int jumlahAyamGoreng = 0; //int menggunakan 0
        int jumlahEsteh = 0;
        int totalHarga = 0;
        String pilihan = null; //null dipakai untuk string
        String bonus = null;

        System.out.println("========== Rumah Makan Sedap =========");
        System.out.println("Berikut adalah pilihan menu");
        System.out.println("A. Ayam Bakar");
        System.out.println("b. Ayam Goreng");
        System.out.println("C. Es teh manis");
        System.out.println("Silahkan pilih menu yang kamu inginkan (a/b/c)");
        pilihan = in.nextLine();
        
        switch (pilihan) {
            case "a":
                System.out.println("Masukan jumlah ayam bakar yang diinginkan");
                jumlahAyamBakar = in.nextInt();
                if (jumlahAyamBakar >= 3) {
                    bonus = "dan mendapat bonus Es Teh manis";
                }
                else 
                {
                    bonus = "";
                }
                totalHarga = jumlahAyamBakar * 16000;
                System.out.println("Total belanjaan Kamu adalah " + totalHarga + " " + bonus);
                break;

            case "b":
                System.out.println("Masukan jumlah ayam Goreng yang diinginkan");
                jumlahAyamGoreng = in.nextInt();
                if (jumlahAyamGoreng >= 5) {
                    bonus = "dan mendapat bonus Jus melon";
                }
                else 
                {
                    bonus = "";
                }
                totalHarga = jumlahAyamGoreng * 15000;
                System.out.println("Total belanjaan Kamu adalah " + totalHarga + " " + bonus);
                break;

            case "c":
                System.out.println("Masukan jumlah esteh manis yang diinginkan");
                jumlahEsteh = in.nextInt();
                bonus = "";
                totalHarga = jumlahEsteh * 3000;
                System.out.println("Total belanjaan Kamu adalah Rp." + totalHarga + " " + bonus);
                break;
        
            default:
                if (pilihan.isEmpty()) {
                    System.out.println("Pilihan tidak boleh kosong");
                }
                else
                {
                    System.out.println("Pilihan tidak valid");
                }
                break;  
        }

    }
}
