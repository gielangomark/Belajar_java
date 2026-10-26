import java.util.Scanner;
public class JumlahHari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hari = 0;
        boolean validation = true;
        System.out.println("Masukan bulan (Januari - Desember)");
        String bulan = in.nextLine();

        switch (bulan) {
            case "Januari": case "Maret" : case "Mei" : case "Juli" : case "Agustus": case "Oktober":
                case "Desember" :
                    hari = 31;
                break;
                case "Februari":
                    hari = 28;
                break;
                case "April" : case "Juni" : case "September" : case "November" :
                   hari = 30;
                    break;
        
            default:
                validation = false;
                System.out.println("input tidak sesuai");
                break;
        }

        if(validation == true)
        {
            System.out.println(hari + " Hari");
        }
    }
}
