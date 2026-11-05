public class NestedLoop3 {
    public static void main(String[] args) {
        System.out.println("Soal 3.A");
        for(int row = 1; row <=3; row++){
            for(int col = 1; col <= 5; col++){
                if (col %2 == 1) {
                    System.out.print(" _ ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("Soal3.B");
        for(int row =1; row <= 5; row++){
            for(int col = 1; col <= 5; col++){
                if(row %2 == 1){
                    if(col %2 == 1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(row %2 == 0){
                    if (col %2 == 1) {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    
                }
            }
             System.out.println();
        }
           
    }
}
