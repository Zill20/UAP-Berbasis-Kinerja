package Pemlan;

import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> rentData;

    public RentArchive() {
        rentData = new ArrayList<CarRent>();
    }

    public void Rent(CarRider rider, Car car, int rentDur) {

    if (car.isStatus() == true) {

            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
    }
    }

    public void info() {
        System.out.println("----------------------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("----------------------------------");
        for (CarRent Ni : rentData) {

            System.out.println("NAMA PEMINJAM : " + Ni.getRider().getName());
            System.out.println("TIPE MOBIL    : " + Ni.getCar().getCarType());
            System.out.println("NO. POLISI    : " + Ni.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + Ni.getRentDur());
            System.out.println("----------------------------------");
        }

    }

}



