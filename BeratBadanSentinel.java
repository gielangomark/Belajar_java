import java.util.Scanner;
public class BeratBadanSentinel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double berat = 0;
        boolean stop = false;
        int jumlahKurus = 0;
        int jumlahIdeal = 0;
        int jumlahgemuk = 0;


        while (berat >= 0) {
            System.out.println("masukan berat badan anda : ");
            berat = in.nextDouble();

            if (berat >= 0 && berat < 50) {
                System.out.println("Berat badan anda adalah " + berat + " kg");
                System.out.println("Kurus");
                jumlahKurus++;
            }
            else if (berat >= 50 && berat <=70) {
                System.out.println("Berat badan anda adalah " + berat + "KG");
                System.out.println("Anda ideal");
                jumlahIdeal++;
            }
            else if(berat > 70){
                System.out.println("Berat badan anda adalah " + berat + "KG");
                System.out.println("Anda Gemuk");
                jumlahgemuk++;
            }
        }
            System.out.println("=============");
            System.out.println("Jumlah badan kurus : " + jumlahKurus);
            System.out.println("jumlah badan ideal " + jumlahIdeal);
            System.out.println("jumlah badan gemuk " + jumlahgemuk);
        System.out.println("Program selesai");
        in.close();
    }
}
