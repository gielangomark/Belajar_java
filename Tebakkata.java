import java.util.Scanner;
public class Tebakkata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    String jawabanBenar = "Es teh";
    System.out.println("Apa minuman yang biasa gielang beli");
    String  jawaban = in.nextLine();

    if(jawaban.equalsIgnoreCase(jawabanBenar))
    {
        System.out.println("Jawaban Anda benar");
    }
    else {
        System.out.println("Jawaban Anda salah");
    }
    }
}
