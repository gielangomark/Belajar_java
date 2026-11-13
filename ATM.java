import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        int saldoAwal = 100000;
        

        while (running) {

            System.out.println("Silahkan pilih menu yang ada di bawah ini (1/2/3/4)");
            System.out.println("========================");
            System.out.println("1.Cek saldo");
            System.out.println("2.Setor uang");
            System.out.println("3.Tarik Uang ");
            System.out.println("4.Cancel");
            System.out.println("========================");
            String pilihan = in.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("Cetak saldo");
                    System.out.println("Saldo anda saat ini : Rp. " + saldoAwal);
                    break;
                case "2":
                    Scanner setorScan = new Scanner(System.in);
                    boolean saldoValid = false;
                    while (saldoValid == false) {
                        System.out.println("Masukan jumlah setoran yang diinginkan : ");
                        int setoran = setorScan.nextInt();

                        if (setoran < 50000) {
                            System.out.println("Minimal setoran 50.000");
                        }
                        else if (setoran > 1000000) {
                            System.out.println("Setoran maksimal Rp.1.000.000");
                        }
                        else{
                            saldoAwal = saldoAwal + setoran;
                            System.out.println("Saldo anda sekarang adalah " + saldoAwal);
                            saldoValid = true;
                        }
                    }
                    break;
                     case "3":
                    Scanner tarikScanner = new Scanner(System.in);
                    boolean tarikvalid = false;
                    while (tarikvalid == false) {
                        System.out.println("Masukan jumlah yang ingin ditarik");
                        int jumlahTarik = tarikScanner.nextInt();

                        if (jumlahTarik % 50000 != 0) {
                            System.out.println("Penarikan harus kelipatan Rp.50.000");
                        }
                        else if (jumlahTarik < 50000) {
                            System.out.println("Minimal penarikan Rp.50.000");
                        }
                        else if (jumlahTarik > saldoAwal) {
                            System.out.println("Saldo anda tidak mencukupi");
                        }
                        else{
                            saldoAwal = saldoAwal - jumlahTarik;
                            System.out.println("Saldo anda sekarang Rp." + saldoAwal);
                            tarikvalid = true;
                        }
                    }
                    break;
                 case "4":
                    System.out.println("Anda keluar dari sistem");
                    running = false;
                    break;
            
                default:
                    System.out.println("Pilihan anda tidak valid");
                    break;
            }
        }
    }
}
