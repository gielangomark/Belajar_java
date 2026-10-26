import java.util.Scanner;
public class BacaInput {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

       System.out.print("Masukkan nama Lengkap kamu: ");
       String nama = scanner.nextLine();
       System.out.println("Nama anda adalah " + nama);

       System.out.print("Masukkan nilai x: ");
       int x = scanner.nextInt();
         System.out.println("Nilai x(interger) yang kamu input adalah " + x);

    
         System.out.print("Masukkan nilai y: ");
         double y = scanner.nextDouble();
         System.out.println("Nilai y(double) yang kamu input adalah " + y);
         scanner.close();
    }
}
