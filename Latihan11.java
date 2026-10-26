import  java.util.Scanner;
public class Latihan11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int umur = 0;
        System.out.println("Masukan umur kamu");
        umur = in.nextInt();

        if(umur >= 17 && umur < 20) 
        {
            System.out.println("Kamu bisa membuat ktp");
        }
        else if (umur > 20) {
            System.out.println("Kamu terlalu tua");
        }
        else
        {
            System.out.println("Kamu belum legal");
        }
    }
}
