import java.util.Scanner;
public class EsTehManisSentinel {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean sudahManis = false;
    int gula = 0;
    String Jawaban;

    while (sudahManis == false) {
        System.out.println("Apakah es teh sudah manis? (ya/tidak): ");
        Jawaban = in.nextLine();

        if (Jawaban.equalsIgnoreCase("ya")) {
            sudahManis = true;
        }
        else{
            gula++;
            System.out.println("Menambahkan gula 1 sendok");
            System.out.println("Jumlah gula: " + gula);
        }
    }

    System.out.println("Es teh sudah manis");
    System.out.println("Total gula ditambahkan : " + gula);
    in.close();
    }
}
