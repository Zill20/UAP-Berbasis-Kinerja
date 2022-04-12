package Pemdasss;

public class Jaket {

    String jenis;
    int harga;
    int jumlah;

    final int jaketa = 100000;
    final int jaketb = 125000;
    final int jaketc = 175000;

    public Jaket(int a, int b) {
    }

    public Jaket (String a, int b) {
        this.jenis = a;
        this.jumlah = b;
    }

    void hargaa() {
        if (this.jumlah >= 100) {
            this.harga = this.jaketa - 5000;
        } else {
            this.harga = this.jaketa;
        }
    }

    void hargab() {
        if (this.jumlah >= 100) {
            this.harga = this.jaketb - 5000;
        } else {
            this.harga = this.jaketb;
        }
    }

    void hargac() {
        if (this.jumlah >= 100) {
            this.harga = this.jaketc - 15000;
        } else {
            this.harga = this.jaketc;
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a")) {
            hargaa();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargab();
        } else if (jenis.equalsIgnoreCase("c")) {
            hargac();
        }

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);

    }
}
