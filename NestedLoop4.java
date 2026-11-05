public class NestedLoop4 {
    public static void main(String[] args) {
        System.out.println("No 4.A");
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5; col++){
                if (col <= row) {
                    System.out.print("* ");
                } 
                else if(row >= col){
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

        System.out.println("No.4.B");
        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= 5; col++){
                if (col <= row) {
                    System.out.print(col);
                } 
                else if(row >= col){
                    System.out.print(row);
                }
            }
        System.out.println();
        }
    }
}
