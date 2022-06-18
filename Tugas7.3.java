package Tugas7;

public class PegawaiHarian extends Pegawai{

    private int totalJam;
    private double upahPerJam;

    
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {

        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }


    public double getUpahPerJam() {
        return upahPerJam;
    }


    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }


    public int getTotalJam() {
        return totalJam;
    }


    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji(){
        
        double gaji;

        if (getTotalJam() <= 40) {
            gaji = getUpahPerJam() * getTotalJam();
        }else {
            gaji = (getUpahPerJam() * 40) + ((getTotalJam() - 4) * getUpahPerJam() * 1.5); 
        }

        return gaji;
    }

    @Override
    public String toString(){
        System.out.println("-------------------------------");
        System.out.println("Pegawai Harian  : " + getNama());
        System.out.println("No. KTP         : " + getNoKTP());
        System.out.println("Upah/Jam        : Rp " + gaji()/getTotalJam());
        System.out.println("Total Jam Kerja : " + (double)getTotalJam());
        System.out.println("Pendapatan      : Rp " + (int)gaji());
        return " ";
    }


}
