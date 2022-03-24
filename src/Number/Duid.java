package Number;

import java.util.Scanner;

public class Duid {
    public static void main(String[] args) {
        int angka;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka antara 1-100 : ");
        angka = input.nextInt();
        if (angka % 2 == 1) {
            System.out.println("AJAIB");
        } else {
            if (angka >= 2 && angka <= 5) {
                System.out.println("TIDAK AJAIB");
            } else if (angka >= 6 && angka <= 20) {
                System.out.println("AJAIB");
            } else {
                System.out.println("TIDAK AJAIB");
            }

        }
    }
}