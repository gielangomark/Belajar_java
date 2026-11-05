import java.util.Scanner;
public class LatihanRepetition2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan angka pertama");
        int a = in.nextInt();
        System.out.println("Masukan angka kedua");
        int b = in.nextInt();

        do{
            System.out.println("(" +a +")");
            a++;
        } while(a <= b);
    }
}
