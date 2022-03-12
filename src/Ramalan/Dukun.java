package Ramalan;

import java.util.Scanner;

import static java.lang.Math.random;

public class Dukun {
    public static void main(String[] args) {
        String nama_user, nama_pasangan;
        int umur_pasangan, random_num, umur_user;
        double nilai_kecocokan;

        //membuat scanner
        Scanner input = new Scanner(System.in);

        //Welcome Message
        System.out.println("Selamat Datang di Ralaman Aca Aca Duar");
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        //Data awal
        System.out.print("\nMasukkan Data Anda");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("\nMasukkan Nama Anda : ");
        nama_user = input.nextLine();
        System.out.print("\nMasukkan Umur Anda : ");
        umur_user = input.nextInt();
        System.out.println();
        input.nextLine();

        System.out.println("\nMasukkan Data Pasangan Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("\nMasukkan Nama Pasangan Anda");
        nama_pasangan = input.nextLine();
        System.out.println("Masukkan Umur Pasangan Anda");
        umur_pasangan = input.nextInt();
        System.out.println();

        //Calculating Matches
        System.out.print("\nTekan enter untuk melihat hasil... ");
        try
        {
            System.in.read();
            random_num = (int) ((random() * (100 - 50)) + 50);
            nilai_kecocokan=random_num/1.1;
            String final_matches = String.format("%.02f",nilai_kecocokan);
            System.out.println("\n"+nama_user+" ["+umur_user+"] tahun");
            System.out.println(" ♥♥♥♥    ♥♥♥♥ ");
            System.out.println(" ♥♥♥♥♥,,♥♥♥♥♥ ");
            System.out.println(" ♥♥♥♥♥♥♥♥♥♥♥ ");
            System.out.println("  ♥♥♥♥♥♥♥♥♥ ");
            System.out.println("    ♥♥♥♥♥♥ ");
            System.out.println("      ♥♥♥ ");
            System.out.println("\n"+nama_pasangan+" ["+umur_pasangan+"] tahun");

            System.out.println("Tingkat Kecocokan Anda Dengan Pasangan Anda : "+ final_matches+" %");


        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }

        

    }
}
