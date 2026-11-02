import java.util.Scanner;;
public class Calculator {
    public static void main(String[] args) {
        Scanner yhy = new Scanner(System.in);
        int hasil = 0;
        System.out.println("Input angka pertama");
        int angkaSatu = yhy.nextInt();
        System.out.println("Input angka kedua");
        int angkaKedua = yhy.nextInt();
        System.out.println("input operator");
        String operatoString =yhy.next();

        switch (operatoString) {
            case "+":
                hasil = angkaSatu + angkaKedua;
                break;

                case "-":
                    hasil = angkaSatu - angkaKedua;
                    break;

                case "*" :
                    hasil = angkaSatu * angkaKedua;
                    break;

                case "/" :
                    hasil = angkaSatu / angkaKedua;

        
            default:
                System.out.println("operator tidak valid");
                break;
        }
           System.out.println(angkaSatu + " " + operatoString + " " + angkaKedua + " = " + hasil);

        }
}
