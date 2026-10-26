import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka1 = 0;
        int angka2 = 0;
        String operator = "";
        int hasil = 0;
        boolean validation = true;

        System.out.println("Masukan angka Pertama");
        angka1 = in.nextInt();

        System.out.println("Masukan angka Kedua");
        angka2 = in.nextInt();

        System.out.println("Masukan Operator (-,+,*,/)");
        operator = in.next();

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;

            case "-":
                hasil = angka1 - angka2;
                break;

             case "*":
                hasil = angka1 * angka2;
                break;

             case "/":
                hasil = angka1 / angka2;
                break;
        
            default:
                validation = false;
                System.out.println("Operator tidak valid");
                break;
        }

        if(validation == true)
        {
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil );
        }
    }
}
