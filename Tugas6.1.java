package Tugas6;

import java.util.Arrays;

public class MainClass {

    static Manusia manusia[];
    static Manajer manajer[];
    static Pekerja pekerja[];
    static MahasiswaFilkom mahasiswa[];

    public static void main(String[] args) {

       
        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        System.out.println("=================================================");
        manusia[0] = new Manusia("Tama", "215150707111028", true, false);
        manusia[1] = new Manusia("Fira", "215034670723", false, true);
        manusia[2] = new Manusia("Ridho", "215160987656", true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        
        mahasiswa = new MahasiswaFilkom[3];
        System.out.println(" Class Mahasiswa ");
        System.out.println("=================================================");
        mahasiswa[0] = new MahasiswaFilkom("205150606112002", 3.6, "Uyi", "199825029106", false, true);
        mahasiswa[1] = new MahasiswaFilkom("195150209113019", 3.7, "Rollyta", "2002875436548", false, false);
        mahasiswa[2] = new MahasiswaFilkom("215150707111028", 3.9, "Tanziil Aziizil", "2003574589654", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        
        pekerja = new Pekerja[3];
        System.out.println(" Class Pekerja ");
        System.out.println("=================================================");
        pekerja[0] = new Pekerja(8, 22, "195102439283", "Rasendry", "351717969092", true, true);
        pekerja[1] = new Pekerja(9, 28, "204325829957", "Salwa", "160422090876", false, true);
        pekerja[2] = new Pekerja(6, 30, "403257291648", "Adit Rahadian", "204567896543", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

       
        manajer = new Manajer[3];
        System.out.println(" Class Manager ");
        System.out.println("=================================================");
        manajer[0] = new Manajer(1500, 9, 20, "204837283728", "Hertina", "351707384392", false, false);
        manajer[1] = new Manajer(1200, 7, 25, "306225829106", "Faiz", "208745636236", true, true);
        manajer[2] = new Manajer(1450, 8, 26, "605225929106", "Ojan", "203475135113", true, false);
        System.out.println(manajer[0].toString());
        System.out.println(manajer[1].toString());
        System.out.println(manajer[2].toString());

        
        System.out.println(" Total Keseluruhan yang Terdaftar ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manajer : " + manajer.length);
    }
}