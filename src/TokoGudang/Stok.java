package TokoGudang;

import java.util.Scanner;

public class Stok {
    public static void main(String[] args) {
        //declare variable
        String nama_user, nama_barang;
        int jumlah_barang;
        double harga_jual, harga_beli;

        //scanner
        Scanner input = new Scanner(System.in);

        //input nama user
        System.out.print("Masukkan nama anda :");
        nama_user = input.nextLine();

        //welcome message
        System.out.println("Stock  Gudang Input Barang ");
        System.out.println("###########################");

        System.out.print("Welcome, " + nama_user + " !!");


        //input nama barang
        System.out.print("\nMasukkan nama barang :");
        nama_barang = input.nextLine();

        //input jumlah barang
        System.out.print("Masukkan jumlah barang :");
        jumlah_barang = input.nextInt();

        //input harga beli
        System.out.print("Masukkan harga beli barang :");
        harga_beli = input.nextDouble();

        //input harga jual
        System.out.print("Masukkan harga jual barang :");
        harga_jual = input.nextDouble();

        //tampilan akhir
        System.out.println("\n\nStock gudang rincian barang");
        System.out.println("##############################");
        System.out.println("Nama Barang :" + nama_barang);
        System.out.println("Jumlah Barang :" + jumlah_barang);
        System.out.println("Harga Beli :" + String.format("%.02f", harga_beli));
        System.out.println("Harga Jual :" + String.format("%.02f", harga_jual));

        //final message
        System.out.println("Terima Kasih, sampai jumpa kembali,"+ nama_user +" !!!"  );

    }

}
