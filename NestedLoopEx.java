import java.util.Scanner;
public class NestedLoopEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Row");
        int row_user = in.nextInt();
        System.out.println("Masukan Kolom nya");
        int col_user = in.nextInt();
        for(int row = 1; row <= row_user; row++){
            for(int col = 1; col <= col_user; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
