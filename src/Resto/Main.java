package totalpembelian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int jumlah_orang;
        String nama_pemesan;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Selamat siang...");

        //System.out.println("");

        System.out.print("\npesan untuk berapa orang : ");
        jumlah_orang = Integer.parseInt(keyboard.nextLine());

        System.out.println("");

        System.out.print("\npesan atas nama          : ");
        nama_pemesan = keyboard.nextLine();

        System.out.println("");

        System.out.println("Menu Spesial Hari Ini");
        System.out.println("=====================");

        System.out.println("");

        double harga_nasigorengspesial=9999.99;
        double harga_ayambakarspesial=12345.67;
        double harga_steaksirloinspesial=21108.40;
        double harga_kwetiawsiramspesial=13579.13;
        double harga_kambinggulingspesial=98765.43;

        System.out.println("   1. Nasi Goreng Spesial            @ Rp.  " + String.format("%.2f",harga_nasigorengspesial));
        System.out.println("   2. Ayam Bakar Spesial             @ Rp.  " + String.format("%.2f",harga_ayambakarspesial));
        System.out.println("   3. Steak Sirloin Spesial          @ Rp.  " + String.format("%.2f",harga_steaksirloinspesial));
        System.out.println("   4. Kwetiaw Siram Spesial          @ Rp.  " + String.format("%.2f",harga_kwetiawsiramspesial));
        System.out.println("   5. Kambing Guling Spesial         @ Rp.  " + String.format("%.2f",harga_kambinggulingspesial));

        //System.out.println("");

        System.out.println("\nPesanan Anda [batas pesanan 0-10 poin]");

        int jumlah_nasigorengspesial;
        System.out.print("1. Nasi Goreng Spesial      = " );
        jumlah_nasigorengspesial = Integer.parseInt(keyboard.nextLine());

        int jumlah_ayambakarspesial;
        System.out.print("2. Ayam Bakar Spesial       = " );
        jumlah_ayambakarspesial = Integer.parseInt(keyboard.nextLine());

        int jumlah_steaksirloinspesial;
        System.out.print("3. Steak Sirloin Spesial    = " );
        jumlah_steaksirloinspesial = Integer.parseInt(keyboard.nextLine());

        int jumlah_kwetiawsiramspesial;
        System.out.print("4. Kwetiaw Siram Spesial    = " );
        jumlah_kwetiawsiramspesial = Integer.parseInt(keyboard.nextLine());

        int jumlah_kambinggulingspesial;
        System.out.print("5. Kambing Guling Spesial   = " );
        jumlah_kambinggulingspesial = Integer.parseInt(keyboard.nextLine());

        //System.out.println("");
        //System.out.println("");

        System.out.println("\n\nSilahkan menikmati makanan anda...");

        //System.out.println("");

        System.out.println("\nPembelian :" );

        double hasil_jumlah_nasigorengspesial = harga_nasigorengspesial*jumlah_nasigorengspesial;
        double hasil_jumlah_ayambakarspesial = harga_ayambakarspesial*jumlah_ayambakarspesial;
        double hasil_jumlah_steaksirloinspesial = harga_steaksirloinspesial*jumlah_steaksirloinspesial;
        double hasil_jumlah_kwetiawsiramspesial = harga_kwetiawsiramspesial*jumlah_kwetiawsiramspesial;
        double hasil_jumlah_kambinggulingspesial = harga_kambinggulingspesial*jumlah_kambinggulingspesial;

        System.out.println("1. Nasi Goreng Spesial     " + jumlah_nasigorengspesial + " porsi * Rp. " + String.format("%.2f",harga_nasigorengspesial) + "      = Rp. " + String.format("%.2f",hasil_jumlah_nasigorengspesial));
        System.out.println("2. Ayam Bakar Spesial      " + jumlah_ayambakarspesial + " porsi * Rp. " + String.format("%.2f",harga_ayambakarspesial) + "     = Rp. " + String.format("%.2f",hasil_jumlah_ayambakarspesial));
        System.out.println("3. Steak Sirloin Spesial   " + jumlah_steaksirloinspesial + " porsi * Rp. " + String.format("%.2f",harga_steaksirloinspesial) + "     = Rp. " + String.format("%.2f",hasil_jumlah_steaksirloinspesial));
        System.out.println("4. Kwetiaw Siram Spesial   " + jumlah_kwetiawsiramspesial + " porsi * Rp. " + String.format("%.2f",harga_kwetiawsiramspesial) + "     = Rp. " + String.format("%.2f",hasil_jumlah_kwetiawsiramspesial));
        System.out.println("5. Kambing Guling Spesial  " + jumlah_kambinggulingspesial + " porsi * Rp. " + String.format("%.2f",harga_kambinggulingspesial) + "     = Rp. " + String.format("%.2f",hasil_jumlah_kambinggulingspesial));
        System.out.println("=================================================================== +");

        double total = hasil_jumlah_nasigorengspesial+hasil_jumlah_ayambakarspesial+hasil_jumlah_steaksirloinspesial+hasil_jumlah_kwetiawsiramspesial+hasil_jumlah_kambinggulingspesial;

        System.out.println("Total Pembelian                                       = Rp. " + String.format("%.2f",total));

        double diskon= total*10/100;
        total= total-diskon;

        System.out.println("Disc 10% <Masa Promosi>                               = Rp.  " + String.format("%.2f", diskon));
        System.out.println("=================================================================== -");

        System.out.println("Total Pembelian setelah diskon 10%                    = Rp. " + String.format("%.2f", total));

        double total_perorang = total/jumlah_orang;

        System.out.println("Pembelian per orang <untuk " + jumlah_orang + " orang>                   = Rp. " + String.format("%.2f",total_perorang));

        //System.out.println("");

        System.out.println("\n                 Terimakasih atas kunjungan anda...");
        System.out.println("                   ...Tekan ENTER untuk keluar...");
        try{System.in.read();}
        catch(Exception e){}

    }

}
