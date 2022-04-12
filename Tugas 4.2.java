

import java.util.Scanner;

public class MainMerchant {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        System.out.println("Nama    :Tanziil Aziizil Ali");
        System.out.println("Nim     :215150707111028");
        DataMerchant.tampilData();
        System.out.println();


        System.out.println("===Memasukkan Data Merchant Melalui Input===");
        System.out.print("Input Nama Merchant : ");
        String nm = input.nextLine();
        System.out.print("Input Nama Produk : ");
        String np = input.nextLine();
        System.out.print("Input Harga Produk : ");
        double h = input.nextDouble();
        input.nextLine();

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(nm, np, h));
        System.out.println();

        System.out.println("===Menampilkan Data Merchant===");
        DataMerchant.tampilData();
        System.out.println();

      
        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"), "Bakso Pak Sahid", "Bakso Mercon", 15000);

        
        System.out.println("===Menampilkan Data Merchant yang nilainya sudah di update===");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"));

        System.out.println();
        System.out.println("Nama    :Tanziil Aziizil Ali");
        System.out.println("Nim     :215150707111028");



    }
}
