package Tugas8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MainClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Selamat datang di Game Defend FILKOM !");
        System.out.print("Masukkan nama player : ");
        String nama = input.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan: ");
        System.out.println("1. Magician\n2. Healer\n3. Warrior");
        System.out.print("Masukkan pilihan: ");
        int pilih = 0;
        boolean _isTrue = false;

        do {
            try {
                pilih = input.nextInt();
                if (pilih > 0 && pilih < 4) {
                    _isTrue = true;
                } else {
                    System.out.println("Tolong Masukkan angka !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tolong Masukkan angka !");
                input.nextLine();
            }

        } while (!_isTrue);

        ArrayList<Character> hero = new ArrayList<>();

        switch (pilih) {
            case 1:
                hero.add(new Magician());
                break;
            case 2:
                hero.add(new Healer());
                break;
            case 3:
                hero.add(new Warrior());
                break;
            default:
                break;
        }

        hero.add(new Titan());

        System.out.println("Selamat datang " + nama);
        Class karakter = hero.get(0).getClass();

        System.out.println("------------ STATUS PLAYER -------------");
        info(hero.get(0));
        System.out.println("------------- STATUS MUSUH -------------");
        info(hero.get(1));

        System.out.println();

        int i = 1;
        do {
            System.out.println("============= Turn " + i + " =============");
            if(i%2 == 0){
                if (hero.get(0) instanceof Healer) {
                System.out.println("Menggunakan skill Heal.");
                ((Healer) hero.get(0)).heal();
                }
            }
            
            if (hero.get(0).attack()) {
                
                hero.get(1).receiveDamage(hero.get(0).getAttack());
            }
            
            if (hero.get(1).attack()) {
                
                hero.get(0).receiveDamage(hero.get(1).getAttack());
            }
            
            System.out.printf("%-20s: %d%n", nama + " HP", hero.get(0).getHP());
            System.out.printf("%-20s: %d%n", "Enemy's HP", hero.get(1).getHP());
            System.out.println("");
            i++;
            
        } while (hero.get(0).getHP() != 0 && hero.get(1).getHP() != 0);
        
        System.out.println("----------------------------------------");
        if (hero.get(0).getHP() == 0) {
            System.out.println(nama + " Kalah");
        } else {
            System.out.println(nama + " Menang");
        }

        System.out.println("============= STATUS PLAYER =============");
        info(hero.get(0));
        System.out.println("============= STATUS MUSUH ==============");
        info(hero.get(1));
    }

    static void info(Character hero) {
        Class role = hero.getClass();
        System.out.printf("%-20s: %s%n", "Role", role.getSimpleName());
        hero.info();
    }
}
