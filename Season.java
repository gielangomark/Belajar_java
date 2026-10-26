import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahHari = 0;
        String musim = "";

        System.out.println("Masukan angka");
        int month = in.nextInt();
        System.out.println("Masukan hari");
        jumlahHari = in.nextInt();

        //logikbulan
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 
            || month == 12)
            {
                jumlahHari = 31;
            }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
           jumlahHari = 30;
        }
        else if (month == 2)
        {
            jumlahHari = 28;
        }
        else {
            System.out.println("Error");
        }
        
        //logika musimnya
        if(month == 1 || month == 2 || month ==3)
        {
           musim = "Winter";
        }
        else if(month == 4 || month ==5 || month == 6)
        {
            musim = "Spring";
        }
        else if(month == 7 || month ==8 || month == 9)
        {
            musim = "Summer";
        }
        else{
            musim = "Fall";
        }
        
        //logika penentuannya
        if(month%3 == 0 && jumlahHari >= 21)
        {
            if(musim.equals("Winter"))
            {
                musim = "Spring";
            }
            else if(musim.equals("Spring"))
            {
                musim = "Summer";
            }
             else if(musim.equals("Summer"))
            {
                musim = "Fall";
            }
            else {
                musim = "Winter";
            }
        }

        System.out.println("Sekarang adalah musim " + musim);
    }
}
