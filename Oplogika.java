public class Oplogika {
    public static void main(String[] args) {
        int a = 25;
        int b = 13;

        boolean hasilAnd;
        hasilAnd = (a<b) && (a!=b);

        boolean hasilOr;
        hasilOr = (a<b) || (a!=b);

        boolean hasilNotAnd;
        hasilNotAnd = !((a<b) && (a!=b));

        System.out.println(hasilAnd);
        System.out.println(hasilOr);
        System.out.println(hasilNotAnd);
    }
}
