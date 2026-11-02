import java.util.Scanner;
public class LatihanNull {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String namaKendaraan = null;
        int tarif = 0;

        System.out.println("Masukan jenis Kendaraan");
        namaKendaraan = in.nextLine();

        if (namaKendaraan == null || namaKendaraan.isEmpty()) {
            System.out.println("Jenis kendaraan tidak valid");
        }

        switch (namaKendaraan) {
            case "Motor":
                tarif = 5000;
                break;

                case " Mobil" :
                    tarif = 10000;
                    break;

                    case " Truk" :
                        tarif = 15000;
                        break;
            default:
                System.out.println("error");
                break;
        }

        System.out.println("Tarif nya adalah " + tarif);
    }
}
