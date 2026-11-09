import java.util.Scanner;
public class TebakkataSentinel {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       String jawaban;
       int jumlahJawab = 0;
       boolean jawabanBenar = false;

       while ( jawabanBenar == false) {
        System.out.println("Ketika ingin makan tempat apa yang sering orang kunjungi ketika akhir bulan? ");
        jawaban = in.next();

        if (jawaban.equalsIgnoreCase("Warteg")) {
            jawabanBenar = true;
            System.out.println("Jawaban anda benar");
        }
        else{
            jumlahJawab++;
            System.out.println("Jawabannya salah");
            System.out.println("Anda sudah menjawab " + jumlahJawab + " Kali");
        }
       }
       System.out.println("Program selesai");
       in.close();
    }
}
