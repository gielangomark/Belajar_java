import java.util.Scanner;
public class contohifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai anda : ");
        double nilai = input.nextDouble();
        if (nilai >= 80 && nilai == 100)
        {
            System.out.println("Nilai anda A");
        }
        else if (nilai >= 70 && nilai <= 79.99)
        {
            System.out.println("Nilai anda B");
        }
       else if (nilai >= 60 && nilai <= 69.99)
       {
            System.out.println("Nilai anda C");
       }
       else if (nilai >= 50 && nilai <= 59.99)
       {
            System.out.println("Nilai anda D");
       }
         else
        {
            System.out.println("Nilai anda E");
        }
        input.close();
    }
    
}
