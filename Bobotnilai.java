import java.util.Scanner;
public class Bobotnilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean validation = true;
        double nilai = 0;
        System.out.println("Masukan bobot nilai");
        String bobot = in.nextLine();

        switch (bobot) {
            case "A":
                nilai = 4.00;
                break;
        
             case "A-":
                nilai = 3.67;
                break;

             case "B+":
                nilai = 3.33;
                break;

             case "B":
                nilai = 3.00;
                break;

             case "B-":
                nilai = 2.50;
                break;

             case "C":
                nilai = 2.00;
                break;

             case "D":
                nilai = 1.00;
                break;

            case "E":
                nilai = 0.00;
                break;

            default:
                validation = false;
                System.out.println("Pilihan tidak ada");
                break;
        }

        if(validation == true)
            {
           System.out.println("Nilai kamu adalah " + nilai);
        }
       
    }
}
