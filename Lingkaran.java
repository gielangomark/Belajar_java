public class Lingkaran {
    public static void main(String[] args) {
        int jariJari = 0;
        double phi = 0;
        double luas = 0;
        double keliling = 0;

        jariJari = 32;
        phi = 3.14;

        luas = phi * jariJari * jariJari;
        keliling = 2 * phi * jariJari;

        System.out.println("Luas Lingkarannya Adalah " + luas);
        System.out.println("Keliling Lingkarannya Adalah " + keliling);
    }
}
