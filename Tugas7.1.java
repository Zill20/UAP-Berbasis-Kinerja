package Tugas7;

import java.util.ArrayList;

public class MainClass{
    public static void main(String[] args) {

        
        Pegawai peg1 = new PegawaiTetap("Wahyu", "258756468790", 2000000);
        Pegawai peg2 = new PegawaiTetap("Marauli", "256787453409", 1750000);
        Pegawai peg3 = new PegawaiTetap("Yusuf", "254567987523", 1500000);
       
        
    
        Pegawai peg4 = new PegawaiHarian("Tegar", "358976454324", 8500, 40);
        Pegawai peg5 = new PegawaiHarian("Rafly", "357596857904", 7000, 32);
        Pegawai peg6 = new PegawaiHarian("Dzaky", "359747632569", 9000, 34);
 
        
        
        Pegawai peg7 = new Sales("Uyi", "294685690874", 75, 50000);
        Pegawai peg8 = new Sales("Lita", "290896512785", 60, 60000);
        Pegawai peg9 = new Sales("Yanti", "290974352418", 55, 65000);

        ArrayList <Pegawai> list = new ArrayList<Pegawai>();
        
        list.add(peg1);
        list.add(peg2);
        list.add(peg3);
        list.add(peg4);
        list.add(peg5);
        list.add(peg6);
        list.add(peg7);
        list.add(peg8);
        list.add(peg9);

        for(Pegawai i : list){
            i.toString();
        }

        System.out.println();
        System.out.println("NAMA    : Tanziil Aziizil Ali");
        System.out.println("NIM     : 215150707111028\n");
        
}
    
}
