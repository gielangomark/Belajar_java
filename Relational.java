public class Relational {
    public static void main(String[] args) {
       int x = 25;
       int y = 13;

       boolean samaDengan = (x == y);
       boolean tidakSamaDengan = (x != y);
       boolean lebihBesar = (x > y);
       boolean lebihBesarSamaDengan = (x >= y);
       boolean lebihkecil = (x < y);
       boolean lebihKecilSamaDengan = (x <= y);

       System.out.println(samaDengan);
       System.out.println(tidakSamaDengan);
       System.out.println(lebihBesar);
       System.out.println(lebihBesarSamaDengan);
       System.out.println(lebihkecil);
       System.out.println(lebihKecilSamaDengan);
    }
}
