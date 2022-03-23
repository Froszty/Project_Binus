/*
3.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class KonversiMataUang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variable input jumlah yang ingin dikonversi
        double jmlKonversi;
        int pilihan;

        //asumsi rupiah ke kurs
        double rpToYen = 0.0082;
        double rpToRinggit =  0.00029;
        double rpToSGD =  0.000095;
        double rpToYuan = 0.00044;

        //asumsi kurs to rupiah
        double yenToRp = 2259.07;
        double ringgitToRp = 3412.76;
        double SGDToRp = 10505.33;
        double yuanToRp = 2259.17;

        System.out.println("Konversi Kurs Mata Uang");
        System.out.println("--------------------------------");
        System.out.println("Yen | Ringgit | SGD | Yuan");
        System.out.println("--------------------------------");
        System.out.println("      Menu Konversi         ");
        System.out.println("1. Rupiah to Other Currency ");
        System.out.println("2. Other Currency to Rupiah ");
        System.out.print("\nMasukkan Pilihan Anda [1/2]: ");
        pilihan = input.nextInt();
        System.out.print("\nMasukkan Jumlah yang ingin dikonversi: ");
        jmlKonversi = input.nextDouble();

        //output
        if (pilihan == 1) {
            System.out.println("Hasil Konversi");
            System.out.println("------------------------------------------------");
            System.out.println(jmlKonversi + " Rupiah = " + String.format("%.2f",jmlKonversi*rpToYen) + " Ұ (Yen Jepang)");
            System.out.println(jmlKonversi + " Rupiah = " + String.format("%.2f",jmlKonversi*rpToRinggit) + " RM (Ringgit Malaysia)");
            System.out.println(jmlKonversi + " Rupiah = " + String.format("%.2f",jmlKonversi*rpToSGD) + " S$ (Dollar Singapura)");
            System.out.println(jmlKonversi + " Rupiah = " + String.format("%.2f",jmlKonversi*rpToYuan) + " ¥ (Yuan Tiongkok)");
        } else {
            System.out.println("Hasil Konversi");
            System.out.println("------------------------------------------------");
            System.out.println(jmlKonversi + " Ұ (Yen Jepang) = " + String.format("%.2f",jmlKonversi*yenToRp) + " Rupiah");
            System.out.println(jmlKonversi + " RM (Ringgit Malaysia) = " + String.format("%.2f",jmlKonversi*ringgitToRp) + " Rupiah");
            System.out.println(jmlKonversi + " S$ (Dollar Singapura) = " + String.format("%.2f",jmlKonversi*SGDToRp) + " Rupiah");
            System.out.println(jmlKonversi + " ¥ (Yuan Tiongkok) = " + String.format("%.2f",jmlKonversi*yuanToRp) + " Rupiah");
        }

    }
}
