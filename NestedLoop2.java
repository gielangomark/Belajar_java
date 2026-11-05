public class NestedLoop2 {
    public static void main(String[] args) {
        System.out.println("2.A");
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print(row);
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("2.B");
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
