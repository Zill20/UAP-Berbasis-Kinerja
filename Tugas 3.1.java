package Pemdasss;
import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a;
        int b;
        
        System.out.println("Jaket yang tersedia : ");
        System.out.println("Jaket A dengan harga 100000");
        System.out.println("Jaket B dengan harga 125000");
        System.out.println("Jaket C dengan harga 175000");
        System.out.print("Jaket yang akan anda beli bertipe : ");
        a = scan.nextLine();
        System.out.print("Jumlah jaket yang akan anda beli adalah : ");
        b = scan.nextInt();
        scan.nextLine();
        
        Jaket jaket = new Jaket(a, b);
        jaket.display();
    }
    
}
