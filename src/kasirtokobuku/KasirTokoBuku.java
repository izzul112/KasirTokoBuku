/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirtokobuku;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KasirTokoBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h1 = 2000, h2 = 3000, h3 = 5000;

        String nama_barang, kode;
        double harga_barang, diskon, total_harga, harga = 0;
        int jumlah_barang;

        System.out.println("Nama Barang: ");
        nama_barang = scan.next();

        System.out.println("Kode Barang: ");
        kode = scan.next();

        System.out.println("Harga Barang: ");
        harga_barang = scan.nextDouble();

        System.out.println("Jumlah Barang: ");
        jumlah_barang = scan.nextInt();

        total_harga = (int) (harga_barang * jumlah_barang);
        System.out.println("HARGA: " + total_harga);

        if (total_harga >= 500000) {
            diskon = total_harga * 50 / 100;
            total_harga = total_harga - diskon;
            System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
        } else if (total_harga > 200000) {
            diskon = total_harga * 20 / 100;
            total_harga = total_harga - diskon;
            System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
        } else if (total_harga >= 100000) {
            diskon = total_harga / 10 / 100;
            total_harga = total_harga - diskon;
            System.out.println("Total Harga Setelah di Diskon: Rp" + total_harga);
        } else if (total_harga <= 100000) {

            diskon = total_harga * 1;
            System.out.println("Total Harga Rp" + total_harga);
        }

    }

}
