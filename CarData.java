package Pemlan;

import java.util.ArrayList;

public class CarData {
    
    ArrayList<Car> carList;

   public CarData() {
       carList = new ArrayList<Car>();
   }

   public void addCar(String carType, String polNum, String merk) {
       carList.add(new Car(carType, polNum, merk));
   }

   public void listOfCar() {
       System.out.println("------------------------------");
       System.out.println("DAFTAR MOBIL");
       System.out.println("------------------------------");
       for (Car Ni : carList) {
           System.out.print("TIPE MOBIL : " + Ni.getCarType());
           System.out.println();
           System.out.print("No. POLISI : " + Ni.getPolNum());
           System.out.println();
           System.out.print("MERK MOBIL : " + Ni.getMerk());
           System.out.println();
           System.out.println("------------------------------");
       }
   }
}