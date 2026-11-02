import java.util.Scanner;
public class Pasar {
    public static void main(String[] args) {
        Scanner aja = new Scanner(System.in);
        int totalHargaApel = 0;
        int totalHargaIkan = 0;
        int jumlahIkan = 0;
        int jumlahApel = 0;
        int hargaAwal = 0;
        int hargaDiskon = 0;
        int hargaAkhir = 0;

        jumlahIkan = 6;
        jumlahApel = 4;

        
        totalHargaIkan = jumlahIkan * 10000;
        totalHargaApel = jumlahApel * 4000;
        hargaAwal = totalHargaIkan + totalHargaApel;

        if(jumlahIkan > 5)
        {
            hargaDiskon = hargaAwal - 5000;
        }
        else
        {
            hargaAkhir = hargaAwal;
        }

        hargaAkhir = hargaDiskon;

        System.out.println("Total harga seluruh belanjaan = " + hargaAkhir);
    }
}
