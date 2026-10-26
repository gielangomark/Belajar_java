public class Opternary {
    public static void main(String[] args) {
        int x = 25;
        int y = 13;
        String hasilString;
        int hasilInt;

        hasilString = (x < y) ? "x lebih kecil dari y" : "x lebih besar dari y";
        System.out.println(hasilString); 

        hasilInt = (x < y) ? x + y : x - y;
        System.out.println(hasilInt);

    }
}
