package Tugas7;

  public class Pegawai {

    private String noKTP;
    private String nama;
    
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNoKTP() {
        return noKTP;
    }


    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String toString(){
        return " ";
    }

    public double gaji(){
        return 0.0;
    }
}
