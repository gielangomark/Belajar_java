import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        System.out.print("Masukkan umur anda : ");
        int age = asd.nextInt();
       System.out.println("Umur anda adalah : " + age);
       if (age < 17) {
          if (age < 10) {
            System.out.println("Anda masih anak kecil");
          }
          else {
            System.out.println("Anda masih remaja,jangan nakal nakal ya nak");
          }
        } 
        else {
            System.out.println("Anda Sudah Dewasa,ingat umur");
        }

        System.out.println("Umur hanyalah sebuah angka");
        asd.close();
} 
}